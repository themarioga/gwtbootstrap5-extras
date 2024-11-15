package org.gwtbootstrap5.extras.datepicker.client.ui.base.constants;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap5
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

/**
 * Boolean, "linked". Default: false
 * <p/>
 * If true or "linked", displays a "Today" button at the bottom of the datetimepicker to select the current date.
 * If true, the "Today" button will only move the current date into view; if "linked",
 * the current date will also be selected.
 *
 * @author Joshua Godi
 */
public interface HasShowTodayButton {
    void setShowTodayButton(boolean showTodayButton);
}
