package com.epam.task5.logic.placeholder;

import com.epam.task5.logic.placeholder.factory.ProcessorByCharFactory;
import org.junit.Assert;
import org.junit.Test;

public class ProcessorByCharTest {
    @Test
    public void changeCharacterWithRightArguments(){
        TextProcessor textProcessorChar = new ProcessorByCharFactory().createFactory();
        String text = "Java";
        int position = 1;
        String character = "K";
        String result = textProcessorChar.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }

    /*@Test(expected = NumberFormatException.class)
    public void changeCharacterWithWrongArguments(){
        TextProcessor textProcessorChar = new ProcessorByCharFactory().createFactory();
        String text = "Java";
        int position = 60;
        String character = "K";
        String result = textProcessorChar.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }*/
}
