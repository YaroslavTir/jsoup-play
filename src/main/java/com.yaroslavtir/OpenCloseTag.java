package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class OpenCloseTag extends PrintableTag {
    final String openStr;
    final String closeStr;

    public OpenCloseTag(String openStr, String closeStr) {
        this.openStr = openStr;
        this.closeStr = closeStr;
    }

    public void open(Node node, StringBuilder sb) {
        sb.append(openStr);
    }

    public void close(Node node, StringBuilder sb) {
        sb.append(closeStr);
    }
}
