package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class BStyleTag extends StyleTag {

    public static final String KEY = "font-weight";
    private final BTag btag = new BTag();

    @Override
    protected String getKey() {
        return KEY;
    }

    private void printStyleTag(Element element, ElementInfo elementInfo, StringBuilder sb) {
        open(element, elementInfo, sb);
        close(element, elementInfo, sb);
    }

    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        btag.open(element, elementInfo, sb);
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        btag.close(element, elementInfo, sb);
    }


}
