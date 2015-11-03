package com.yaroslavtir;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public abstract class PrintableTag implements Tag {
    public void print(Node node, StringBuilder sb) {
        Element element = (Element) node;
        sb.append(element.ownText());
    }
}
