package com.epam.task5.logic.placeholder;

import com.epam.task5.entity.Text;

public class CharacterPlaceholderByRegularExp implements CharacterPlaceholder {
    public Text changeCharacter(Text text, String[] parameters){
        String toEdit = text.getStrings();
        int numberCharacter = Integer.parseInt(parameters[0]);
        char toChange = parameters[1].charAt(0);
        String toReturn = toEdit.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", numberCharacter - 1), "$1" + toChange);
        return new Text(toReturn);
    }
}



