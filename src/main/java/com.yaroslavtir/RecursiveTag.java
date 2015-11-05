package com.yaroslavtir;

import org.jsoup.nodes.Element;

public abstract class RecursiveTag implements Tag {

    public void process(Element element, ElementInfo elementInfo, StringBuilder sb) {
        // do nothing by default
    }

    public boolean isContinue() {
        return true;
    }
}
