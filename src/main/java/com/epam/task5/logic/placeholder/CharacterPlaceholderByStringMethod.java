package com.epam.task5.logic.placeholder;

import com.epam.task5.entity.Text;
import com.epam.task5.logic.placeholder.CharacterPlaceholder;

public class CharacterPlaceholderByStringMethod implements CharacterPlaceholder {
    public Text changeCharacter(Text text, String[] parameters){
        String toEdit = text.getStrings();
        String[] words = parseData(toEdit);
        int numberCharacter = Integer.parseInt(parameters[0]);
        String toChange = parameters[1];

        String[] toReturn = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= numberCharacter) {
                String changing = words[i].substring(numberCharacter - 1, numberCharacter);
                String toAdd = words[i].replace(changing, toChange);
                toReturn[i] = toAdd;
                continue;
            }
            toReturn[i] = words[i];
        }
        return new Text(stringConverte(toReturn));
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