package org.gwtbootstrap5.extras.datetimepicker.client.ui.engines.airdatepicker;

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

import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AirDatepickerOptions {

    // --- Opciones Generales ---
    @JsProperty public String classes;
    @JsProperty public boolean inline;
    @JsProperty public Object locale; // Object with locales
    @JsProperty public Object startDate; // Date, String or Number
    @JsProperty public int firstDay;
    @JsProperty public int[] weekends;
    @JsProperty public boolean isMobile;
    @JsProperty public String dateFormat; // Ej: 'dd/MM/yyyy'
    @JsProperty public Object altField; // Element or selector (String)
    @JsProperty public String altFieldDateFormat;
    @JsProperty public boolean toggleSelected;
    @JsProperty public boolean keyboardNav;

    // --- Posicionamiento y Vista ---
    @JsProperty public Element container;
    @JsProperty public String position; // Ej: 'bottom left'
    @JsProperty public String view; // 'days', 'months', 'years'
    @JsProperty public String minView;
    @JsProperty public boolean showOtherMonths;
    @JsProperty public boolean selectOtherMonths;
    @JsProperty public boolean moveToOtherMonthsOnSelect;

    // --- Restricciones de Rango ---
    @JsProperty public Object minDate; // Date
    @JsProperty public Object maxDate; // Date
    @JsProperty public boolean disableNavWhenOutOfRange;

    // --- Selección Múltiple y Rangos ---
    @JsProperty public Object multipleDates; // boolean o int (max)
    @JsProperty public String multipleDatesSeparator;
    @JsProperty public boolean range;
    @JsProperty public boolean dynamicRange;

    // --- Botones ---
    @JsProperty public Object buttons; // String (ej: 'clear') o Array de objetos Button
    @JsProperty public String monthsField;
    @JsProperty public String showEvent;
    @JsProperty public boolean autoClose;
    @JsProperty public String prevHtml;
    @JsProperty public String nextHtml;
    @JsProperty public boolean fixedHeight;

    // --- Timepicker ---
    @JsProperty public boolean timepicker;
    @JsProperty public String timeFormat;
    @JsProperty public boolean onlyTimepicker;
    @JsProperty public String dateTimeSeparator;
    @JsProperty public int minHours;
    @JsProperty public int maxHours;
    @JsProperty public int minMinutes;
    @JsProperty public int maxMinutes;
    @JsProperty public int hoursStep;
    @JsProperty public int minutesStep;

    // --- Callbacks ---
    @JsProperty public AirDatepickerCallbacks.OnSelect onSelect;
    @JsProperty public AirDatepickerCallbacks.OnBeforeSelect onBeforeSelect;
    @JsProperty public AirDatepickerCallbacks.OnChangeViewDate onChangeViewDate;
    @JsProperty public AirDatepickerCallbacks.OnChangeView onChangeView;
    @JsProperty public AirDatepickerCallbacks.OnRenderCell onRenderCell;
    @JsProperty public AirDatepickerCallbacks.OnShow onShow;
    @JsProperty public AirDatepickerCallbacks.OnHide onHide;
    @JsProperty public AirDatepickerCallbacks.OnClickDayName onClickDayName;
    @JsProperty public AirDatepickerCallbacks.OnFocus onFocus;
}
