package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class ColorStyleTag extends StyleTag {

    public static final String KEY = "color";

    @Override
    protected String getKey() {
        return KEY;
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        String color = elementInfo.getStyle().get(KEY);
        sb.append("{color:" + color + "}");
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("{color}");
    }
}
