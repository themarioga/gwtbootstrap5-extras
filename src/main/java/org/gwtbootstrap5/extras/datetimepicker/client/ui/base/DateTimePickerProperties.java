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

import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerLocale;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerTheme;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerToolbarPlacement;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.DateTimePickerViewMode;

import java.util.Date;

public class DateTimePickerProperties {

    private Boolean allowInputToggle = false;
    private Boolean keepInvalid = false;
    private Boolean multipleDates = false;
    private String multipleDatesSeparator = "; ";
    private Boolean promptTimeOnDateChange = false;
    private Integer promptTimeOnDateChangeTransitionDelay = 200;
    private Integer minuteStepping = 1;
    private Boolean debug = false;

    // Display
    private Boolean sideBySide = false;
    private Boolean calendarWeeks = false;
    private Boolean inline = false;
    private Boolean allowKeyboardNavigation = true;
    private Boolean keepOpen = false;
    private String viewMode = DateTimePickerViewMode.CALENDAR.getValue();
    private String toolbarPlacement = DateTimePickerToolbarPlacement.BOTTOM.getPosition();
    private String theme = DateTimePickerTheme.AUTO.getTheme();
    private Boolean showTodayButton = false;
    private Boolean showClearButton = false;
    private Boolean showCloseButton = false;
    private Boolean componentDateEnabled = true;
    private Boolean componentMonthEnabled = true;
    private Boolean componentYearEnabled = true;
    private Boolean componentDecadesEnabled = true;
    private Boolean componentHoursEnabled = true;
    private Boolean componentMinutesEnabled = true;
    private Boolean componentSecondsEnabled = false;

    // Restrictions
    private Date minDate = null;
    private Date maxDate = null;
    //ToDo: DisabledDates
    //ToDo: EnabledDates
    //ToDo: DaysOfWeekDisabled
    //ToDo: DisabledTimeIntervals
    //ToDo: DisabledHours
    //ToDo: EnabledHours

    // Localization
    private DateTimePickerLocale locale = DateTimePickerLocale.EN;

    public Boolean getAllowInputToggle() {
        return allowInputToggle;
    }

    public void setAllowInputToggle(Boolean allowInputToggle) {
        this.allowInputToggle = allowInputToggle;
    }

    public Boolean getKeepInvalid() {
        return keepInvalid;
    }

    public void setKeepInvalid(Boolean keepInvalid) {
        this.keepInvalid = keepInvalid;
    }

    public Boolean getMultipleDates() {
        return multipleDates;
    }

    public void setMultipleDates(Boolean multipleDates) {
        this.multipleDates = multipleDates;
    }

    public String getMultipleDatesSeparator() {
        return multipleDatesSeparator;
    }

    public void setMultipleDatesSeparator(String multipleDatesSeparator) {
        this.multipleDatesSeparator = multipleDatesSeparator;
    }

    public Boolean getPromptTimeOnDateChange() {
        return promptTimeOnDateChange;
    }

    public void setPromptTimeOnDateChange(Boolean promptTimeOnDateChange) {
        this.promptTimeOnDateChange = promptTimeOnDateChange;
    }

    public Integer getPromptTimeOnDateChangeTransitionDelay() {
        return promptTimeOnDateChangeTransitionDelay;
    }

    public void setPromptTimeOnDateChangeTransitionDelay(Integer promptTimeOnDateChangeTransitionDelay) {
        this.promptTimeOnDateChangeTransitionDelay = promptTimeOnDateChangeTransitionDelay;
    }

    public Integer getMinuteStepping() {
        return minuteStepping;
    }

    public void setMinuteStepping(Integer minuteStepping) {
        this.minuteStepping = minuteStepping;
    }

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public Boolean getSideBySide() {
        return sideBySide;
    }

    public void setSideBySide(Boolean sideBySide) {
        this.sideBySide = sideBySide;
    }

    public Boolean getCalendarWeeks() {
        return calendarWeeks;
    }

    public void setCalendarWeeks(Boolean calendarWeeks) {
        this.calendarWeeks = calendarWeeks;
    }

