package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class BTag extends PrintableTag {

    @Override
    public void open(Node node, StringBuilder sb) {
        sb.append("*");
    }

    @Override
    public void close(Node node, StringBuilder sb) {
        sb.append("*");
        sb.append("\n");
    }


}
