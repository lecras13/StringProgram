package com.epam.task5.logic.placeholder;

public class ProcessorByString implements TextProcessor {
    public String changeCharacter(String text, int position, String character){
        String[] words = parseData(text);

        String[] toReturn = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= position) {
                StringBuilder stringBuilder = new StringBuilder(words[i]);
                stringBuilder.setCharAt(position-1,character.charAt(0));
                toReturn[i] = stringBuilder.toString();
                continue;
            }
            toReturn[i] = words[i];
        }
        String textAfter = stringConverte(toReturn).trim();
        return textAfter;
    }

    private String[] parseData(String data){
        String[] parseData = data.split(" ");
        return parseData;
    }

    private String stringConverte(String[] data){
        String toReturn = " ";
        for (int i = 0; i < data.length; i++) {
            toReturn += data[i] + " ";
        }
        toReturn.trim();
        return toReturn;
    }
}