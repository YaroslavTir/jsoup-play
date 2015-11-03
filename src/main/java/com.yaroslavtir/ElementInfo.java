package com.yaroslavtir;


import java.util.HashMap;
import java.util.Map;

public class ElementInfo {
    private Map<String,String> style = new HashMap<String, String>();

    public ElementInfo(Map<String, String> style) {
        this.style = style;
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public void setStyle(Map<String, String> style) {
        this.style = style;
    }
}
