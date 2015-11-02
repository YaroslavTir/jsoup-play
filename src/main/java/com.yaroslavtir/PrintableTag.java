package com.yaroslavtir;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class PrintableTag extends  AbstractTag {
    public void print(Node node, StringBuilder sb){
        Element elemnet = (Element) node;
        sb.append(elemnet.text());
    }
}
