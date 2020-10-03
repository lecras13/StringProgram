package com.epam.task5.logic.placeholder;

import com.epam.task5.logic.placeholder.factory.ProcessorByCharFactory;
import org.junit.Assert;
import org.junit.Test;

public class ProcessorByStringTest {
    @Test
    public void changeCharacterWithRightArguments(){
        TextProcessor textProcessorString = new ProcessorByCharFactory().createFactory();
        String text = "Java";
        int position = 1;
        String character = "K";
        String result = textProcessorString.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }
}

