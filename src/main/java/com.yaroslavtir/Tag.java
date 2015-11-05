package com.yaroslavtir;

import org.jsoup.nodes.Element;

public interface Tag {

    void open(Element element, ElementInfo elementInfo, StringBuilder sb);

    void close(Element element, ElementInfo elementInfo, StringBuilder sb);

    void process(Element element, ElementInfo elementInfo, StringBuilder sb);

    boolean isContinue();

}
