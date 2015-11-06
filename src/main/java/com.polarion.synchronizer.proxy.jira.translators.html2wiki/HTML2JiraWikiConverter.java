/*
 * Copyright (C) 2004-2015 Polarion Software
 * All rights reserved.
 * Email: dev@polarion.com
 *
 *
 * Copyright (C) 2004-2015 Polarion Software
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Polarion Software.  This notice must be
 * included on all copies, modifications and derivatives of this
 * work.
 *
 * POLARION SOFTWARE MAKES NO REPRESENTATIONS OR WARRANTIES
 * ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESSED OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. POLARION SOFTWARE
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */
package com.polarion.synchronizer.proxy.jira.translators.html2wiki;

import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Whitelist;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HTML2JiraWikiConverter {

    @NotNull
    private TagContainer tagContainer;
    @NotNull
    private String baseUrl;


    public HTML2JiraWikiConverter(@NotNull TagContainer tagContainer, @NotNull String baseUrl) {
        this.tagContainer = tagContainer;
        this.baseUrl = baseUrl;
    }


    public String convert(String source) {
        StringBuilder sb = new StringBuilder();
        Whitelist whitelist = Whitelist
                .simpleText()
                .addTags(new String[] { "span", "br", "img", "table", "tr", "td", "th" })
                .addProtocols("img", "src", new String[] { "http", "https" })
                .addAttributes(":all", "style", "src")
                .addAttributes("span", "class", "data-type", "data-item-id", "data-revision");
        String cleanHTML = Jsoup.clean(source, whitelist);
        parse(Jsoup.parse(cleanHTML, baseUrl).body(), new ElementInfo(Collections.<String, String> emptyMap()), sb);
        return sb.toString();
    }

    private void parse(Element parentElement, ElementInfo elementInfo, StringBuilder sb) {
        for (Node node : parentElement.childNodes()) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Tag tag = tagContainer.getTagMap().get(element.tag().getName());
                if (tag != null) {
                    ElementInfo newElementInfo = newElementInfo(element, elementInfo);
                    tag.open(element, elementInfo, sb);
                    tag.process(element, newElementInfo, sb);
                    if (tag.isContinue()) {
                        parse(element, newElementInfo, sb);
                    }
                    tag.close(element, elementInfo, sb);
                } else {
                    String text = stripText(element.text()).trim();
                    sb.append(stripText(text));
                }
            } else if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                String text = stripText(textNode.text()).trim();

                if (!"".equals(text)) parseStyles(elementInfo, text, sb);
            }
        }
    }

    private void parseStyles(ElementInfo elementInfo, String text, StringBuilder sb) {
        String style = getStyleBy(elementInfo);
        if (style != null) {
            StyleTag styleTag = tagContainer.getStyleTagMap().get(style);
            if (styleTag != null) {
                ElementInfo newElementInfo = getNewElementInfo(elementInfo, style);
                styleTag.open(elementInfo, text, sb);
                parseStyles(newElementInfo, text, sb);
                styleTag.close(elementInfo, text, sb);
            } else {
                System.out.println();
            }
        } else {
            sb.append(text);
        }
    }


    protected String getStyleBy(ElementInfo elementInfo) {
        Iterator<String> iterator = elementInfo.getStyle().keySet().iterator();
        if (iterator.hasNext()) return iterator.next();
        return null;
    }

    protected ElementInfo getNewElementInfo(ElementInfo oldElementInfo, String excludeElement) {
        Map<String, String> newStyles = new HashMap<String, String>(oldElementInfo.getStyle());
        newStyles.remove(excludeElement);
        return new ElementInfo(newStyles);
    }


    private ElementInfo newElementInfo(Element element, final ElementInfo oldElementInfo) {
        Map<String, String> styleMap = new HashMap<String, String>();
        String style = element.attr("style");
        String[] styles = style.split(";");
        for (String s : styles) {
            String[] keyValue = s.split(":");
            if (keyValue.length > 1) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                if ("color".equals(key) || "font-weight".equals(key)) {
                    styleMap.put(key, value);
                }
            }
        }
        //todo create new map by merge old one and new one
        if (styleMap.size() > 0) {
            HashMap<String, String> newMap = new HashMap<String, String>();
            newMap.putAll(oldElementInfo.getStyle());
            newMap.putAll(styleMap);
            return new ElementInfo(newMap);
        }
        return oldElementInfo;
    }

    private String stripText(String text) {
        int length = text.length();
        char[] oldChars = new char[length + 1];
        text.getChars(0, length, oldChars, 0);
        oldChars[length] = '\0';
        int newLen = -1;
        while (oldChars[++newLen] >= ' ') {
            //
        }

        for (int j = newLen; j < length; j++) {
            char ch = oldChars[j];
            if (ch >= ' ') {
                oldChars[newLen] = ch;
                newLen++;
            }
        }
        return new String(oldChars, 0, newLen);
    }

}
