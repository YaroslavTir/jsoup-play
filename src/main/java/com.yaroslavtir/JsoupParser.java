package com.yaroslavtir;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JsoupParser {

    private Tag defaultTag = new DefaultTag();
    private Map<String, Tag> tagMap = new HashMap<String, Tag>();

    String start(String html) {
        init();
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        parse(Jsoup.parse(html).body(), new ElementInfo(Collections.<String, String>emptyMap()), sb);
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis() - start);
        return sb.toString();
    }

    void init() {
//        tagMap.put("img", new EmptyTag());
        tagMap.put("b", new BTag());
        tagMap.put("br", new BrTag());
        tagMap.put("span", new OpenCloseTag("", ""));
        tagMap.put("tr", new OpenCloseTag("", "\n"));
        tagMap.put("tbody", new EmptyTag());
        tagMap.put("table", new OpenCloseTag("", "\n"));
        tagMap.put("th", new ThTag());
        tagMap.put("td", new TdTag());
    }

    private void parse(Element parentElement, ElementInfo elementInfo, StringBuilder sb) {
        for (Node node : parentElement.childNodes()) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Tag tag = tagMap.get(element.tag().getName());
                if (tag != null) processTag(tag, element, elementInfo, sb);
                if (tag == null) processTag(defaultTag, element, elementInfo, sb);
            }
        }
    }
    private void processTag(Tag tag, Element element, ElementInfo elementInfo, StringBuilder sb) {
        tag.open(element, sb);
        tag.print(element, elementInfo, sb);
        ElementInfo newElementInfo = elementInfo;

        Map<String, String> styleMap = new HashMap<String, String>();
        String style = element.attr("style");
        String[] styles = style.split(";");
        for (String s : styles) {
            String[] keyValue = s.split(":");
            if (keyValue.length > 1) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                if ("color".equals(key) || "font-weight".equals(key)){
                    styleMap.put(key, value);
                }
            }
        }
        if (styleMap.size()>0){
            HashMap<String, String> newMap = new HashMap<String, String>();
            newMap.putAll(elementInfo.getStyle());
            newMap.putAll(styleMap);
            newElementInfo = new ElementInfo(newMap);
        }
        parse(element, newElementInfo, sb);
        tag.close(element, sb);
    }

}
