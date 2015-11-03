package com.yaroslavtir;

import org.jsoup.nodes.Element;

public interface Tag {

    void close(Element element, ElementInfo elementInfo, StringBuilder sb);

    void open(Element element, ElementInfo elementInfo, StringBuilder sb);

    void print(Element element,  ElementInfo elementInfo, StringBuilder sb);
}
