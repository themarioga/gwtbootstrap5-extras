package org.gwtbootstrap5.extras.bootbox.client.options;

/*
 * #%L
 * GwtBootstrap5
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap5
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

/**
 * Bootbox window size.
 *  
 * @author Tercio Gaudencio Filho (terciofilho [at] gmail.com)
 */
public enum BootboxSize {
    
    LARGE("large"), SMALL("small");
    
    private String size;

    private BootboxSize(String size) {
        this.size=size;
    }
    
    public String getSize() {
        return size;
    }
    
}
