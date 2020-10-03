package com.epam.task5.logic.placeholder.factory;

import com.epam.task5.logic.placeholder.ProcessorByChar;
import com.epam.task5.logic.placeholder.TextProcessor;

public class ProcessorByCharFactory implements TextProcessorFactory {
    @Override
    public TextProcessor createFactory() {
        return new ProcessorByChar();
    }
}
