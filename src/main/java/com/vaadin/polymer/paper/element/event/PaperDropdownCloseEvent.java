/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the dropdown closes.</p>
 */
@JsType
public interface PaperDropdownCloseEvent extends Event {

    static final String NAME = "paper-dropdown-close";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperDropdownCloseEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperDropdownCloseEvent) event);
        }
    }
}
