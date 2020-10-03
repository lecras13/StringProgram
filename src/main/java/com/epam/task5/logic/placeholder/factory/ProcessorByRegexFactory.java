package com.epam.task5.logic.placeholder.factory;

import com.epam.task5.logic.placeholder.ProcessorByRegex;
import com.epam.task5.logic.placeholder.TextProcessor;

public class ProcessorByRegexFactory implements TextProcessorFactory{
    @Override
    public TextProcessor createFactory() {
        return new ProcessorByRegex();
    }
}
