package org.gwtbootstrap5.extras.datetimepicker.client.ui.engines.airdatepicker;

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

/**
 * @author Joshua Godi
 */
public enum AirDatepickerLocales {
    AR("ar", AirDatepickerClientBundle.INSTANCE.adlocales_ar()),
    BG("bg", AirDatepickerClientBundle.INSTANCE.adlocales_bg()),
    BR("br", AirDatepickerClientBundle.INSTANCE.adlocales_br()),
    CA("ca", AirDatepickerClientBundle.INSTANCE.adlocales_ca()),
    CS("cs", AirDatepickerClientBundle.INSTANCE.adlocales_cs()),
    DA("da", AirDatepickerClientBundle.INSTANCE.adlocales_da()),
    DE("de", AirDatepickerClientBundle.INSTANCE.adlocales_de()),
    EL("el", AirDatepickerClientBundle.INSTANCE.adlocales_el()),
    EN("en", AirDatepickerClientBundle.INSTANCE.adlocales_en()),
    ES("es", AirDatepickerClientBundle.INSTANCE.adlocales_es()),
    EU("eu", AirDatepickerClientBundle.INSTANCE.adlocales_eu()),
    FI("fi", AirDatepickerClientBundle.INSTANCE.adlocales_fi()),
    FR("fr", AirDatepickerClientBundle.INSTANCE.adlocales_fr()),
    HR("hr", AirDatepickerClientBundle.INSTANCE.adlocales_hr()),
    HU("hu", AirDatepickerClientBundle.INSTANCE.adlocales_hu()),
    ID("id", AirDatepickerClientBundle.INSTANCE.adlocales_id()),
    IT("it", AirDatepickerClientBundle.INSTANCE.adlocales_it()),
    JA("ja", AirDatepickerClientBundle.INSTANCE.adlocales_ja()),
    KO("ko", AirDatepickerClientBundle.INSTANCE.adlocales_ko()),
    NB("nb", AirDatepickerClientBundle.INSTANCE.adlocales_nb()),
    NL("nl", AirDatepickerClientBundle.INSTANCE.adlocales_nl()),
    PL("pl", AirDatepickerClientBundle.INSTANCE.adlocales_pl()),
    PT("pt", AirDatepickerClientBundle.INSTANCE.adlocales_pt()),
    RO("ro", AirDatepickerClientBundle.INSTANCE.adlocales_ro()),
    RU("ru", AirDatepickerClientBundle.INSTANCE.adlocales_ru()),
    SI("si", AirDatepickerClientBundle.INSTANCE.adlocales_si()),
    SK("sk", AirDatepickerClientBundle.INSTANCE.adlocales_sk()),
    SL("sl", AirDatepickerClientBundle.INSTANCE.adlocales_sl()),
    SR("sv", AirDatepickerClientBundle.INSTANCE.adlocales_sv()),
    TH("th", AirDatepickerClientBundle.INSTANCE.adlocales_th()),
    TR("tr", AirDatepickerClientBundle.INSTANCE.adlocales_tr()),
    UK("uk", AirDatepickerClientBundle.INSTANCE.adlocales_uk()),
    ZH("zh", AirDatepickerClientBundle.INSTANCE.adlocales_zh());

    // Base language, don't need another file

    private final String code;
    private final TextResource js;

    AirDatepickerLocales(final String code, final TextResource js) {
        this.js = js;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public TextResource getJs() {
        return js;
    }

    public static AirDatepickerLocales fromCode(final String code) {
        for (final AirDatepickerLocales locale : values()) {
            if (locale.getCode().equals(code)) {
                return locale;
            }
        }

        return null;
    }

    public static JavaScriptObject getLocaleAndLoadItIfNotLoaded(String lang) {
        AirDatepickerLocales locale = fromCode(lang);
        if (locale != null) {
            JavaScriptObject localeObj = getLocale(lang);
            if (localeObj == null) {
                ScriptInjector.fromString(locale.getJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
            }

            return getLocale(lang);
        }

        return null;
    }

    private static native JavaScriptObject getLocale(String lang) /*-{
        if (lang === "ar") {
            return $wnd.globalThis.ad_locale_ar;
        } else if (lang === "bg") {
            return $wnd.globalThis.ad_locale_bg;
        } else if (lang === "br") {
            return $wnd.globalThis.ad_locale_br;
        } else if (lang === "ca") {
            return $wnd.globalThis.ad_locale_ca;
        } else if (lang === "cs") {
            return $wnd.globalThis.ad_locale_cs;
        } else if (lang === "da") {
            return $wnd.globalThis.ad_locale_da;
        } else if (lang === "de") {
            return $wnd.globalThis.ad_locale_de;
        } else if (lang === "el") {
            return $wnd.globalThis.ad_locale_el;
        } else if (lang === "en") {
            return $wnd.globalThis.ad_locale_en;
        } else if (lang === "es") {
            return $wnd.globalThis.ad_locale_es;
        } else if (lang === "eu") {
            return $wnd.globalThis.ad_locale_eu;
        } else if (lang === "fi") {
            return $wnd.globalThis.ad_locale_fi;
        } else if (lang === "fr") {
            return $wnd.globalThis.ad_locale_fr;
        } else if (lang === "hr") {
            return $wnd.globalThis.ad_locale_hr;
        } else if (lang === "hu") {
            return $wnd.globalThis.ad_locale_hu;
        } else if (lang === "id") {
            return $wnd.globalThis.ad_locale_id;
        } else if (lang === "it") {
            return $wnd.globalThis.ad_locale_it;
        } else if (lang === "ja") {
            return $wnd.globalThis.ad_locale_ja;
        } else if (lang === "ko") {
            return $wnd.globalThis.ad_locale_ko;
        } else if (lang === "nb") {
            return $wnd.globalThis.ad_locale_nb;
        } else if (lang === "nl") {
            return $wnd.globalThis.ad_locale_nl;
        } else if (lang === "pl") {
            return $wnd.globalThis.ad_locale_pl;
        } else if (lang === "pt") {
            return $wnd.globalThis.ad_locale_pt;
        } else if (lang === "ro") {
            return $wnd.globalThis.ad_locale_ro;
        } else if (lang === "ru") {
            return $wnd.globalThis.ad_locale_ru;
        } else if (lang === "si") {
            return $wnd.globalThis.ad_locale_si;
        } else if (lang === "sk") {
            return $wnd.globalThis.ad_locale_sk;
        } else if (lang === "sl") {
            return $wnd.globalThis.ad_locale_sl;
        } else if (lang === "sv") {
            return $wnd.globalThis.ad_locale_sv;
        } else if (lang === "th") {
            return $wnd.globalThis.ad_locale_th;
        } else if (lang === "tr") {
            return $wnd.globalThis.ad_locale_tr;
        } else if (lang === "uk") {
            return $wnd.globalThis.ad_locale_uk;
        } else if (lang === "zh") {
            return $wnd.globalThis.ad_locale_zh;
        }
    }-*/;

}
