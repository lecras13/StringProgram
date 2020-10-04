package com.epam.task5.logic.placeholder;

import com.epam.task5.logic.placeholder.enums.ProcessorType;

public class TextProcessorFactory {
    public TextProcessor getTextProcessor(ProcessorType type){
        TextProcessor toReturn;
        switch (type) {
            case CHAR:
                toReturn = new CharTextProcessor();
                break;
            case REGEX:
                toReturn = new RegexTextProcessor();
                break;
            case STRING:
                toReturn = new StringTextProcessor();
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}
