package com.yaroslavtir;

import org.jsoup.nodes.Element;

public class OpenCloseTag extends PrintableTag {
    final String openStr;
    final String closeStr;
    final boolean isPrint;

    public OpenCloseTag(String openStr, String closeStr, boolean isPrint) {
        this.openStr = openStr;
        this.closeStr = closeStr;
        this.isPrint = isPrint;
    }

    public OpenCloseTag(String openStr, String closeStr) {
        this(openStr, closeStr, false);
    }


    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(openStr);
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(closeStr);
    }


    @Override
    public void print(Element element, ElementInfo elementInfo, StringBuilder sb) {
        if (isPrint) super.print(element, elementInfo, sb);
    }
}
