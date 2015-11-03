package com.yaroslavtir;


import java.util.Map;

public class ElementInfo {

    private final Map<String, String> style;

    private final String tagText;

    public ElementInfo(Map<String, String> style, String tagText) {
        this.style = style;
        this.tagText = tagText;
    }

    public ElementInfo(Map<String, String> style) {
        this(style, null);
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public String getTagText() {
        return tagText;
    }

    //todo move extend method here

}
