/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-dropdown project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;iron-dropdown&gt;</code> is a generalized element that is useful when you have<br>hidden content (<code>.dropdown-content</code>) that is revealed due to some change in<br>state that should cause it to do so.</p>
 * <p>Note that this is a low-level element intended to be used as part of other<br>composite elements that cause dropdowns to be revealed.</p>
 * <p>Examples of elements that might be implemented using an <code>iron-dropdown</code><br>include comboboxes, menubuttons, selects. The list goes on.</p>
 * <p>The <code>&lt;iron-dropdown&gt;</code> element exposes attributes that allow the position<br>of the <code>.dropdown-content</code> relative to the <code>.dropdown-trigger</code> to be<br>configured.</p>
 * <pre><code>&lt;iron-dropdown horizontal-align=&quot;right&quot; vertical-align=&quot;top&quot;&gt;
 *   &lt;div class=&quot;dropdown-content&quot;&gt;Hello!&lt;/div&gt;
 * &lt;/iron-dropdown&gt;
 * 
 * 
 * </code></pre><p>In the above example, the <code>&lt;div&gt;</code> with class <code>.dropdown-content</code> will be<br>hidden until the dropdown element has <code>opened</code> set to true, or when the <code>open</code><br>method is called on the element.</p>
 */
@JsType
public interface IronDropdownElement extends HTMLElement {

    public static final String TAG = "iron-dropdown";
    public static final String SRC = "iron-dropdown/iron-dropdown.html";


    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getCloseAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty void setCloseAnimationConfig(JavaScriptObject value);
  
    /**
     * <p>The element that is contained by the dropdown, if any.</p>
     *
     * JavaScript Info:
     * @method containedElement
     * 
     */
    void containedElement();

    /**
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @property focusTarget
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getFocusTarget();
    /**
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @property focusTarget
     * @type Object
     * 
     */
    @JsProperty void setFocusTarget(JavaScriptObject value);
  
    /**
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty void setHorizontalAlign(String value);
  
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty double getHorizontalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty void setHorizontalOffset(double value);
  
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoAnimations();
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty void setNoAnimations(boolean value);
  
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getOpenAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty void setOpenAnimationConfig(JavaScriptObject value);
  
    /**
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getPositionTarget();
    /**
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    @JsProperty void setPositionTarget(JavaScriptObject value);
  
    /**
     * <p>The orientation against which to align the dropdown content<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the dropdown content<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty void setVerticalAlign(String value);
  
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty double getVerticalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty void setVerticalOffset(double value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);
  
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);
  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
     */
    void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);
  
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTab
     */
    void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTab
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTab
     */
    void registered();

    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @method backdropElement
     * @behavior PaperDialog
     */
    void backdropElement();

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @behavior PaperDialog
     */
    void cancel();

    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getCanceled();
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setCanceled(boolean value);
  
    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperDialog
     */
    void close();

    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty JavaScriptObject getClosingReason();
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty void setClosingReason(JavaScriptObject value);
  
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getNoAutoFocus();
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setNoAutoFocus(boolean value);
  
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getNoCancelOnEscKey();
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setNoCancelOnEscKey(boolean value);
  
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getNoCancelOnOutsideClick();
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setNoCancelOnOutsideClick(boolean value);
  
    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperDialog
     */
    void open();

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setOpened(boolean value);
  
    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperDialog
     */
    void toggle();

    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getWithBackdrop();
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setWithBackdrop(boolean value);
  
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getAutoFitOnAttach();
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setAutoFitOnAttach(boolean value);
  
    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperDialog
     */
    void center();

    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperDialog
     */
    void constrain();

    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperDialog
     */
    void fit();

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty JavaScriptObject getFitInto();
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty void setFitInto(JavaScriptObject value);
  
    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperDialog
     */
    void refit();

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperDialog
     */
    void resetFit();

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    @JsProperty JavaScriptObject getSizingTarget();
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    @JsProperty void setSizingTarget(JavaScriptObject value);
  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    void assignParentResizable(JavaScriptObject parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    void resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    void stopResizeNotificationsFor(JavaScriptObject target);

    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatedPages
     */
    @JsProperty JavaScriptObject getAnimationConfig();
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatedPages
     */
    @JsProperty void setAnimationConfig(JavaScriptObject value);
  
    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    void cancelAnimation();

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty void setEntryAnimation(String value);
  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty void setExitAnimation(String value);
  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatedPages
     */
    void getAnimationConfig(JavaScriptObject type);

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    void playAnimation(JavaScriptObject type, JavaScriptObject cookie);

}
