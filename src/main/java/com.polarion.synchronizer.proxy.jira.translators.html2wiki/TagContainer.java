package com.polarion.synchronizer.proxy.jira.translators.html2wiki;


import java.util.HashMap;
import java.util.Map;


public class TagContainer {

    private Map<String, Tag> tagMap = new HashMap<String, Tag>();
    private Map<String, StyleTag> styleTagMap = new HashMap<String, StyleTag>();

    public TagContainer(){
        tagMap.put("img", new ImgTag());
        tagMap.put("br", new OpenCloseTag("\\\\\n", ""));
        tagMap.put("b", /* new BTag()) */new OpenCloseTag("*", "*", true));
        tagMap.put("table", new OpenCloseTag("", "\n"));
        tagMap.put("tbody", new OpenCloseTag("", ""));
        tagMap.put("tr", new OpenCloseTag("", "\n"));
        tagMap.put("th", new ThTdTag("||"));
        tagMap.put("td", new ThTdTag("|"));

        styleTagMap.put("color", new ColorStyleTag());
        styleTagMap.put("font-weight", new FontWeightStyleTag());
    }

    public Map<String, Tag> getTagMap() {
        return tagMap;
    }

    public Map<String, StyleTag> getStyleTagMap() {
        return styleTagMap;
    }
}