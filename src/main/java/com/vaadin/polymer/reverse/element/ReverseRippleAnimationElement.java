/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.reverse.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;reverse-ripple-animation&gt;</code> scales and transform an element such that it appears to ripple down from this element, to either<br>a shared element, or a screen position.</p>
 * <p>If using as a shared element animation in <code>&lt;neon-animated-pages&gt;</code>, use this animation in an <code>exit</code><br>animation in the source page and in an <code>entry</code> animation in the destination page. Also, define the<br>reverse-ripple elements in the <code>sharedElements</code> property (not a configuration property, see<br><code>Polymer.NeonSharedElementAnimatableBehavior</code>).<br>If using a screen position, define the <code>gesture</code> property.<br>Configuration:</p>
 * <pre><code>{
 *   name: &#39;reverse-ripple-animation`.
 *   id: &lt;shared-element-id&gt;, /* set this or gesture * /
 *   gesture: {x: &lt;page-x&gt;, y: &lt;page-y&gt;}, /* set this or id * /
 *   timing: &lt;animation-timing&gt;,
 *   toPage: &lt;node&gt;, /* define for the destination page * /
 *   fromPage: &lt;node&gt;, /* define for the source page * /
 * }
 * </code></pre>
 */
@JsType
public interface ReverseRippleAnimationElement extends HTMLElement {

    public static final String TAG = "reverse-ripple-animation";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnimationTiming();
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty void setAnimationTiming(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method complete
     * 
     */
    void complete();

    /**
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * 
     */
    void findSharedElements(JavaScriptObject config);

    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * 
     */
    void setPrefixedProperty(JavaScriptObject node, JavaScriptObject property, JavaScriptObject value);

    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSharedElements();
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty void setSharedElements(JavaScriptObject value);
  
    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     */
    void timingFromConfig(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {} config  
     * 
     */
    void configure(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * 
     */
    void registered();

}
