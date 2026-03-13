package org.gwtbootstrap5.extras.select.client;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap5
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License")
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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.gwtbootstrap5.client.ui.util.StyleInjector;

/**
 * @author godi
 */
public class SelectURLEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        ScriptInjector.fromUrl("https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.18/js/bootstrap-select.min.js")
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        StyleInjector.injectCSS("https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.18/css/bootstrap-select.min.css");
    }

}
