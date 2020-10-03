package com.epam.task5.logic.placeholder;

public class ProcessorByStringMethod implements TextProcessor {
    public String changeCharacter(String text, int position, String character){
        String[] words = parseText(text);
        String textAfter = new String();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= position) {
                String toChange = words[i].substring(position - 1, position);
                String toAdd = words[i].replace(toChange, character);
                textAfter = toAdd + " ";
                continue;
            }
            textAfter = words[i] + " ";
        }
        return textAfter;
    }

    private String[] parseText(String data){
        String[] parseText = data.split(" ");
        return parseText;
    }
}