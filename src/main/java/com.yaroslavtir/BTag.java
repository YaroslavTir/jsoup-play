package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class BTag extends PrintableTag {

    public void open(Node node, StringBuilder sb) {
        sb.append("*");
    }

    public void close(Node node, StringBuilder sb) {
        sb.append("*");
    }


}
