package com.epam.task5.entity;

public final class Text {
    private String data;

    public Text(String strings){
        this.data = strings;
    }

    public String getStrings(){
        return data;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return data != null ? data.equals(text.data) : text.data == null;
    }

    @Override
    public int hashCode(){
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString(){
        return data;
    }
}
