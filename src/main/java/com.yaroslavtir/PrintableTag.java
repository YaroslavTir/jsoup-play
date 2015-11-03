package com.yaroslavtir;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.HashMap;
import java.util.Map;

public abstract class PrintableTag implements Tag {
    //todo rename ei(or elementInfo in other place) and think about get BTag from map
    public void print(Node node, ElementInfo ei, StringBuilder sb) {
        if (ei.getStyle().get("font-weight") != null) {
            String fontWeight = ei.getStyle().get("font-weight");
            if ("bold".equals(fontWeight)) processTag(new BTag(), node, getNewElementInfo(ei, "font-weight"), sb);
        } else if (ei.getStyle().get("color") != null) {
            String color = ei.getStyle().get("color");
            processTag(new ColorTag(color), node, getNewElementInfo(ei, "color"), sb);
        } else {
            Element element = (Element) node;
            sb.append(element.ownText());
        }
    }

    private ElementInfo getNewElementInfo(ElementInfo oldElementInfo, String excludeElement){
        Map<String, String> newStyles = new HashMap<String, String>(oldElementInfo.getStyle());
        newStyles.remove(excludeElement);
        return new ElementInfo(newStyles);
    }

    private void processTag(Tag tag, Node node, ElementInfo ei, StringBuilder sb) {
        tag.open(node, sb);
        tag.print(node, ei, sb);
        tag.close(node, sb);
    }


}
