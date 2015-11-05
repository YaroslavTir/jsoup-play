package com.yaroslavtir;

public interface StyleTag {
    void open(ElementInfo elementInfo, String text, StringBuilder sb);
    void close( ElementInfo elementInfo, String text, StringBuilder sb);
}
