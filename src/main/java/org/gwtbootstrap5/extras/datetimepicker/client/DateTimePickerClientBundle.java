package org.gwtbootstrap5.extras.datetimepicker.client;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap5
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

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Sven Jacobs
 */
public interface DateTimePickerClientBundle extends ClientBundle {

    DateTimePickerClientBundle INSTANCE = GWT.create(DateTimePickerClientBundle.class);

    String VERSION = "6.10.4";
    String LOCALES_DIR = "resource/js/locales.cache." + VERSION + "/";

    @Source("resource/js/tempus-dominus-" + VERSION + ".min.cache.js")
    TextResource dateTimePicker();

    @Source(LOCALES_DIR + "ar.js")
    TextResource ar();

    @Source(LOCALES_DIR + "ar-SA.js")
    TextResource ar_SA();

    @Source(LOCALES_DIR + "ca.js")
    TextResource ca();

    @Source(LOCALES_DIR + "cs.js")
    TextResource cs();

    @Source(LOCALES_DIR + "de.js")
    TextResource de();

    @Source(LOCALES_DIR + "es.js")
    TextResource es();

    @Source(LOCALES_DIR + "fi.js")
    TextResource fi();

    @Source(LOCALES_DIR + "fr.js")
    TextResource fr();

    @Source(LOCALES_DIR + "hr.js")
    TextResource hr();

    @Source(LOCALES_DIR + "hy.js")
    TextResource hy();

    @Source(LOCALES_DIR + "it.js")
    TextResource it();

    @Source(LOCALES_DIR + "nl.js")
    TextResource nl();

    @Source(LOCALES_DIR + "pl.js")
    TextResource pl();

    @Source(LOCALES_DIR + "pt-PT.js")
    TextResource pt_PT();

    @Source(LOCALES_DIR + "ro.js")
    TextResource ro();

    @Source(LOCALES_DIR + "ru.js")
    TextResource ru();

    @Source(LOCALES_DIR + "sk.js")
    TextResource sk();

    @Source(LOCALES_DIR + "sl.js")
    TextResource sl();

    @Source(LOCALES_DIR + "sr.js")
    TextResource sr();

    @Source(LOCALES_DIR + "sr-Latn.js")
    TextResource sr_LATN();

    @Source(LOCALES_DIR + "tr.js")
    TextResource tr();

    @Source(LOCALES_DIR + "uk.js")
    TextResource uk();

    @Source(LOCALES_DIR + "zh-CN.js")
    TextResource zh_CN();

    @Source(LOCALES_DIR + "zh-HK.js")
    TextResource zh_HK();

    @Source(LOCALES_DIR + "zh-MO.js")
    TextResource zh_MO();

    @Source(LOCALES_DIR + "zh-TW.js")
    TextResource zh_TW();

}
