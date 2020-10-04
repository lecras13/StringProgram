package com.epam.task5.logic.placeholder;

public class StringTextProcessor implements TextProcessor {
    public String changeCharacter(String text, int position, char character){
        String[] words = parseData(text);

        String[] wordsFromText = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= position) {
                StringBuilder stringBuilder = new StringBuilder(words[i]);
                stringBuilder.setCharAt(position-1,character);
                wordsFromText[i] = stringBuilder.toString();
                continue;
            }
            wordsFromText[i] = words[i];
        }
        String textAfterChange = stringConverte(wordsFromText).trim();
        return textAfterChange;
    }

    private String[] parseData(String data){
        String[] parseData = data.split(" ");
        return parseData;
    }

    private String stringConverte(String[] data){
        String afterConvert = " ";
        for (int i = 0; i < data.length; i++) {
            afterConvert += data[i] + " ";
        }
        afterConvert.trim();
        return afterConvert;
    }
}