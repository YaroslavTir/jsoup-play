package com.yaroslavtir;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.HashMap;
import java.util.Map;

public class JsoupParser {

    Map<String, AbstractTag> tagMap = new HashMap<String, AbstractTag>();

    String start(String html) {
        init();
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        parse(Jsoup.parse(html).body(), sb);
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis() - start);
        return sb.toString();
    }

    void init() {
        tagMap.put("b", new OpenCloseTag("*", "*"));
        tagMap.put("tr", new OpenCloseTag("", "\n"));
        tagMap.put("tbody", new EmptyTag());
        tagMap.put("table", new EmptyTag());
        tagMap.put("th", new ThTag());
        tagMap.put("td", new TdTag());
    }

    private void parse(Element element, StringBuilder sb) {
        for (Node node : element.childNodes()) {
            parseElement(node, sb);
        }
    }

    public void parseElement(Node node, StringBuilder sb) {
        if (node instanceof Element) {
            Element element = (Element) node;
            AbstractTag tag = tagMap.get(element.tag().getName());
            if (tag != null) {
                tag.open(element, sb);
                tag.print(element, sb);
                parse(element, sb);
                tag.close(element, sb);
            }
        }
    }

}
