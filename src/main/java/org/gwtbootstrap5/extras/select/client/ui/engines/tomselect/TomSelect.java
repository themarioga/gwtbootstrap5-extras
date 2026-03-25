package org.gwtbootstrap5.extras.select.client.ui.engines.tomselect;

/*-
 * ==========================LICENSE_START===============================
 * GwtBootstrap5
 * ======================================================================
 * Copyright (C) 2026 GwtBootstrap5
 * ======================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ==========================LICENSE_END=================================
 */

import elemental2.core.JsArray;
import elemental2.dom.Element;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "TomSelect")
public class TomSelect {

    // --- Constructors ---

    public TomSelect(String cssSelector) {}
    public TomSelect(String cssSelector, TomSelectOptions options) {}
    public TomSelect(Element element) {}
    public TomSelect(Element element, TomSelectOptions options) {}

    // --- State Properties ---
    @JsProperty(name = "isOpen")
    public native boolean isOpen();

    // --- API Methods ---

    @JsMethod
    public native void addOption(Object option);

    @JsMethod
    public native void addOptions(JsArray<Object> option);

    @JsMethod
    public native void updateOption(String value, Object option);

    @JsMethod
    public native void removeOption(String value);

    @JsMethod
    public native void clearOptions();

    @JsMethod
    public native void clearOptions(OptionFilterCallback filter);

    @JsMethod
    public native void refreshOptions(boolean triggerDropdown);

    @JsMethod
    public native void addItem(String value);

    @JsMethod
    public native void addItem(String value, boolean silent);

    @JsMethod
    public native void removeItem(String value);

    @JsMethod
    public native void removeItem(String value, boolean silent);

    @JsMethod
    public native void clear();

    @JsMethod
    public native void clear(boolean silent);

    @JsMethod
    public native Object getValue(); // Returns String or Array depending on setup

    @JsMethod
    public native void setValue(String value);

    @JsMethod
    public native void setValue(String[] values);

    @JsMethod
    public native void setValue(String value, boolean silent);

    @JsMethod
    public native void load(String query);

    @JsMethod
    public native void lock();

    @JsMethod
    public native void unlock();

    @JsMethod
    public native void focus();

    @JsMethod
    public native void blur();

    @JsMethod
    public native void enable();

    @JsMethod
    public native void disable();

    @JsMethod
    public native void destroy();

    @JsMethod
    public native void sync();

    @JsMethod
    public native void open();

    @JsMethod
    public native void close();

    @JsMethod
    public native void positionDropdown();

    /**
     * A callback function used to filter which options to keep or remove.
     * Return true to keep the option, false to clear it.
     */
    @JsFunction
    public interface OptionFilterCallback {
        // Tom Select passes the option object to this function
        boolean filter(Object option);
    }

}
