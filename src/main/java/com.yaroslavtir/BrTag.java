package com.yaroslavtir;


import org.jsoup.nodes.Node;

public class BrTag extends PrintableTag {
    public void open(Node node, StringBuilder sb) {
        sb.append("\\\\");
        sb.append("\n");
    }

    public void close(Node node, StringBuilder sb) {}


}
