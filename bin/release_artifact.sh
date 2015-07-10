#!/bin/sh
#
# This script is needed to deploy to sonatype with maven release plugin
# because the plugin updates scm, and expects pom.xml and src folder
# in master.
#

# exit in case of failure
set -x -e

# Compute version and artifact id
currentVersion=`cat package.json | grep version | tail -1 | sed -e 's,.*: *"\(.*\)".*,\1,'`
artifactId=`cat package.json | grep postinstall | sed -e 's,.*artifactId=\([^ ]*\) .*,\1,'`
[ -z "$currentVersion" -o -z "$artifactId" ] && exit 1

# Verify that we dont have anything to commit and change to master
git diff --quiet || exit 2
git checkout master

# Save current commit id to restore later
currentId=`git log --format="%H" -n 1`

# Remove tag which will create release plugin if already exists
tag=$artifactId-$currentVersion
git tag -d $tag || true
git push origin :refs/tags/$tag || true

# Run script to generate pom and java stuff
rm -rf pom.xml src node_modules pom.xml.releaseBackup release.properties target
npm install

# Commit temporary all java stuff to master
git add pom.xml src >/dev/null
git commit -m 'tmp: Adding stuff needed for releasing library' pom.xml src

# Perform the release, this command is interactive and will prompt for
# version numbers and sign passwords
mvn clean release:prepare release:perform

# New development version is changed by release:prepare
newVersion=`cat pom.xml  | grep /version | grep SNAPSHOT | head -1 | sed -e 's,.*>\(.*\)-SNAPSHOT<.*,\1,'`

# Rollback to current commit and remove all commit generated by maven
git reset --hard $currentId
git push origin master -f

# Change versions in 
[ -z "$newVersion" ] && exit 3
perl -pi -e 's,'$currentVersion','$newVersion',g' package.json readme/pom.xml 
perl -pi -e 's,version>.*</version,version>'$currentVersion'</version,g' README.md

git commit -m 'Update version for next iteration' package.json readme/pom.xml README.md
git push origin master
