package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.engines;

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

import java.util.Date;

public class DateTimePickerOptions {
    private boolean keepOpen = false;
    private String locale = "en";
    private Date minDate = null;
    private Date maxDate = null;
    private int hourStep = 0;
    private int minuteStep = 0;
    private boolean showTodayButton = false;
    private boolean showClearButton = false;
    private String dateFormat = "dd/MM/yyyy";
    private String dateTimeConcatenator = " ";
    private String timeFormat = "HH:mm";
    private boolean onlyCalendar = false;
    private boolean onlyTime = false;
    private boolean focusDateOnWrite = true;
    private boolean selectDateOnWrite = false;

    public boolean isKeepOpen() {
        return keepOpen;
    }

    public void setKeepOpen(boolean keepOpen) {
        this.keepOpen = keepOpen;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
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

    public int getHourStep() {
        return hourStep;
    }

    public void setHourStep(int hourStep) {
        this.hourStep = hourStep;
    }

    public int getMinuteStep() {
        return minuteStep;
    }

    public void setMinuteStep(int minuteStep) {
        this.minuteStep = minuteStep;
    }

    public boolean isShowTodayButton() {
        return showTodayButton;
    }

    public void setShowTodayButton(boolean showTodayButton) {
        this.showTodayButton = showTodayButton;
    }

    public boolean isShowClearButton() {
        return showClearButton;
    }

    public void setShowClearButton(boolean showClearButton) {
        this.showClearButton = showClearButton;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateTimeConcatenator() {
        return dateTimeConcatenator;
    }

    public void setDateTimeConcatenator(String dateTimeConcatenator) {
        this.dateTimeConcatenator = dateTimeConcatenator;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getDateTimeFormat() {
        String fullFormat = "";
        if (!onlyTime && dateFormat != null) {
            fullFormat += dateFormat;
        }

        if ((!onlyTime && dateFormat != null) && (!onlyCalendar && timeFormat != null)) {
            fullFormat += dateTimeConcatenator;
        }

        if (!onlyCalendar && timeFormat != null) {
            fullFormat += timeFormat;
        }

        return fullFormat;
    }

    public boolean isOnlyCalendar() {
        return onlyCalendar;
    }

    public void setOnlyCalendar(boolean onlyCalendar) {
        this.onlyCalendar = onlyCalendar;
    }

    public boolean isOnlyTime() {
        return onlyTime;
    }

    public void setOnlyTime(boolean onlyTime) {
        this.onlyTime = onlyTime;
    }

    public boolean isFocusDateOnWrite() {
        return focusDateOnWrite;
    }

    public void setFocusDateOnWrite(boolean focusDateOnWrite) {
        this.focusDateOnWrite = focusDateOnWrite;
    }

    public boolean isSelectDateOnWrite() {
        return selectDateOnWrite;
    }

    public void setSelectDateOnWrite(boolean selectDateOnWrite) {
        this.selectDateOnWrite = selectDateOnWrite;
    }

}
