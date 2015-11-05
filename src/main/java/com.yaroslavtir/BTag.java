package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class BTag extends RecursiveTag {

    private BStyleTag bStyleTag = new BStyleTag();

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        bStyleTag.close(elementInfo, element.ownText(), sb);
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        bStyleTag.open(elementInfo, element.ownText(), sb);
    }
}
