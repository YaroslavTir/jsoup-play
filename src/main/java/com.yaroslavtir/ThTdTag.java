package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class ThTdTag extends RecursiveTag {

    final String separator;

    public ThTdTag(String separator) {
        this.separator = separator;
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(separator);
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (element.nextElementSibling() == null) {
            sb.append(separator);
        }
    }

    @Override
    public void process(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (element.ownText().isEmpty()) sb.append(" ");
    }


}
