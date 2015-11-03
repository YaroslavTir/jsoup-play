package com.yaroslavtir;

import org.jsoup.nodes.Element;

import java.util.Map;

public abstract class PrintableTag implements Tag {


    //todo think about get BStyleTag from map
    //todo maybe replace with ENUM
    public void print(Element element, ElementInfo elementInfo, StringBuilder sb) {
        StyleTag styleTag = getStyleTagBy(elementInfo);
        if (styleTag != null) {
            printStyleTag(styleTag, element, elementInfo, sb);
        } else {
            sb.append(beforePrint(element.ownText()));
        }
    }

    protected String beforePrint(String text) {
        return text;
    }

    protected StyleTag getStyleTagBy(ElementInfo elementInfo) {
        Map<String, String> styleMap = elementInfo.getStyle();
        if (styleMap.get("font-weight") != null) {
            if ("bold".equals(styleMap.get("font-weight")))
                return JsoupParser.STYLE_TAG_MAP.get("b_style");
        } else if (styleMap.get("color") != null) {
            return JsoupParser.STYLE_TAG_MAP.get("color_style");
        }
        return null;
    }

    private void printStyleTag(Tag tag, Element element, ElementInfo elementInfo, StringBuilder sb) {
        tag.open(element, elementInfo, sb);
        tag.print(element, elementInfo, sb);
        tag.close(element, elementInfo, sb);
    }

}
