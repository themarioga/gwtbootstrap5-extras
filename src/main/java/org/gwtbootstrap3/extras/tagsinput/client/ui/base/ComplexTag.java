package org.gwtbootstrap3.extras.tagsinput.client.ui.base;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap3
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

/**
 * String Tags implementation used for TagsInput component
 * 
 * It is required to set name of the field which contains value in TagsInput component.
 * String objects are the only one pa
 *
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public class ComplexTag extends JavaScriptObject {

    protected ComplexTag() {}
    
    public static final String ITEM_VALUE_FIELD_NAME = "item_value";
    public static final String ITEM_TEXT_FIELD_NAME = "item_text"; 
    
    /**
     * Creates a new instance of {@link ComplexTag}.
     *
     * @return a new instance of {@link ComplexTag}.
     */
    public static ComplexTag create() {
        return JavaScriptObject.createObject().cast();
    }
    
    public final native void setValue(String value) /*-{
        this.item_value = value;
    }-*/;

    public final native void setText(String text) /*-{
        this.item_text = text;
    }-*/;
    
    public final native void setPayload(String payload) /*-{
        this.payload = payload;
    }-*/;

    public final native String getPayload() /*-{
        return this.payload;
    }-*/;
}
