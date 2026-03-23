package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.engines.tempusdominus;

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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class TempusDominusEvents {
    // Event Names
    public static final String CHANGE = "change.td";
    public static final String UPDATE = "update.td";
    public static final String ERROR = "error.td";
    public static final String SHOW = "show.td";
    public static final String HIDE = "hide.td";

    // Detail object emitted in the 'change.td' CustomEvent
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ChangeEventDetail {
        @JsProperty public TempusDominusDateTime date;      // The newly selected date
        @JsProperty public TempusDominusDateTime oldDate;   // The previously selected date
        @JsProperty public boolean isValid;
    }
    
    // Detail object emitted in the 'error.td' CustomEvent
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ErrorEventDetail {
        @JsProperty public String type;
        @JsProperty public String message;
        @JsProperty public TempusDominusDateTime date;
    }
}
