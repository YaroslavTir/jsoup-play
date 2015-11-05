package com.yaroslavtir;

public class BStyleTag implements StyleTag {

    public void open(ElementInfo elementInfo, String text, StringBuilder sb) {
        if (!text.isEmpty()) sb.append("*");
    }

    public void close(ElementInfo elementInfo, String text, StringBuilder sb) {
        if (!text.isEmpty()) sb.append("*");
    }

}
