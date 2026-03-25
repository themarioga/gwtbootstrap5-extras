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

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import elemental2.core.JsArray;
import elemental2.core.JsObject;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TomSelectOptions {

    @JsProperty public JsArray<JsObject> options;
    @JsProperty public JsArray<String> items;

    @JsProperty public String placeholder;
    @JsProperty public String valueField;
    @JsProperty public String labelField;
    @JsProperty public Object searchField; // Can be String or JsArray<String>
    @JsProperty public Object controlInput; // Use Object so we can pass null to disable it
    @JsProperty public String mode;
    @JsProperty public Object maxItems;
    @JsProperty public Object maxOptions;
    
    @JsProperty public boolean create;
    @JsProperty public boolean createOnBlur;
    @JsProperty public boolean hideSelected;
    @JsProperty public boolean closeAfterSelect;

    @JsProperty public Object plugins; // e.g., new String[]{"remove_button", "clear_button"}

    // --- Remote Data Loading ---
    @JsProperty public Object preload;
    @JsProperty public LoadFunction load;

    // The render object holds all your custom HTML templates
    @JsProperty public Object render;

    // Optional: How many milliseconds to wait after the user stops typing before calling load
    @JsProperty public int loadThrottle;
    
    // --- Callbacks / Events ---
    @JsProperty public OnInitializeCallback onInitialize;
    @JsProperty public OnChangeCallback onChange;
    @JsProperty public OnItemAddCallback onItemAdd;
    @JsProperty public OnItemRemoveCallback onItemRemove;
    @JsProperty public OnDropdownStateCallback onDropdownOpen;
    @JsProperty public OnDropdownStateCallback onDropdownClose;

    // --- JsFunction Interfaces for Callbacks ---
    
    @JsFunction
    public interface OnChangeCallback {
        // 'value' can be a String or an array of Strings depending on maxItems
        void onChange(Object value); 
    }

    @JsFunction
    public interface OnItemAddCallback {
        void onItemAdd(String value, JsObject item);
    }

    @JsFunction
    public interface OnItemRemoveCallback {
        void onItemRemove(String value, JsObject item);
    }

    @JsFunction
    public interface OnInitializeCallback {
        void onInitialize();
    }
    // --- JsFunction Interfaces for Loading ---

    /**
     * The function you provide to Tom Select to trigger the fetch.
     */
    @JsFunction
    public interface LoadFunction {
        void load(String query, LoadResultCallback callback);
    }

    /**
     * The callback function Tom Select passes to you.
     * You MUST call this function with your results (or an empty array on error).
     */
    @JsFunction
    public interface LoadResultCallback {
        void onResult(JsArray<Object> results);
    }

    // A reusable interface for both open and close events
    @JsFunction
    public interface OnDropdownStateCallback {
        void onStateChange(Object dropdownElement);
    }

    // --- JsFunction Interface for Render Templates ---

    /**
     * data: A JavaScript object containing the current context (like the search input).
     * escape: A function Tom Select provides to safely escape HTML to prevent XSS.
     */
    @JsFunction
    public interface RenderFunction {
        String render(jsinterop.base.JsPropertyMap<Object> data, Object escape);
    }
}
