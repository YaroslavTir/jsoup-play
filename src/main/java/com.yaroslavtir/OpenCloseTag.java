package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class OpenCloseTag extends AbstractTag {
    final String openStr;
    final String closeStr;

    public OpenCloseTag(String openStr, String closeStr) {
        this.openStr = openStr;
        this.closeStr = closeStr;
    }

    @Override
    public void open(Node node, StringBuilder sb) {
        sb.append(openStr);
    }

    @Override
    public void close(Node node, StringBuilder sb) {
        sb.append(closeStr);
    }
}
