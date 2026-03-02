package org.gwtbootstrap5.extras.datetimepicker.client.ui.base;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2016 GwtBootstrap5
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
import com.google.gwt.core.client.JsDate;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.editor.client.HasEditorErrors;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.*;
import org.gwtbootstrap5.client.shared.event.HideEvent;
import org.gwtbootstrap5.client.shared.event.HideHandler;
import org.gwtbootstrap5.client.shared.event.ShowEvent;
import org.gwtbootstrap5.client.shared.event.ShowHandler;
import org.gwtbootstrap5.client.ui.TextBox;
import org.gwtbootstrap5.client.ui.base.ValueBoxBase;
import org.gwtbootstrap5.client.ui.base.*;
import org.gwtbootstrap5.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap5.client.ui.base.mixin.BlankValidatorMixin;
import org.gwtbootstrap5.client.ui.base.mixin.ErrorHandlerMixin;
import org.gwtbootstrap5.client.ui.constants.DeviceSize;
import org.gwtbootstrap5.client.ui.form.error.ErrorHandlerType;
import org.gwtbootstrap5.client.ui.form.error.HasErrorHandler;
import org.gwtbootstrap5.client.ui.form.validator.HasBlankValidator;
import org.gwtbootstrap5.client.ui.form.validator.HasValidators;
import org.gwtbootstrap5.client.ui.form.validator.ValidationChangedEvent.ValidationChangedHandler;
import org.gwtbootstrap5.client.ui.form.validator.Validator;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.constants.*;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.events.ChangeDateEvent;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.events.ChangeDateHandler;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.events.ErrorEvent;
import org.gwtbootstrap5.extras.datetimepicker.client.ui.base.events.ErrorHandler;

import java.util.Date;
import java.util.List;

/**
 * @author Joshua Godi
 * @author Steven Jardine
 * @author themarioga
 */
