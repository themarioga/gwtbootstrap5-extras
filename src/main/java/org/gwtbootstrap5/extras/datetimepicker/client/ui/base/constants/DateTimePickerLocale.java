package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants;

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.resources.client.TextResource;
import org.gwtbootstrap5.extras.datetimepicker.client.DateTimePickerClientBundle;

/**
 * @author Joshua Godi
 */
public enum DateTimePickerLocale {
    AR("ar", DateTimePickerClientBundle.INSTANCE.ar()),
    AR_SA("ar-SA", DateTimePickerClientBundle.INSTANCE.ar_SA()),
    CA("ca", DateTimePickerClientBundle.INSTANCE.ca()),
    CS("cs", DateTimePickerClientBundle.INSTANCE.cs()),
    DE("de", DateTimePickerClientBundle.INSTANCE.de()),
    ES("es", DateTimePickerClientBundle.INSTANCE.es()),
    FI("fi", DateTimePickerClientBundle.INSTANCE.fi()),
    FR("fr", DateTimePickerClientBundle.INSTANCE.fr()),
    HR("hr", DateTimePickerClientBundle.INSTANCE.hr()),
    HU("hy", DateTimePickerClientBundle.INSTANCE.hy()),
    IT("it", DateTimePickerClientBundle.INSTANCE.it()),
    NL("nl", DateTimePickerClientBundle.INSTANCE.nl()),
    PL("pl", DateTimePickerClientBundle.INSTANCE.pl()),
    PT_PT("pt-PT", DateTimePickerClientBundle.INSTANCE.pt_PT()),
    RO("ro", DateTimePickerClientBundle.INSTANCE.ro()),
    RU("ru", DateTimePickerClientBundle.INSTANCE.ru()),
    SK("sk", DateTimePickerClientBundle.INSTANCE.sk()),
    SL("sl", DateTimePickerClientBundle.INSTANCE.sl()),
    SR("sr", DateTimePickerClientBundle.INSTANCE.sr()),
    SR_LATIN("sr-latin", DateTimePickerClientBundle.INSTANCE.sr_LATN()),
    TR("tr", DateTimePickerClientBundle.INSTANCE.tr()),
    UK("uk", DateTimePickerClientBundle.INSTANCE.uk()),
    ZH_CN("zh-CN", DateTimePickerClientBundle.INSTANCE.zh_CN()),
    ZH_HK("zh-HK", DateTimePickerClientBundle.INSTANCE.zh_HK()),
    ZH_MO("zh-MO", DateTimePickerClientBundle.INSTANCE.zh_MO()),
    ZH_TW("zh-TW", DateTimePickerClientBundle.INSTANCE.zh_TW()),
    EN("en", null); // Base language, don't need another file

    private final String code;
    private final TextResource js;

    DateTimePickerLocale(final String code, final TextResource js) {
        this.js = js;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public TextResource getJs() {
        return js;
    }

    public static native JavaScriptObject getLocale(String lang) /*-{
        if (lang === "ar") {
            return tempusDominus.locale.ar;
        } else if (lang === "ar-SA") {
            return tempusDominus.locale.ar_SA;
        } else if (lang === "ca") {
            return tempusDominus.locale.ca;
        } else if (lang === "cs") {
            return tempusDominus.locale.cs;
        } else if (lang === "de") {
            return tempusDominus.locale.de;
        } else if (lang === "es") {
            return tempusDominus.locale.es;
        } else if (lang === "fi") {
            return tempusDominus.locale.fi;
        } else if (lang === "fr") {
            return tempusDominus.locale.fr;
        } else if (lang === "hr") {
            return tempusDominus.locale.hr;
        } else if (lang === "hy") {
            return tempusDominus.locale.hy;
        } else if (lang === "it") {
            return tempusDominus.locale.it;
        } else if (lang === "nl") {
            return tempusDominus.locale.nl;
        } else if (lang === "pl") {
            return tempusDominus.locale.pl;
        } else if (lang === "pt-PT") {
            return tempusDominus.locale.pt_PT;
        } else if (lang === "ro") {
            return tempusDominus.locale.ro;
        } else if (lang === "ru") {
            return tempusDominus.locale.ru;
        } else if (lang === "sk") {
            return tempusDominus.locale.sk;
        } else if (lang === "sl") {
            return tempusDominus.locale.sl;
        } else if (lang === "sr") {
            return tempusDominus.locale.sr;
        } else if (lang === "sr-latin") {
            return tempusDominus.locale.sr_Latn;
        } else if (lang === "tr") {
            return tempusDominus.locale.tr;
        } else if (lang === "uk") {
            return tempusDominus.locale.uk;
        } else if (lang === "zh-CN") {
            return tempusDominus.locale.zh_CN;
        } else if (lang === "zh-HK") {
            return tempusDominus.locale.zh_HK;
        } else if (lang === "zh-MO") {
            return tempusDominus.locale.zh_MO;
        } else if (lang === "zh-TW") {
            return tempusDominus.locale.zh_TW;
        }
    }-*/;

}
