package com.epam.task5.logic.placeholder.factory;

import com.epam.task5.logic.placeholder.ProcessorByString;
import com.epam.task5.logic.placeholder.TextProcessor;

public class ProcessorByStringFactory implements TextProcessorFactory{
    @Override
    public TextProcessor createFactory(){
        return new ProcessorByString();
    }
}
