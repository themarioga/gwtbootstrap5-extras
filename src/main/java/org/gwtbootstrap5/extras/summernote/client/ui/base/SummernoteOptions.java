package org.gwtbootstrap5.extras.summernote.client.ui.base;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2026 GwtBootstrap5
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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;

/**
 * This class represents Summernote options, that you can use to
 * customize the editor.
 *
 * @author Xiaodong SUN
 */
class SummernoteOptions extends JavaScriptObject {

    /**
     * Default constructor
     */
    protected SummernoteOptions() {}

    /**
     * Creates a new instance of {@link SummernoteOptions}.
     *
     * @return a new instance of {@link SummernoteOptions}.
     */
    static SummernoteOptions newOptions() {
        return JavaScriptObject.createObject().cast();
    }

    final native void setPlaceholder(String placeholder) /*-{
        this.placeholder = placeholder;
    }-*/;

    final native void setFontNames(JsArrayString fontNames) /*-{
        this.fontNames = fontNames;
    }-*/;

    final native void setFontNamesIgnoreCheck(JsArrayString fontNamesIgnoreCheck) /*-{
        this.fontNamesIgnoreCheck = fontNamesIgnoreCheck;
    }-*/;

    final native void setDialogsInBody(boolean dialogsInBody) /*-{
        this.dialogsInBody = dialogsInBody;
    }-*/;

    final native void setDialogsFade(boolean dialogsFade) /*-{
        this.dialogsFade = dialogsFade;
    }-*/;

    final native void setDisableDragAndDrop(boolean disableDragAndDrop) /*-{
        this.disableDragAndDrop = disableDragAndDrop;
    }-*/;

    final native void setShortcuts(boolean shortcuts) /*-{
        this.shortcuts = shortcuts;
    }-*/;

    final native void setShowToolbar(boolean showToolbar) /*-{
        if (!showToolbar)
            this.toolbar = false;
        else if (this.toolbar)
            delete this.toolbar;
    }-*/;

    /**
     * Creates a new toolbar group.
     *
     * @param name e
     * @param buttons e
     * @return e
     */
    static JsArrayMixed newToolbarGroup(String name, ToolbarButton... buttons) {
        JsArrayString arr = JavaScriptObject.createArray().cast();
        for (ToolbarButton button : buttons) {
            arr.push(button.getId());
        }
        return getToolbarGroup(name, arr);
    }

    private static native JsArrayMixed getToolbarGroup(String name, JsArrayString buttons) /*-{
        return [name, buttons];
    }-*/;

    /**
     * Builds the toolbar.
     *
     * @param toolbarGroups e
     * @return e
     */
    static native JsArrayMixed buildToolbar(JsArrayMixed... toolbarGroups) /*-{
        var arr = [];
        for (var i = 0; i < toolbarGroups.length; i++) {
            arr.push(toolbarGroups[i]);
        }
        return arr;
    }-*/;

    final native void setToolbar(Toolbar toolbar) /*-{
        this.toolbar = toolbar.@org.gwtbootstrap5.extras.summernote.client.ui.base.Toolbar::build()();
    }-*/;

    final native void setHeight(int height) /*-{
        this.height = height;
    }-*/;

    final native void setMaxHeight(int maxHeight) /*-{
        this.maxHeight = maxHeight;
    }-*/;

    final native void setMinHeight(int minHeight) /*-{
        this.minHeight = minHeight;
    }-*/;

    final native void setFocus(boolean focus) /*-{
        this.focus = focus;
    }-*/;

    final native void setLanguage(SummernoteLanguage language) /*-{
        this.lang = language.@org.gwtbootstrap5.extras.summernote.client.ui.base.SummernoteLanguage::getCode()();
    }-*/;

    final native void setAirMode(boolean airMode) /*-{
        this.airMode = airMode;
    }-*/;

    final native void setHint(String match, HintHandler searchHandler) /*-{
        this.hint = {
            match: new RegExp(match),
            search: function (keyword, callback) {
                var items = searchHandler.@org.gwtbootstrap5.extras.summernote.client.ui.base.HintHandler::onSearch(Ljava/lang/String;)(keyword);
                var result = [];
                for (var i = 0; i < items.length; i++) {
                    result.push(items[i]);
                }
                callback(result);
            },
            template: function (item) {
                return searchHandler.@org.gwtbootstrap5.extras.summernote.client.ui.base.HintHandler::getTemplate(Ljava/lang/String;)(item);
            },
            content: function (item) {
                return searchHandler.@org.gwtbootstrap5.extras.summernote.client.ui.base.HintHandler::getContent(Ljava/lang/String;)(item);
            }
        };
    }-*/;

}
