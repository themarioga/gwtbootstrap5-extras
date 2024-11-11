package org.gwtbootstrap5.extras.colorpicker.client;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2024 GwtBootstrap5
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
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap5.client.ui.constants.Styles;
import org.gwtbootstrap5.client.ui.html.Div;

public class ColorPicker extends Widget implements HasValue<String>, HasChangeHandlers {

    private final Div colorPickerDiv;

    private boolean valueChangeHandlerInitialized = false;

    public ColorPicker() {
        colorPickerDiv = new Div();
        colorPickerDiv.addStyleName(Styles.ROW);

        setElement((Element) colorPickerDiv.getElement());
        initColorPicker(colorPickerDiv.getElement());
    }

    @Override
    public HandlerRegistration addChangeHandler(ChangeHandler handler) {
        return addDomHandler(handler, ChangeEvent.getType());
    }

    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<String> handler) {
        // Initialization code
        if (!valueChangeHandlerInitialized) {
            valueChangeHandlerInitialized = true;
            addChangeHandler(event -> ValueChangeEvent.fire(ColorPicker.this, getValue()));
        }
        return addHandler(handler, ValueChangeEvent.getType());
    }

    @Override
    public String getValue() {
        return getValueColorPicker(colorPickerDiv.getElement());
    }

    @Override
    public void setValue(String value) {
        setValueColorPicker(colorPickerDiv.getElement(), value);
    }

    @Override
    public void setValue(String value, boolean fireEvent) {
        setValue(value);

        if (fireEvent) {
            fireChangeEvent(value);
        }
    }

    private void fireChangeEvent(String value) {
        ValueChangeEvent.fire(ColorPicker.this, value);
    }

    private native JavaScriptObject initColorPicker(Element e) /*-{
                                                                var that = this;

                                                                var colorPicker = $wnd.$(e).colorpicker({
                                                                customClass: 'colorpicker-responsive',
                                                                format: 'hex',
                                                                container: true,
                                                                inline: true,
                                                                sliders: {
                                                                saturation: {
                                                                maxLeft: 300,
                                                                maxTop: 300
                                                                },
                                                                hue: {
                                                                maxTop: 300
                                                                },
                                                                alpha: {
                                                                maxTop: 300
                                                                }
                                                                }
                                                                });

                                                                colorPicker.on('colorpickerChange', function (event) {
                                                                that.@org.gwtbootstrap5.extras.colorpicker.client.ColorPicker::fireChangeEvent(*)(event.color.toHexString());
                                                                });

                                                                return colorPicker;
                                                                }-*/;

    private native void setValueColorPicker(Element e, String value)/*-{
                                                                    $wnd.$(e).colorpicker('setValue', value);
                                                                    }-*/;

    private native String getValueColorPicker(Element e)/*-{
                                                        return $wnd.$(e).colorpicker('getValue');
                                                        }-*/;

}
