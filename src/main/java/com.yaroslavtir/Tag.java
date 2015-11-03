package com.yaroslavtir;

import org.jsoup.nodes.Node;

public interface Tag {

    void close(Node node, StringBuilder sb);

    void open(Node node, StringBuilder sb);

    void print(Node node, StringBuilder sb);
}
