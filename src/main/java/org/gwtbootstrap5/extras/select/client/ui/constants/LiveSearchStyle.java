package org.gwtbootstrap5.extras.select.client.ui.constants;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2016 GwtBootstrap5
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
 * Select live search style.
 *
 * @author Xiaodong Sun
 */
public enum LiveSearchStyle {

    /**
     * Search for options that contain the searched text
     */
    CONTAINS("contains"),

    /**
     * Searching for options that start with the searched text
     */
    STARTS_WITH("startsWith"),

    ;

    private String value;

    private LiveSearchStyle(String size) {
        this.value = size;
    }

    /**
     * Returns the value of the live search style.
     *
     * @return
     */
    public String getValue() {
        return value;
    }

}
