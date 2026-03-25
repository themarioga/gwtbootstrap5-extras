package org.gwtbootstrap5.extras.datetimepicker.client.ui.engines.tempusdominus;

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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "tempusDominus", name = "DateTime")
public class TempusDominusDateTime {

    @JsConstructor
    public TempusDominusDateTime() {}

    @JsConstructor
    public TempusDominusDateTime(double epochMilliseconds) {}

    @JsConstructor
    public TempusDominusDateTime(Object date) {} // Can pass a JS Date or String

    @JsProperty public int year;
    @JsProperty public int month; // 0-indexed
    @JsProperty public int date;
    @JsProperty public int hours;
    @JsProperty public int minutes;
    @JsProperty public int seconds;

    @JsMethod public native TempusDominusDateTime clone();
    @JsMethod public native String format(String formatString);
    @JsMethod public native boolean isBefore(TempusDominusDateTime other);
    @JsMethod public native boolean isAfter(TempusDominusDateTime other);
    @JsMethod public native boolean isSame(TempusDominusDateTime other);
}
