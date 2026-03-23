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

import elemental2.core.JsDate;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class AirDatepickerCallbacks {

    // --- OnSelect ---
    @JsFunction
    public interface OnSelect {
        void execute(OnSelectProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnSelectProps {
        @JsProperty
        public Object date; // Date o Array de Dates
        @JsProperty
        public String formattedDate; // String o Array de Strings
        @JsProperty
        public AirDatepicker datepicker;
    }

    // --- OnBeforeSelect ---
    @JsFunction
    public interface OnBeforeSelect {
        void execute(OnSelectProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnBeforeSelectProps {
        @JsProperty
        public Object date; // Date o Array de Dates
        @JsProperty
        public AirDatepicker datepicker;
    }

    // --- OnChangeViewDate ---
    @JsFunction
    public interface OnChangeViewDate {
        void execute(OnChangeViewDateProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnChangeViewDateProps {
        @JsProperty
        public int month;
        @JsProperty
        public int year;
        @JsProperty
        public int decade;
    }

    // --- OnChangeView ---
    @JsFunction
    public interface OnChangeView {
        void execute(String view);
    }

    // --- OnRenderCell ---
    @JsFunction
    public interface OnRenderCell {
        RenderCellResult execute(OnRenderCellProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnRenderCellProps {
        @JsProperty
        public Object date; // Date
        @JsProperty
        public String cellType; // 'day', 'month', 'year'
        @JsProperty
        public AirDatepicker datepicker;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class RenderCellResult {
        @JsProperty
        public String html;
        @JsProperty
        public String classes;
        @JsProperty
        public boolean disabled;
    }

    // --- OnShow / OnHide ---
    @JsFunction
    public interface OnShow {
        void execute(boolean isFinished);
    }

    @JsFunction
    public interface OnHide {
        void execute(boolean isFinished);
    }

    // --- OnClickDayName ---
    @JsFunction
    public interface OnClickDayName {
        void execute(OnClickDayNameProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnClickDayNameProps {
        @JsProperty
        public int index; // Index
        @JsProperty
        public AirDatepicker datepicker;
    }

    // --- OnFocus ---
    @JsFunction
    public interface OnFocus {
        void execute(OnFocusProps props);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class OnFocusProps {
        @JsProperty
        public JsDate date; // Date o Array de Dates
        @JsProperty
        public AirDatepicker datepicker;
    }

}
