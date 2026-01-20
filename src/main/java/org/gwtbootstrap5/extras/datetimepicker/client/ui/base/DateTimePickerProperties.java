package org.gwtbootstrap5.extras.datetimepicker.client.ui.base;

/*-
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2023 - 2026 GwtBootstrap5
 * %%
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
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import jsinterop.annotations.JsType;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerTheme;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerToolbarPlacement;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerViewMode;

@JsType
public class DateTimePickerProperties {

    private boolean allowInputToggle = false;
    private boolean keepInvalid = false;
    private boolean multipleDates = false;
    private String multipleDatesSeparator = "; ";
    private boolean promptTimeOnDateChange = false;
    private int promptTimeOnDateChangeTransitionDelay = 200;
    private int minuteStepping = 1;
    private boolean debug = false;

    // Display
    private boolean sideBySide = false;
    private boolean calendarWeeks = false;
    private boolean inline = false;
    private boolean allowKeyboardNavigation = true;
    private boolean keepOpen = false;
    private String viewMode = "calendar";
    private String toolbarPlacement = "bottom";
    private String theme = "auto";
    private boolean showTodayButton = false;
    private boolean showClearButton = false;
    private boolean showCloseButton = false;
    private boolean componentDateEnabled = true;
    private boolean componentMonthEnabled = true;
    private boolean componentYearEnabled = true;
    private boolean componentDecadesEnabled = true;
    private boolean componentHoursEnabled = true;
    private boolean componentMinutesEnabled = true;
    private boolean componentSecondsEnabled = false;

    // Restrictions
    private JsDate minDate = null;
    private JsDate maxDate = null;
    //ToDo: DisabledDates
    //ToDo: EnabledDates
    //ToDo: DaysOfWeekDisabled
    //ToDo: DisabledTimeIntervals
    //ToDo: DisabledHours
    //ToDo: EnabledHours

    public boolean getAllowInputToggle() {
        return allowInputToggle;
    }

    public void setAllowInputToggle(boolean allowInputToggle) {
        this.allowInputToggle = allowInputToggle;
    }

    public boolean getKeepInvalid() {
        return keepInvalid;
    }

    public void setKeepInvalid(boolean keepInvalid) {
        this.keepInvalid = keepInvalid;
    }

    public boolean getMultipleDates() {
        return multipleDates;
    }

    public void setMultipleDates(boolean multipleDates) {
        this.multipleDates = multipleDates;
    }

    public String getMultipleDatesSeparator() {
        return multipleDatesSeparator;
    }

    public void setMultipleDatesSeparator(String multipleDatesSeparator) {
        this.multipleDatesSeparator = multipleDatesSeparator;
    }

    public boolean getPromptTimeOnDateChange() {
        return promptTimeOnDateChange;
    }

    public void setPromptTimeOnDateChange(boolean promptTimeOnDateChange) {
        this.promptTimeOnDateChange = promptTimeOnDateChange;
    }

    public int getPromptTimeOnDateChangeTransitionDelay() {
        return promptTimeOnDateChangeTransitionDelay;
    }

    public void setPromptTimeOnDateChangeTransitionDelay(int promptTimeOnDateChangeTransitionDelay) {
        this.promptTimeOnDateChangeTransitionDelay = promptTimeOnDateChangeTransitionDelay;
    }

    public int getMinuteStepping() {
        return minuteStepping;
    }

    public void setMinuteStepping(int minuteStepping) {
        this.minuteStepping = minuteStepping;
    }

    public boolean getDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean getSideBySide() {
        return sideBySide;
    }

    public void setSideBySide(boolean sideBySide) {
        this.sideBySide = sideBySide;
    }

    public boolean getCalendarWeeks() {
        return calendarWeeks;
    }

    public void setCalendarWeeks(boolean calendarWeeks) {
        this.calendarWeeks = calendarWeeks;
    }

    public boolean getInline() {
        return inline;
    }

    public void setInline(boolean inline) {
        this.inline = inline;
    }

    public boolean getAllowKeyboardNavigation() {
        return allowKeyboardNavigation;
    }

    public void setAllowKeyboardNavigation(boolean allowKeyboardNavigation) {
        this.allowKeyboardNavigation = allowKeyboardNavigation;
    }

    public boolean getKeepOpen() {
        return keepOpen;
    }

    public void setKeepOpen(boolean keepOpen) {
        this.keepOpen = keepOpen;
    }

    public String getViewMode() {
        return viewMode;
    }

    public void setViewMode(String viewMode) {
        this.viewMode = viewMode;
    }

    public String getToolbarPlacement() {
        return toolbarPlacement;
    }

    public void setToolbarPlacement(String toolbarPlacement) {
        this.toolbarPlacement = toolbarPlacement;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public boolean getShowTodayButton() {
        return showTodayButton;
    }

    public void setShowTodayButton(boolean showTodayButton) {
        this.showTodayButton = showTodayButton;
    }

    public boolean getShowClearButton() {
        return showClearButton;
    }

    public void setShowClearButton(boolean showClearButton) {
        this.showClearButton = showClearButton;
    }

    public boolean getShowCloseButton() {
        return showCloseButton;
    }

    public void setShowCloseButton(boolean showCloseButton) {
        this.showCloseButton = showCloseButton;
    }

    public boolean getComponentDateEnabled() {
        return componentDateEnabled;
    }

    public void setComponentDateEnabled(boolean componentDateEnabled) {
        this.componentDateEnabled = componentDateEnabled;
    }

    public boolean getComponentMonthEnabled() {
        return componentMonthEnabled;
    }

    public void setComponentMonthEnabled(boolean componentMonthEnabled) {
        this.componentMonthEnabled = componentMonthEnabled;
    }

    public boolean getComponentYearEnabled() {
        return componentYearEnabled;
    }

    public void setComponentYearEnabled(boolean componentYearEnabled) {
        this.componentYearEnabled = componentYearEnabled;
    }

    public boolean getComponentDecadesEnabled() {
        return componentDecadesEnabled;
    }

    public void setComponentDecadesEnabled(boolean componentDecadesEnabled) {
        this.componentDecadesEnabled = componentDecadesEnabled;
    }

    public boolean getComponentHoursEnabled() {
        return componentHoursEnabled;
    }

    public void setComponentHoursEnabled(boolean componentHoursEnabled) {
        this.componentHoursEnabled = componentHoursEnabled;
    }

    public boolean getComponentMinutesEnabled() {
        return componentMinutesEnabled;
    }

    public void setComponentMinutesEnabled(boolean componentMinutesEnabled) {
        this.componentMinutesEnabled = componentMinutesEnabled;
    }

    public boolean getComponentSecondsEnabled() {
        return componentSecondsEnabled;
    }

    public void setComponentSecondsEnabled(boolean componentSecondsEnabled) {
        this.componentSecondsEnabled = componentSecondsEnabled;
    }

    public JsDate getMinDate() {
        return minDate;
    }

    public void setMinDate(JsDate minDate) {
        this.minDate = minDate;
    }

    public JsDate getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(JsDate maxDate) {
        this.maxDate = maxDate;
    }

    public native JavaScriptObject toJavaScript() /*-{
        var that = this;
        var obj = {
            allowInputToggle: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getAllowInputToggle()(),
            keepInvalid: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getKeepInvalid()(),
            multipleDates: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMultipleDates()(),
            multipleDatesSeparator: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMultipleDatesSeparator()(),
            promptTimeOnDateChange: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getPromptTimeOnDateChange()(),
            promptTimeOnDateChangeTransitionDelay: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getPromptTimeOnDateChangeTransitionDelay()(),
            stepping: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMinuteStepping()(),
            display: {
                sideBySide: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getSideBySide()(),
                calendarWeeks: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getCalendarWeeks()(),
                inline: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getInline()(),
                keyboardNavigation: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getAllowKeyboardNavigation()(),
                keepOpen: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getKeepOpen()(),
                viewMode: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getViewMode()(),
                toolbarPlacement: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getToolbarPlacement()(),
                theme: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getTheme()(),
                buttons: {
                    today: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getShowTodayButton()(),
                    clear: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getShowClearButton()(),
                    close: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getShowCloseButton()()
                },
                components: {
                    date: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentDateEnabled()(),
                    month: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentMonthEnabled()(),
                    year: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentYearEnabled()(),
                    decades: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentDecadesEnabled()(),
                    hours: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentHoursEnabled()(),
                    minutes: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentMinutesEnabled()(),
                    seconds: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getComponentSecondsEnabled()()
                }
            },
            restrictions: {
                minDate: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMinDate()(),
                maxDate: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMaxDate()()
            },
            debug: that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerProperties::getMaxDate()()
        };

        function removeEmpty(obj) {
            return Object.keys(obj)
                .filter(function (k) {
                    return obj[k] != null;
                })
                .reduce(function (acc, k) {
                    acc[k] = typeof obj[k] === "object" ? removeEmpty(obj[k]) : obj[k];
                    return acc;
                }, {});
        }

        return removeEmpty(obj);
    }-*/;

}
