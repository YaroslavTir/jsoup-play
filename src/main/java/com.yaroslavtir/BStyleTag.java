package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class BStyleTag extends StyleTag {

    public static final String KEY = "font-weight";

    @Override
    protected String getKey() {
        return KEY;
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("*");
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("*");
    }
}
