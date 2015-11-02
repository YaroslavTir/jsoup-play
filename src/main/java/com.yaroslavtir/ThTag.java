package com.yaroslavtir;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class ThTag extends PrintableTag {

    @Override
    public void open(Node node, StringBuilder sb) {
        sb.append("||");
    }

    @Override
    public void close(Node node, StringBuilder sb) {
        Element elemnet = (Element) node;
        if (elemnet.nextElementSibling() == null) {
            sb.append("||");
        }
    }
}
