package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class ImgTag implements Tag{
    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("!");
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append("!");
    }

    public void print(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(element.attr("src"));
    }
}