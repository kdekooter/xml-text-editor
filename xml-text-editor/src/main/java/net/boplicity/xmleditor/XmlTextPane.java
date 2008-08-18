/*
 * Copyright 2006-2008 Kees de Kooter
 *
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
 */
package net.boplicity.xmleditor;

import javax.swing.JTextPane;


/**
 * JTextPane implementation that can handle xml text.
 *  
 * @author kees
 * @date 27-jan-2006
 *
 */
public class XmlTextPane extends JTextPane {

    private static final long serialVersionUID = 6270183148379328084L;

    public XmlTextPane() {
        
        // Set editor kit
        this.setEditorKitForContentType("text/xml", new XmlEditorKit());
        this.setContentType("text/xml");
    }
    
}
