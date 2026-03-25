package org.gwtbootstrap5.extras.select.client.ui.base.engine;

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

public class SelectProperties {
    private boolean loadOnOpen = false;
    private boolean allowClear = true;
    private boolean searchEnabled = true;
    private String searchPlaceholder = null;
    private String noResultsText = null;
    private boolean multiple = false;
    private int multipleLimit = 0;
    private String placeholder = "";

    public boolean isLoadOnOpen() {
        return loadOnOpen;
    }

    public void setLoadOnOpen(boolean loadOnOpen) {
        this.loadOnOpen = loadOnOpen;
    }

    public boolean isAllowClear() {
        return allowClear;
    }

    public void setAllowClear(boolean allowClear) {
        this.allowClear = allowClear;
    }

    public boolean isSearchEnabled() {
        return searchEnabled;
    }

    public void setSearchEnabled(boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
    }

    public String getSearchPlaceholder() {
        return searchPlaceholder;
    }

    public void setSearchPlaceholder(String searchPlaceholder) {
        this.searchPlaceholder = searchPlaceholder;
    }

    public String getNoResultsText() {
        return noResultsText;
    }

    public void setNoResultsText(String noResultsText) {
        this.noResultsText = noResultsText;
    }

    public int getMultipleLimit() {
        return multipleLimit;
    }

    public void setMultipleLimit(int multipleLimit) {
        this.multipleLimit = multipleLimit;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
}
