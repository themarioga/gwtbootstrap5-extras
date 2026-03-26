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

import java.util.List;

public interface ISelectEngine {

    void init(com.google.gwt.dom.client.SelectElement element, SelectProperties options, ISelectHandlers handlers);
    void updateProperties(SelectProperties options);
    void destroy();
    void refresh();
    void show();
    void hide();
    void toggle();
    void triggerAsyncLoad();
    void clear(boolean silent);
    void clearOptions();
    void setOptions(List<SelectOption> options);
    void addOption(SelectOption option);
    void addOptions(List<SelectOption> options);
    List<SelectOption> getOptions();
    void setValue(String value, boolean silent);
    String getValue();
    void setValues(List<String> value, boolean silent);
    List<String> getValues();
    void setEnabled(boolean enabled);
    boolean isStarted();

    class SelectOption {
        private String value;
        private String text;

        public final String getValue() { return value; }

        public final void setValue(String value) { this.value = value; }

        public final String getText() { return text; }

        public final void setText(String text) { this.text = text; }
    }
}
