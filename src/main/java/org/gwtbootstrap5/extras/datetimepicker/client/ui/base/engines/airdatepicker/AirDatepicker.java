package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.engines.airdatepicker;

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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "AirDatepicker")
public class AirDatepicker {

    // Constructores (acepta un selector CSS o un Elemento DOM)
    public AirDatepicker(Object element) {}
    public AirDatepicker(Object element, AirDatepickerOptions options) {}

    // --- Propiedades ---
    @JsProperty public Object[] selectedDates; // Array de objetos Date
    @JsProperty public Object focusDate;       // Objeto Date
    @JsProperty public String currentView;     // 'days', 'months', 'years'
    @JsProperty public Object viewDate;        // Objeto Date
    @JsProperty public boolean visible;        // Is visible or not
    @JsProperty public Object el;              // Elemento DOM base
    @JsProperty public Object $el;             // Elemento DOM base (si usas jQuery)

    // --- AirDatePicker ---
    @JsMethod public native void update(AirDatepickerOptions options);
    @JsMethod public native void destroy();

    // --- Métodos de la API ---
    @JsMethod public native void show();
    @JsMethod public native void hide();
    @JsMethod public native void next();
    @JsMethod public native void prev();
    
    // date puede ser un Date de Java/JS o un Array de Dates
    @JsMethod public native void clear(ClearDateOptions opts);
    @JsMethod public native void selectDate(Object date);
    @JsMethod public native void selectDate(Object date, SelectDateOptions opts);
    @JsMethod public native void unselectDate(Object date);
    @JsMethod public native void setFocusDate(Object date);
    @JsMethod public native void setFocusDate(Object date, FocusDateOptions opts);

    // DTOs auxiliares para los métodos
    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ClearDateOptions {
        @JsProperty public boolean silent;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class SelectDateOptions {
        @JsProperty public boolean updateTime;
        @JsProperty public boolean silent;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class FocusDateOptions {
        @JsProperty public boolean viewDateTransition;
    }
}
