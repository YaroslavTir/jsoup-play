package com.yaroslavtir;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsoupParser {

    private Tag defaultTag = new DefaultTag();
    public static Map<String, Tag> TAG_MAP = new HashMap<String, Tag>();
    public static Map<String, StyleTag> STYLE_TAG_MAP = new HashMap<String, StyleTag>();

    static {
//        TAG_MAP.put("img", new ImgTag());
        TAG_MAP.put("img", new EmptyTag());
        TAG_MAP.put("br", new OpenCloseTag("\\\\\n", "", true));
        TAG_MAP.put("b", new BTag());
//        TAG_MAP.put("span", new OpenCloseTag("", "", true));
        TAG_MAP.put("tr", new OpenCloseTag("", "\n"));
        TAG_MAP.put("tbody", new EmptyTag());
        TAG_MAP.put("table", new OpenCloseTag("", "\n"));
        TAG_MAP.put("th", new ThTdTag("||"));
        TAG_MAP.put("td", new ThTdTag("|"));
    }

    static {
        STYLE_TAG_MAP.put("color", new ColorStyleTag());
        STYLE_TAG_MAP.put("font-weight", new BStyleTag());
    }


    String start(String html) {
        StringBuilder sb = new StringBuilder();
        parse(Jsoup.parse(html).body(), new ElementInfo(Collections.<String, String>emptyMap()), sb);
        return sb.toString();
    }

    private void parse(Element parentElement, ElementInfo elementInfo, StringBuilder sb) {
        for (Node node : parentElement.childNodes()) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Tag tag = TAG_MAP.get(element.tag().getName());
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
            StyleTag styleTag = JsoupParser.STYLE_TAG_MAP.get(style);
            if (styleTag != null) {
                ElementInfo newElementInfo = getNewElementInfo(elementInfo, style);
                styleTag.open(elementInfo, text, sb);
                parseStyles(newElementInfo, text, sb);
                styleTag.close(elementInfo, text, sb);
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
