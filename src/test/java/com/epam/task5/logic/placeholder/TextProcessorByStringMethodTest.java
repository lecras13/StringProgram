package com.epam.task5.logic.placeholder;

import com.epam.task5.entity.Text;
import org.junit.Assert;
import org.junit.Test;

public class TextProcessorByStringMethodTest {
    @Test
    public void changeCharacterWithRightArguments(){
        ProcessorByStringMethod characterPlaceholderByStringMethod = new ProcessorByStringMethod();
        String forControl = "Java";
        Text text = new Text(forControl);
        String[] mas = new String[]{"1", "K"};
        Text text1 = characterPlaceholderByStringMethod.changeCharacter(text, mas);
        String result = text1.toString();
        Assert.assertEquals(result, "Kava");
    }

    @Test(expected = NumberFormatException.class)
    public void changeCharacterWithWrongArguments(){
        ProcessorByStringMethod characterPlaceholderByStringMethod = new ProcessorByStringMethod();
        String forControl = "Java";
        Text text = new Text(forControl);
        String[] mas = new String[]{"K", "1"};
        Text text1 = characterPlaceholderByStringMethod.changeCharacter(text, mas);
    }
}
