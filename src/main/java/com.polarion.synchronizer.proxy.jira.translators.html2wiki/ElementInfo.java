package com.polarion.synchronizer.proxy.jira.translators.html2wiki;


import java.util.Map;

public class ElementInfo {

    private final Map<String, String> style;

    public ElementInfo(Map<String, String> style) {
        this.style = style;
    }

    public Map<String, String> getStyle() {
        return style;
    }
}
