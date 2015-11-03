package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class ColorTag extends PrintableTag{
    private String color;

    public ColorTag(String color) {
        this.color = color;
    }

    public void open(Node node, StringBuilder sb) {
        sb.append("{color:"+color+"}");
    }

    public void close(Node node, StringBuilder sb) {
        sb.append("{color}");
    }
}
