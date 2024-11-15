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
 * Default: BOTTOM_RIGHT
 *
 * @author Joshua Godi
 */
public interface HasPosition {
    /**
     * Set the position of the date time picker
     *
     * @param position position
     */
    void setPosition(DatePickerPosition position);

    /**
     * Gets the position of the date time picker
     *
     * @return position
     */
    DatePickerPosition getPosition();
}
