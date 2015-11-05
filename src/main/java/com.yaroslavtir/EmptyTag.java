package com.yaroslavtir;


import org.jsoup.nodes.Element;

public class EmptyTag extends RecursiveTag{
    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }
}
