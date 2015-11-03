package com.yaroslavtir;


import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class EmptyTag implements Tag {
    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public void print(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

}
