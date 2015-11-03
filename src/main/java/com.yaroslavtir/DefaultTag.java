package com.yaroslavtir;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class DefaultTag implements Tag {

    public void close(Node node, StringBuilder sb) {
        // do nothing by default
    }

    public void open(Node node, StringBuilder sb) {
        // do nothing by default
    }

    public void print(Node node, ElementInfo ei, StringBuilder sb) {
        Element element = (Element) node;
        sb.append(element.outerHtml());
    }


}
