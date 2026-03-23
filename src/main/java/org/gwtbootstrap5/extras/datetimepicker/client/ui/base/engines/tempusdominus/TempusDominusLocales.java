package org.gwtbootstrap5.extras.datetimepicker.client.ui.base.engines.tempusdominus;

/*-
 * ==========================LICENSE_START===============================
 * GwtBootstrap5
 * ======================================================================
 * Copyright (C) 2023 - 2026 GwtBootstrap5
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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.TextResource;
import org.gwtbootstrap5.extras.datetimepicker.client.DateTimePickerClientBundle;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.engines.airdatepicker.AirDatepickerLocales;

/**
 * @author Joshua Godi
 */
public enum TempusDominusLocales {
    AR("ar", DateTimePickerClientBundle.INSTANCE.tdlocales_ar()),
    AR_SA("ar-SA", DateTimePickerClientBundle.INSTANCE.tdlocales_ar_SA()),
    CA("ca", DateTimePickerClientBundle.INSTANCE.tdlocales_ca()),
    CS("cs", DateTimePickerClientBundle.INSTANCE.tdlocales_cs()),
    DE("de", DateTimePickerClientBundle.INSTANCE.tdlocales_de()),
    ES("es", DateTimePickerClientBundle.INSTANCE.tdlocales_es()),
    FI("fi", DateTimePickerClientBundle.INSTANCE.tdlocales_fi()),
    FR("fr", DateTimePickerClientBundle.INSTANCE.tdlocales_fr()),
    HR("hr", DateTimePickerClientBundle.INSTANCE.tdlocales_hr()),
    HU("hy", DateTimePickerClientBundle.INSTANCE.tdlocales_hy()),
    IT("it", DateTimePickerClientBundle.INSTANCE.tdlocales_it()),
    NL("nl", DateTimePickerClientBundle.INSTANCE.tdlocales_nl()),
    PL("pl", DateTimePickerClientBundle.INSTANCE.tdlocales_pl()),
    PT_PT("pt-PT", DateTimePickerClientBundle.INSTANCE.tdlocales_pt_PT()),
    RO("ro", DateTimePickerClientBundle.INSTANCE.tdlocales_ro()),
    RU("ru", DateTimePickerClientBundle.INSTANCE.tdlocales_ru()),
    SK("sk", DateTimePickerClientBundle.INSTANCE.tdlocales_sk()),
    SL("sl", DateTimePickerClientBundle.INSTANCE.tdlocales_sl()),
    SR("sr", DateTimePickerClientBundle.INSTANCE.tdlocales_sr()),
    SR_LATIN("sr-latin", DateTimePickerClientBundle.INSTANCE.tdlocales_sr_LATN()),
    TR("tr", DateTimePickerClientBundle.INSTANCE.tdlocales_tr()),
    UK("uk", DateTimePickerClientBundle.INSTANCE.tdlocales_uk()),
    ZH_CN("zh-CN", DateTimePickerClientBundle.INSTANCE.tdlocales_zh_CN()),
    ZH_HK("zh-HK", DateTimePickerClientBundle.INSTANCE.tdlocales_zh_HK()),
    ZH_MO("zh-MO", DateTimePickerClientBundle.INSTANCE.tdlocales_zh_MO()),
    ZH_TW("zh-TW", DateTimePickerClientBundle.INSTANCE.tdlocales_zh_TW()),
    EN("en", null); // Base language, don't need another file

    private final String code;
    private final TextResource js;

    TempusDominusLocales(final String code, final TextResource js) {
        this.js = js;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public TextResource getJs() {
        return js;
    }

    public static TempusDominusLocales fromCode(final String code) {
        for (final TempusDominusLocales locale : values()) {
            if (locale.getCode().equals(code)) {
                return locale;
            }
        }

        return null;
    }

    public static JavaScriptObject getLocaleAndLoadItIfNotLoaded(String lang) {
        TempusDominusLocales locale = fromCode(lang);
        if (locale != null) {
            JavaScriptObject localeObj = getLocale(lang);
            if (localeObj == null) {
                ScriptInjector.fromString(locale.getJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
            }

            return getLocale(lang);
        }

        return null;
    }

    public static native JavaScriptObject getLocale(String lang) /*-{
        if (lang === "ar") {
            return $wnd.tempusDominus.locales.ar;
        } else if (lang === "ar-SA") {
            return $wnd.tempusDominus.locales.ar_SA;
        } else if (lang === "ca") {
            return $wnd.tempusDominus.locales.ca;
        } else if (lang === "cs") {
            return $wnd.tempusDominus.locales.cs;
        } else if (lang === "de") {
            return $wnd.tempusDominus.locales.de;
        } else if (lang === "es") {
            return $wnd.tempusDominus.locales.es;
        } else if (lang === "fi") {
            return $wnd.tempusDominus.locales.fi;
        } else if (lang === "fr") {
            return $wnd.tempusDominus.locales.fr;
        } else if (lang === "hr") {
            return $wnd.tempusDominus.locales.hr;
        } else if (lang === "hy") {
            return $wnd.tempusDominus.locales.hy;
        } else if (lang === "it") {
            return $wnd.tempusDominus.locales.it;
        } else if (lang === "nl") {
            return $wnd.tempusDominus.locales.nl;
        } else if (lang === "pl") {
            return $wnd.tempusDominus.locales.pl;
        } else if (lang === "pt-PT") {
            return $wnd.tempusDominus.locales.pt_PT;
        } else if (lang === "ro") {
            return $wnd.tempusDominus.locales.ro;
        } else if (lang === "ru") {
            return $wnd.tempusDominus.locales.ru;
        } else if (lang === "sk") {
            return $wnd.tempusDominus.locales.sk;
        } else if (lang === "sl") {
            return $wnd.tempusDominus.locales.sl;
        } else if (lang === "sr") {
            return $wnd.tempusDominus.locales.sr;
        } else if (lang === "sr-latin") {
            return $wnd.tempusDominus.locales.sr_Latn;
        } else if (lang === "tr") {
            return $wnd.tempusDominus.locales.tr;
        } else if (lang === "uk") {
            return $wnd.tempusDominus.locales.uk;
        } else if (lang === "zh-CN") {
            return $wnd.tempusDominus.locales.zh_CN;
        } else if (lang === "zh-HK") {
            return $wnd.tempusDominus.locales.zh_HK;
        } else if (lang === "zh-MO") {
            return $wnd.tempusDominus.locales.zh_MO;
        } else if (lang === "zh-TW") {
            return $wnd.tempusDominus.locales.zh_TW;
        }
    }-*/;

}
