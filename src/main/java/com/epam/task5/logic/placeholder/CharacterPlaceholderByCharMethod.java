package com.epam.task5.logic.placeholder;

import com.epam.task5.entity.Text;

public class CharacterPlaceholderByCharMethod implements CharacterPlaceholder {
    public Text changeCharacter(Text text, String[] parameters){
        String toEdit = text.getStrings();
        char[] chars = toEdit.toCharArray();
        int numberCharacter = Integer.parseInt(parameters[0]);
        char toChange = parameters[1].charAt(0);
        int count = 0;

        for (int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                count = 0;
            }else {
                count++;
            }
            if (count == numberCharacter){
                chars[i] = toChange;
            }
        }
        String toReturn = new String(chars);
        return new Text(toReturn);
    }
}
