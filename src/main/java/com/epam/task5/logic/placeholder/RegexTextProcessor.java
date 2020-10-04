package com.epam.task5.logic.placeholder;

public class RegexTextProcessor implements TextProcessor {
    private static final String TEXT_REGEX  = "(\\b\\p{L}{%d})\\p{L}";

    public String changeCharacter(String text,  int position, char character){
        String textAfter = text.replaceAll(String.format(TEXT_REGEX, position - 1), "$1" + character);
        return textAfter;
    }
}



