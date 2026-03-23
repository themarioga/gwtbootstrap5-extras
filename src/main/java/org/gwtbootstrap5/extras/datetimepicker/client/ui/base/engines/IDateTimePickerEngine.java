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
import java.util.List;

public interface IDateTimePickerEngine {

    void init(com.google.gwt.dom.client.Element element, DateTimePickerOptions options, IDateTimePickerHandlers handlers);
    void updateProperties(DateTimePickerOptions options);
    void destroy();
    void show();
    void hide();
    void toggle();
    void clear(boolean silent);
    void setViewDate(Date date);
    void setDate(Date date, boolean silent);
    Date getDate();
    void setMultipleDates(List<Date> dates, boolean silent);
    List<Date> getMultipleDates();
    boolean isStarted();

}
