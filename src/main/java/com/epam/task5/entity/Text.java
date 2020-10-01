package com.epam.task5.entity;

import java.util.List;


public final class Text {
    private List<String> strings;

    public Text(List<String> strings){
        this.strings = strings;
    }

    public void setStrings(List<String> strings){
        this.strings = strings;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return strings.equals(text.strings);
    }

    @Override
    public int hashCode(){
        return strings.hashCode();
    }

    @Override
    public String toString(){
        return "Text{" +
                "strings=" + strings +
                '}';
    }
}
