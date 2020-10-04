package com.epam.task5.logic.placeholder;

import com.epam.task5.logic.placeholder.enums.ProcessorType;
import org.junit.Assert;
import org.junit.Test;

public class TextProcessorTest {
    @Test
    public void charTextProcessorWithRightArguments(){
        TextProcessorFactory textProcessorFactory = new TextProcessorFactory();
        TextProcessor textProcessor = textProcessorFactory.getTextProcessor(ProcessorType.CHAR);
        String text = "Java";
        int position = 1;
        char character = 'K';
        String result = textProcessor.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }

    @Test
    public void regexTextProcessorWithRightArguments(){
        TextProcessorFactory textProcessorFactory = new TextProcessorFactory();
        TextProcessor textProcessor = textProcessorFactory.getTextProcessor(ProcessorType.REGEX);
        String text = "Java";
        int position = 1;
        char character = 'K';
        String result = textProcessor.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }

    @Test
    public void stringTextProcessorWithRightArguments(){
        TextProcessorFactory textProcessorFactory = new TextProcessorFactory();
        TextProcessor textProcessor = textProcessorFactory.getTextProcessor(ProcessorType.STRING);
        String text = "Java";
        int position = 1;
        char character = 'K';
        String result = textProcessor.changeCharacter(text, position, character);
        Assert.assertEquals(result, "Kava");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringTextProcessorWithWrongProcessorType(){
        TextProcessorFactory textProcessorFactory = new TextProcessorFactory();
        TextProcessor textProcessor = textProcessorFactory.getTextProcessor(ProcessorType.TEST);
    }




}
