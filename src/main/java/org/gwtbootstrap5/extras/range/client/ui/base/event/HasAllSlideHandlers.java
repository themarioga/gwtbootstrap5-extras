package org.gwtbootstrap5.extras.range.client.ui.base.event;

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

import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;

/**
 * Convenience interface used to implement all slide handlers at once.
 *
 * @param <T> slider value type
 */
public interface HasAllSlideHandlers<T> extends HasSlideHandlers<T>,
        HasSlideStartHandlers<T>, HasSlideStopHandlers<T>, HasValueChangeHandlers<T>,
        HasSlideEnabledHandlers, HasSlideDisabledHandlers {

    /**
     * The {@link SlideEvent} name
     */
    String SLIDE_EVENT = "slide";

    /**
     * The {@link SlideStartEvent} name
     */
    String SLIDE_START_EVENT = "slideStart";

    /**
     * The {@link SlideStopEvent} name
     */
    String SLIDE_STOP_EVENT = "slideStop";

    /**
     * The {@link ValueChangeEvent} name
     */
    String SLIDE_CHANGE_EVENT = "change";

    /**
     * The {@link SlideEnabledEvent} name
     */
    String SLIDE_ENABLED_EVENT = "slideEnabled";

    /**
     * The {@link SlideDisabledEvent} name
     */
    String SLIDE_DISABLED_EVENT = "slideDisabled";

}
