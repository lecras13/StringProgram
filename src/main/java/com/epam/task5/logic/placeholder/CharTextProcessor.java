package com.epam.task5.logic.placeholder;

public class CharTextProcessor implements TextProcessor {
    public String changeCharacter(String text, int position, char character){
        char[] chars = text.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                count = 0;
            }else {
                count++;
            }
            if (count == position){
                chars[i] = character;
            }
        }
        String textAfter = new String(chars);
        return textAfter;
    }
}
