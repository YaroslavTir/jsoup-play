package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class DefaultTag implements Tag {

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public void print(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(element.outerHtml());
    }

}
