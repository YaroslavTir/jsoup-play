package com.yaroslavtir;

        import org.jsoup.nodes.Element;

        import java.util.HashMap;
        import java.util.Map;

public abstract class StyleTag extends PrintableTag {

    protected abstract String getKey();

    @Override
    public void process(Element element, ElementInfo elementInfo, StringBuilder sb) {
        super.process(element, getNewElementInfo(elementInfo, getKey()), sb);
    }

    //todo maybe rename, because in this method we just create new map without one element
    protected ElementInfo getNewElementInfo(ElementInfo oldElementInfo, String excludeElement) {
        Map<String, String> newStyles = new HashMap<String, String>(oldElementInfo.getStyle());
        newStyles.remove(excludeElement);
        return new ElementInfo(newStyles, oldElementInfo.getTagText());
    }

    @Override
    protected String getText(Element element, ElementInfo elementInfo) {
        return elementInfo.getTagText();
    }
}
