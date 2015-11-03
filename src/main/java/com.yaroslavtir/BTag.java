package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class BTag extends PrintableTag {

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (!element.ownText().isEmpty()) sb.append("*");
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (!element.ownText().isEmpty()) sb.append("*");
    }
}
