package com.epam.task5.logic.placeholder;

import com.epam.task5.logic.placeholder.factory.ProcessorByCharFactory;
import org.junit.Assert;
import org.junit.Test;

public class ProcessorByRegexTest {
    @Test
    public void changeCharacterWithRightArguments(){
        TextProcessor textProcessorRegex = new ProcessorByCharFactory().createFactory();
        String text = "Java";
        int position = 1;
        String character = "K";
        String result = textProcessorRegex.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }
}
