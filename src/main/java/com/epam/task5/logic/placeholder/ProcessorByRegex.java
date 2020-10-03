package com.epam.task5.logic.placeholder;

public class ProcessorByRegex implements TextProcessor {
    public String changeCharacter(String text,  int position, String character){
        String textAfter = text.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", position - 1), "$1" + character);
        return textAfter;
    }
}



