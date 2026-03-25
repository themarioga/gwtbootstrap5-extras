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

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Sven Jacobs
 */
public interface AirDatepickerClientBundle extends ClientBundle {

    AirDatepickerClientBundle INSTANCE = GWT.create(AirDatepickerClientBundle.class);

    String AIR_DATEPICKER = "air-datepicker-3.5.3";

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/air-datepicker.min.cache.js")
    TextResource airDatepicker();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ar.js")
    TextResource adlocales_ar();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/bg.js")
    TextResource adlocales_bg();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/br.js")
    TextResource adlocales_br();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ca.js")
    TextResource adlocales_ca();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/cs.js")
    TextResource adlocales_cs();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/da.js")
    TextResource adlocales_da();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/de.js")
    TextResource adlocales_de();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/el.js")
    TextResource adlocales_el();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/en.js")
    TextResource adlocales_en();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/es.js")
    TextResource adlocales_es();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/eu.js")
    TextResource adlocales_eu();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/fi.js")
    TextResource adlocales_fi();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/fr.js")
    TextResource adlocales_fr();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/hr.js")
    TextResource adlocales_hr();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/hu.js")
    TextResource adlocales_hu();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/id.js")
    TextResource adlocales_id();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/it.js")
    TextResource adlocales_it();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ja.js")
    TextResource adlocales_ja();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ko.js")
    TextResource adlocales_ko();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/nb.js")
    TextResource adlocales_nb();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/nl.js")
    TextResource adlocales_nl();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/pl.js")
    TextResource adlocales_pl();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/pt.js")
    TextResource adlocales_pt();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ro.js")
    TextResource adlocales_ro();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/ru.js")
    TextResource adlocales_ru();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/si.js")
    TextResource adlocales_si();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/sk.js")
    TextResource adlocales_sk();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/sl.js")
    TextResource adlocales_sl();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/sv.js")
    TextResource adlocales_sv();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/th.js")
    TextResource adlocales_th();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/tr.js")
    TextResource adlocales_tr();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/uk.js")
    TextResource adlocales_uk();

    @Source("../../../resource/" + AIR_DATEPICKER + "/js/locales.cache/zh.js")
    TextResource adlocales_zh();

}
