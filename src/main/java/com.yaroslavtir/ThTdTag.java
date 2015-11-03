package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class ThTdTag extends PrintableTag {

    final String separator;

    public ThTdTag(String separator) {
        this.separator = separator;
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("||");
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (element.nextElementSibling() == null) {
            sb.append(separator);
        }
    }

    @Override
    protected String beforePrint(String text) {
        if (text.isEmpty()) return " ";
        return text;
    }

}
