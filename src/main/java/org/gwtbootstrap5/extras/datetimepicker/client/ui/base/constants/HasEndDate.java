package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 GwtBootstrap5
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

import java.util.Date;

/**
 * Date. Default: End of time
 * <p/>
 * The latest date that may be selected; all later dates will be disabled.
 *
 * @author Joshua Godi
 */
public interface HasEndDate {
    void setEndDate(Date endDate);

    void setEndDate(String endDate);

    void clearEndDate();
}
