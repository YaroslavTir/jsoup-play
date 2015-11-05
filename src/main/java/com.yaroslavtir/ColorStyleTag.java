package com.yaroslavtir;

public class ColorStyleTag implements StyleTag {

    public static final String KEY = "color";

    public void open(ElementInfo elementInfo, String text, StringBuilder sb) {
        String color = elementInfo.getStyle().get(KEY);
        sb.append("{color:" + color + "}");
    }

    public void close(ElementInfo elementInfo, String text, StringBuilder sb) {
        sb.append("{color}");
    }
}
