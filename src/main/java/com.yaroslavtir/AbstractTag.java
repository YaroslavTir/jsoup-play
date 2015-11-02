package com.yaroslavtir;

import org.jsoup.nodes.Node;

public class AbstractTag {

    public void close(Node node, StringBuilder sb) {
        // do nothing by default
    }

    public void open(Node node, StringBuilder sb) {
        // do nothing by default
    }


    public void print(Node node, StringBuilder sb){
        // do nothing by default
    }


}