public class DateTimePickerBase extends Widget implements HasEnabled, HasReadOnly, HasId, HasResponsiveness, HasVisibility,
        HasPlaceholder, HasAutoClose, HasMaximumDate, HasMinuteStep, HasShowTodayButton,
        HasShowClearButton, HasMinimumDate, HasDateTimePickerHandlers, HasLocalization, HasName, HasValue<Date>,
        HasViewMode, LeafValueEditor<Date>, HasEditorErrors<Date>, HasErrorHandler, HasValidators<Date>,
        HasBlankValidator<Date> {

    static class DatePickerValidatorMixin extends BlankValidatorMixin<DateTimePickerBase, Date> {
        private boolean showing = false;

        public void setShowing(boolean showing) {
            this.showing = showing;
        }

        public DatePickerValidatorMixin(DateTimePickerBase inputWidget, org.gwtbootstrap5.client.ui.form.error.ErrorHandler errorHandler) {
            super(inputWidget, errorHandler);
        }

        @Override
        protected com.google.web.bindery.event.shared.HandlerRegistration setupBlurValidation() {
            return getInputWidget().addDomHandler(event -> getInputWidget().validate(!showing && getValidateOnBlur()), BlurEvent.getType());
        }
    }

    private final TextBox textBox;
    private JavaScriptObject tempusDominus;
    private LeafValueEditor<Date> editor;
    private final ErrorHandlerMixin<Date> errorHandlerMixin = new ErrorHandlerMixin<>(this);
    private final DatePickerValidatorMixin validatorMixin = new DatePickerValidatorMixin(this,
            errorHandlerMixin.getErrorHandler());
    private final DateTimePickerProperties properties = new DateTimePickerProperties();
    private DateTimePickerLocale locale = DateTimePickerLocale.EN;

    protected Boolean allowRanges;
    protected Boolean showDatePicker;
    protected Boolean showTimePicker;

    public DateTimePickerBase() {
        textBox = new TextBox();
        setElement((Element) textBox.getElement());
    }

    /**
     * Call this whenever changing any settings: minView, startView, format, etc. If you are changing
     * format and date value, the updates must take in such order:
     * <p/>
     * 1. DateTimePicker.reload()
     * 2. DateTimePicker.setValue(newDate); // Date newDate.
     * <p/>
     * Otherwise date value is not updated.
     */
    public void reload() {
        configure();
    }

    public void show() {
        show(tempusDominus);
    }

    public void hide() {
        hide(tempusDominus);
    }

    @Override
    public void setPlaceholder(final String placeHolder) {
        textBox.setPlaceholder(placeHolder);
    }

    /** {@inheritDoc} */
    @Override
    public String getPlaceholder() {
        return textBox.getPlaceholder();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEnabled() {
        return textBox.isEnabled();
    }

    /** {@inheritDoc} */
    @Override
    public void setEnabled(final boolean enabled) {
        textBox.setEnabled(enabled);
    }

    /** {@inheritDoc} */
    @Override
    public void setId(final String id) {
        textBox.setId(id);
    }

    /** {@inheritDoc} */
    @Override
    public String getId() {
        return textBox.getId();
    }

    /** {@inheritDoc} */
    @Override
    public void setName(final String name) {
        textBox.setName(name);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return textBox.getName();
    }

    @Override
    public void setReadOnly(final boolean readOnly) {
        textBox.setReadOnly(readOnly);
    }

    @Override
    public boolean isReadOnly() {
        return textBox.isReadOnly();
    }

    /** {@inheritDoc} */
    @Override
    public void setVisibleOn(final DeviceSize deviceSize) {
        StyleHelper.setVisibleOn(this, deviceSize);
    }

    /** {@inheritDoc} */
    @Override
    public void setHiddenOn(final DeviceSize deviceSize) {
        StyleHelper.setHiddenOn(this, deviceSize);
    }

    /** {@inheritDoc} */
    @Override
    public void onShow(final Event e) {
        validatorMixin.setShowing(true);
        fireEvent(new ShowEvent(e));
    }

    /** {@inheritDoc} */
    @Override
    public HandlerRegistration addShowHandler(final ShowHandler showHandler) {
        return addHandler(showHandler, ShowEvent.getType());
    }

    /** {@inheritDoc} */
    @Override
    public void onHide(final Event e) {
        validatorMixin.setShowing(false);
        validate(getValidateOnBlur());
        fireEvent(new HideEvent(e));
    }

    /** {@inheritDoc} */
    @Override
    public HandlerRegistration addHideHandler(final HideHandler hideHandler) {
        return addHandler(hideHandler, HideEvent.getType());
    }

    /** {@inheritDoc} */
    @Override
    public void onChangeDate(final Event e) {
        fireEvent(new ChangeDateEvent(e));
        ValueChangeEvent.fire(DateTimePickerBase.this, getValue());
        hide();
    }

    /** {@inheritDoc} */
    @Override
    public HandlerRegistration addChangeDateHandler(final ChangeDateHandler changeDateHandler) {
        return addHandler(changeDateHandler, ChangeDateEvent.getType());
    }

    /** {@inheritDoc} */
    @Override
    public void onError(final Event e) {
        fireEvent(new ErrorEvent(e));
    }

    /** {@inheritDoc} */
    @Override
    public HandlerRegistration addErrorHandler(final ErrorHandler errorHandler) {
        return addHandler(errorHandler, ErrorEvent.getType());
    }

    /** {@inheritDoc} */
    @Override
    public void setLocale(final DateTimePickerLocale locale) {
        if (locale == null) return;

        loadLocale(locale);

        setLocale(locale.getCode());

        this.locale = locale;
    }

    /** {@inheritDoc} */
    @Override
    public DateTimePickerLocale getLocale() {
        return locale;
    }

    @Override
    public void setViewMode(DateTimePickerViewMode viewMode) {
        properties.setViewMode(viewMode.getValue());
    }

    /** {@inheritDoc} */
    @Override
    public void setKeepOpen(final boolean keepOpen) {
        properties.setKeepOpen(keepOpen);
    }

    /** {@inheritDoc} */
    @Override
    public void setMinDate(final Date minDate) {
        properties.setMinDate(JsDate.create(minDate.getTime()));
    }

    /** {@inheritDoc} */
    @Override
    public void clearMinDate() {
        properties.setMinDate(null);
    }

    /** {@inheritDoc} */
    @Override
    public void setMaxDate(final Date maxDate) {
        properties.setMaxDate(JsDate.create(maxDate.getTime()));
    }

    /** {@inheritDoc} */
    @Override
    public void clearMaxDate() {
        properties.setMaxDate(null);
    }

    /** {@inheritDoc} */
    @Override
    public void setMinuteStep(final int minuteStep) {
        properties.setMinuteStepping(minuteStep);
    }

    /** {@inheritDoc} */
    @Override
    public void setShowTodayButton(final boolean showTodayButton) {
        properties.setShowTodayButton(showTodayButton);
    }

    /** {@inheritDoc} */
    @Override
    public void setShowClearButton(final boolean showClearButton) {
        properties.setShowClearButton(showClearButton);
    }

    /** {@inheritDoc} */
    @Override
    public com.google.web.bindery.event.shared.HandlerRegistration addValidationChangedHandler(ValidationChangedHandler handler) {
        return validatorMixin.addValidationChangedHandler(handler);
    }

    /** {@inheritDoc} */
    @Override
    public boolean getAllowBlank() {
        return validatorMixin.getAllowBlank();
    }

    /** {@inheritDoc} */
    @Override
    public void setAllowBlank(boolean allowBlank) {
        validatorMixin.setAllowBlank(allowBlank);
    }

    /** {@inheritDoc} */
    @Override
    public void addValidator(Validator<Date> validator) {
        validatorMixin.addValidator(validator);
    }

    /** {@inheritDoc} */
    @Override
    public boolean getValidateOnBlur() {
        return validatorMixin.getValidateOnBlur();
    }

    /** {@inheritDoc} */
    @Override
    public boolean removeValidator(Validator<Date> validator) {
        return validatorMixin.removeValidator(validator);
    }

    /** {@inheritDoc} */
    @Override
    public void reset() {
        validatorMixin.reset();
    }

    /** {@inheritDoc} */
    @Override
    public void setValidateOnBlur(boolean validateOnBlur) {
        validatorMixin.setValidateOnBlur(validateOnBlur);
    }

    /** {@inheritDoc} */
    @Override
    public void setValidators(@SuppressWarnings("unchecked") Validator<Date>... validators) {
        validatorMixin.setValidators(validators);
    }

    /** {@inheritDoc} */
    @Override
    public boolean validate() {
        return validatorMixin.validate();
    }

    /** {@inheritDoc} */
    @Override
    public boolean validate(boolean show) {
        return validatorMixin.validate(show);
    }

    /** {@inheritDoc} */
    @Override
    public org.gwtbootstrap5.client.ui.form.error.ErrorHandler getErrorHandler() {
        return errorHandlerMixin.getErrorHandler();
    }

    /** {@inheritDoc} */
    @Override
    public void setErrorHandler(org.gwtbootstrap5.client.ui.form.error.ErrorHandler errorHandler) {
        errorHandlerMixin.setErrorHandler(errorHandler);
        validatorMixin.setErrorHandler(errorHandler);
    }

    /** {@inheritDoc} */
    @Override
    public ErrorHandlerType getErrorHandlerType() {
        return errorHandlerMixin.getErrorHandlerType();
    }

    /** {@inheritDoc} */
    @Override
    public void setErrorHandlerType(ErrorHandlerType errorHandlerType) {
        errorHandlerMixin.setErrorHandlerType(errorHandlerType);
    }

    /** {@inheritDoc} */
    @Override
    public void showErrors(List<EditorError> errors) {
        errorHandlerMixin.showErrors(errors);
    }

    /** {@inheritDoc} */
    @Override
    public HandlerRegistration addValueChangeHandler(final ValueChangeHandler<Date> dateValueChangeHandler) {
        textBox.addValueChangeHandler(event -> ValueChangeEvent.fire(DateTimePickerBase.this, getValue()));
        return addHandler(dateValueChangeHandler, ValueChangeEvent.getType());
    }

    public void clear() {
        clear(tempusDominus);
    }

    /** {@inheritDoc} */
    @Override
    public Date getValue() {
        try {
            return new Date((long) getViewDate(tempusDominus).getTime());
        } catch (final Exception e) {
            return null;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void setValue(final Date value) {
        setValue(value, false);
    }

    /** {@inheritDoc} */
    @Override
    public void setValue(final Date value, final boolean fireEvents) {
        errorHandlerMixin.clearErrors();

        if (value == null) {
            clear();
        } else {
            setViewDate(tempusDominus, JsDate.create(value.getTime()));
        }

        if (fireEvents) {
            ValueChangeEvent.fire(DateTimePickerBase.this, value);
        }
    }

    /** {@inheritDoc} */
    @Override
    protected void onLoad() {
        super.onLoad();
        configure();
    }

    /** {@inheritDoc} */
    @Override
    protected void onUnload() {
        super.onUnload();
        destroy(tempusDominus);
    }

    protected void setFormat(String format) {
        changeFormat(tempusDominus, format);
    }

    protected void configure() {
        if (allowRanges == null || showDatePicker == null || showTimePicker == null)
            throw new IllegalArgumentException("allowRanges, showDatePicker and showTimePicker cannot be null");

        // If configuring not for the first time, datetimepicker must be removed first.
        destroy(tempusDominus);

        loadLocale(locale);

        tempusDominus = configure(getElement(), allowRanges, showDatePicker, showTimePicker, properties.toJavaScript());

        setLocale(locale);
    }

    protected native void destroy(JavaScriptObject td) /*-{
        if (td) {
            td.dispose();
        }
    }-*/;

    protected native void clear(JavaScriptObject td) /*-{
        if (td) {
            td.clear();
        }
    }-*/;

    protected native void disable(JavaScriptObject td) /*-{
        if (td) {
            td.disable();
        }
    }-*/;

    protected native void enable(JavaScriptObject td) /*-{
        if (td) {
            td.enable();
        }
    }-*/;

    protected native void toggle(JavaScriptObject td) /*-{
        if (td) {
            td.toggle();
        }
    }-*/;

    protected native void show(JavaScriptObject td) /*-{
        if (td) {
            td.show();
        }
    }-*/;

    protected native void hide(JavaScriptObject td) /*-{
        if (td) {
            td.hide();
        }
    }-*/;

    protected native void changeFormat(JavaScriptObject td, String format) /*-{
        if (td) {
            td.updateOptions({localization: {format: format}})
        }
    }-*/;

    protected native JsDate getViewDate(JavaScriptObject td) /*-{
        if (td) {
            return td.viewDate;
        }

        return null;
    }-*/;

    protected native void setViewDate(JavaScriptObject td, JsDate date) /*-{
        if (td) {
            if (date) {
                var obj = $wnd.tempusDominus.DateTime.convert(date);
                td.viewDate = obj;
                td.dates.setValue(obj);
            } else {
                td.clear();
            }
        }
    }-*/;

    protected native JavaScriptObject configure(Element e, boolean allowRanges, boolean showDatePicker, boolean showTimePicker, JavaScriptObject properties) /*-{
        var that = this;

        properties.dateRange = allowRanges;
        properties.display.components.calendar = showDatePicker;
        properties.display.components.clock = showTimePicker;

        var timepicker = new $wnd.tempusDominus.TempusDominus(e, properties);

        $wnd.jQuery(e).on('show.td', function (e) {
            that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerBase::onShow(Lcom/google/gwt/user/client/Event;)(e);
        })
        .on("hide.td", function (e) {
            that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerBase::onHide(Lcom/google/gwt/user/client/Event;)(e);
        })
        .on("change.td", function (e) {
            that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerBase::onChangeDate(Lcom/google/gwt/user/client/Event;)(e);
        })
        .on("error.td", function (e) {
            that.@org.gwtbootstrap5.extras.datetimepicker.client.ui.base.DateTimePickerBase::onError(Lcom/google/gwt/user/client/Event;)(e);
        });

        return timepicker;
    }-*/;

    private void loadLocale(DateTimePickerLocale locale) {
        // Inject the JS for the language
        if (locale.getJs() != null) {
            ScriptInjector.fromString(locale.getJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        }

        JavaScriptObject jso = DateTimePickerLocale.getLocale(locale.getCode());

        loadLocale(jso);
    }

    private native void loadLocale(JavaScriptObject locale) /*-{
        //load the locale
        $wnd.tempusDominus.loadLocale(locale);

        //globally
        $wnd.tempusDominus.locale(locale.name); //set the default options to use from the plugin
    }-*/;

    private void setLocale(String langCode) {
        if (tempusDominus == null) return;
        setLocale(tempusDominus, langCode);
    }

    private native void setLocale(JavaScriptObject td, String langCode) /*-{
        td.locale(langCode);
    }-*/;

    private native String getFormat(JavaScriptObject td) /*-{
        return td.options.localization.format;
    }-*/;

    public void setAlignment(final ValueBoxBase.TextAlignment align) {
        textBox.setAlignment(align);
    }

    public String getFormat() {
        return getFormat(tempusDominus);
    }

    public DateTimePickerProperties getProperties() {
        return properties;
    }

    public String getBaseValue() {
        return textBox.getValue();
    }

    public TextBox getTextBox() {
        return textBox;
    }

}
