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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TempusDominusOptions {

    @JsProperty public DisplayOptions display;
    @JsProperty public LocalizationOptions localization;
    @JsProperty public RestrictionsOptions restrictions;
    @JsProperty public boolean allowInputToggle;
    @JsProperty public boolean dateRange;
    @JsProperty public boolean debug;
    @JsProperty public Object defaultDate; // DateTime, JsDate, or String
    @JsProperty public boolean keepInvalid;
    @JsProperty public boolean multipleDates;
    @JsProperty public String multipleDatesSeparator;
    @JsProperty public boolean promptTimeOnDateChange;
    @JsProperty public int promptTimeOnDateChangeTransitionDelay;
    @JsProperty public int stepping;
    @JsProperty public boolean useCurrent;

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class RestrictionsOptions {
        @JsProperty public Object minDate; // DateTime, JsDate, or String
        @JsProperty public Object maxDate; // DateTime, JsDate, or String
        @JsProperty public Object[] disabledDates;
        @JsProperty public Object[] enabledDates;
        @JsProperty public int[] daysOfWeekDisabled;
        @JsProperty public Object[] disabledTimeIntervals;
        @JsProperty public Object[] disabledHours;
        @JsProperty public Object[] enabledHours;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class DisplayOptions {
        @JsProperty public String viewMode; // "clock", "calendar", "months", "years", "decades"
        @JsProperty public ComponentsOptions components;
        @JsProperty public ButtonsOptions buttons;
        @JsProperty public IconsOptions icons;
        @JsProperty public boolean inline;
        @JsProperty public boolean keepOpen;
        @JsProperty public String theme; // "light", "dark", "auto"
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ComponentsOptions {
        @JsProperty public boolean calendar;
        @JsProperty public boolean date;
        @JsProperty public boolean month;
        @JsProperty public boolean year;
        @JsProperty public boolean decades;
        @JsProperty public boolean clock;
        @JsProperty public boolean hours;
        @JsProperty public boolean minutes;
        @JsProperty public boolean seconds;
        @JsProperty public boolean useTwentyfourHour;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class ButtonsOptions {
        @JsProperty public boolean today;
        @JsProperty public boolean clear;
        @JsProperty public boolean close;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class IconsOptions {
        @JsProperty public String time;
        @JsProperty public String date;
        @JsProperty public String up;
        @JsProperty public String down;
        @JsProperty public String previous;
        @JsProperty public String next;
        @JsProperty public String today;
        @JsProperty public String clear;
        @JsProperty public String close;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class LocalizationOptions {
        @JsProperty public String locale;
        @JsProperty public String startOfTheWeek;
        @JsProperty public String format;
    }
}
