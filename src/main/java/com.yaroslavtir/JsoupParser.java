package com.yaroslavtir;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JsoupParser {

    private Tag defaultTag = new DefaultTag();
    public static Map<String, Tag> TAG_MAP = new HashMap<String, Tag>();

    static {
        TAG_MAP.put("img", new EmptyTag());
        TAG_MAP.put("br", new OpenCloseTag("\\\\\n", "", true));
        TAG_MAP.put("b", new OpenCloseTag("*", "*", true));
        TAG_MAP.put("span", new OpenCloseTag("", "", true));
        TAG_MAP.put("tr", new OpenCloseTag("", "\n"));
        TAG_MAP.put("tbody", new EmptyTag());
        TAG_MAP.put("table", new OpenCloseTag("", "\n"));
        TAG_MAP.put("th", new ThTdTag("||"));
        TAG_MAP.put("td", new ThTdTag("|"));
    }
    public static Map<String, StyleTag> STYLE_TAG_MAP = new HashMap<String, StyleTag>();
    static {
        TAG_MAP.put("color_style", new ColorStyleTag());
        TAG_MAP.put("b_style", new BStyleTag());
    }


    String start(String html) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        parse(Jsoup.parse(html).body(), new ElementInfo(Collections.<String, String>emptyMap()), sb);
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis() - start);
        return sb.toString();
    }

    private void parse(Element parentElement, ElementInfo elementInfo, StringBuilder sb) {
        for (Element element : parentElement.children()) {
            Tag tag = TAG_MAP.get(element.tag().getName());
            if (tag != null) processTag(tag, element, elementInfo, sb);
            if (tag == null) processTag(defaultTag, element, elementInfo, sb);
        }
    }

    private void processTag(Tag tag, Element element, ElementInfo elementInfo, StringBuilder sb) {
        ElementInfo newElementInfo = newElementInfo(element, elementInfo);
        tag.open(element, elementInfo, sb);
        tag.print(element, newElementInfo, sb);
        parse(element, newElementInfo, sb);
        tag.close(element, elementInfo, sb);
    }

    private ElementInfo newElementInfo(Element element, ElementInfo OldElementInfo) {

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
            newMap.putAll(OldElementInfo.getStyle());
            newMap.putAll(styleMap);
            return new ElementInfo(newMap);
        }
        return OldElementInfo;
    }

}