    public Boolean getInline() {
        return inline;
    }

    public void setInline(Boolean inline) {
        this.inline = inline;
    }

    public Boolean getAllowKeyboardNavigation() {
        return allowKeyboardNavigation;
    }

    public void setAllowKeyboardNavigation(Boolean allowKeyboardNavigation) {
        this.allowKeyboardNavigation = allowKeyboardNavigation;
    }

    public Boolean getKeepOpen() {
        return keepOpen;
    }

    public void setKeepOpen(Boolean keepOpen) {
        this.keepOpen = keepOpen;
    }

    public DateTimePickerViewMode getViewMode() {
        return DateTimePickerViewMode.fromValue(viewMode);
    }

    public void setViewMode(DateTimePickerViewMode viewMode) {
        this.viewMode = viewMode.getValue();
    }

    public DateTimePickerToolbarPlacement getToolbarPlacement() {
        return DateTimePickerToolbarPlacement.fromValue(toolbarPlacement);
    }

    public void setToolbarPlacement(DateTimePickerToolbarPlacement toolbarPlacement) {
        this.toolbarPlacement = toolbarPlacement.getPosition();
    }

    public DateTimePickerTheme getTheme() {
        return DateTimePickerTheme.fromValue(theme);
    }

    public void setTheme(DateTimePickerTheme theme) {
        this.theme = theme.getTheme();
    }

    public Boolean getShowTodayButton() {
        return showTodayButton;
    }

    public void setShowTodayButton(Boolean showTodayButton) {
        this.showTodayButton = showTodayButton;
    }

    public Boolean getShowClearButton() {
        return showClearButton;
    }

    public void setShowClearButton(Boolean showClearButton) {
        this.showClearButton = showClearButton;
    }

    public Boolean getShowCloseButton() {
        return showCloseButton;
    }

    public void setShowCloseButton(Boolean showCloseButton) {
        this.showCloseButton = showCloseButton;
    }

    public Boolean getComponentDateEnabled() {
        return componentDateEnabled;
    }

    public void setComponentDateEnabled(Boolean componentDateEnabled) {
        this.componentDateEnabled = componentDateEnabled;
    }

    public Boolean getComponentMonthEnabled() {
        return componentMonthEnabled;
    }

    public void setComponentMonthEnabled(Boolean componentMonthEnabled) {
        this.componentMonthEnabled = componentMonthEnabled;
    }

    public Boolean getComponentYearEnabled() {
        return componentYearEnabled;
    }

    public void setComponentYearEnabled(Boolean componentYearEnabled) {
        this.componentYearEnabled = componentYearEnabled;
    }

    public Boolean getComponentDecadesEnabled() {
        return componentDecadesEnabled;
    }

    public void setComponentDecadesEnabled(Boolean componentDecadesEnabled) {
        this.componentDecadesEnabled = componentDecadesEnabled;
    }

    public Boolean getComponentHoursEnabled() {
        return componentHoursEnabled;
    }

    public void setComponentHoursEnabled(Boolean componentHoursEnabled) {
        this.componentHoursEnabled = componentHoursEnabled;
    }

    public Boolean getComponentMinutesEnabled() {
        return componentMinutesEnabled;
    }

    public void setComponentMinutesEnabled(Boolean componentMinutesEnabled) {
        this.componentMinutesEnabled = componentMinutesEnabled;
    }

    public Boolean getComponentSecondsEnabled() {
        return componentSecondsEnabled;
    }

    public void setComponentSecondsEnabled(Boolean componentSecondsEnabled) {
        this.componentSecondsEnabled = componentSecondsEnabled;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setToolbarPlacement(String toolbarPlacement) {
        this.toolbarPlacement = toolbarPlacement;
    }

    public void setViewMode(String viewMode) {
        this.viewMode = viewMode;
    }

    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public DateTimePickerLocale getLocale() {
        return locale;
    }

    public void setLocale(DateTimePickerLocale locale) {
        this.locale = locale;
    }

}
