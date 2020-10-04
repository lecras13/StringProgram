package com.epam.task5;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.factory.ConsoleDataAcquirerFactory;
import com.epam.task5.data.factory.FileDataAcquirerFactory;
import com.epam.task5.entity.Parameter;
import com.epam.task5.exception.ExceptionData;
import com.epam.task5.logic.parameters.ConsoleParameterReader;
import com.epam.task5.logic.placeholder.TextProcessor;
import com.epam.task5.logic.placeholder.TextProcessorFactory;
import com.epam.task5.logic.placeholder.enums.ProcessorType;
import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.enums.PrintType;

/**
 * Variant 1
 * A word processing program that can be obtained both from the console and from a file.
 * Execute through methods of string types, with character string and regular expressions.
 * In each word, replace the k-th letter with the given character.
 * If k is greater than the word length, do not correct.
 *
 * @author Raman Aleksandrov
 */

public class Main {
    public static void main(String[] args) throws ExceptionData{
        ConsoleDataAcquirerFactory consoleDataAcquirerFactory = new ConsoleDataAcquirerFactory();
        DataAcquirer dataAcquirer = consoleDataAcquirerFactory.createFactory();
        // String text = dataAcquirer.getText();

        FileDataAcquirerFactory fileDataAcquirerFactory = new FileDataAcquirerFactory();
        DataAcquirer dataAcquirer1 = fileDataAcquirerFactory.createFactory();
        String text = dataAcquirer1.getText();

        ConsoleParameterReader consoleParameterReader = new ConsoleParameterReader();
        Parameter parameter = consoleParameterReader.getParameters();
        int position = parameter.getPosition();
        char character = parameter.getCharacter();
        ProcessorType changeType = parameter.getProcessorType();
        PrintType printType = parameter.getPrintType();

        TextProcessorFactory textProcessorFactory = new TextProcessorFactory();
        TextProcessor textProcessor = textProcessorFactory.getTextProcessor(changeType);
        String result = textProcessor.changeCharacter(text, position, character);

        PrintFactory printFactory = new PrintFactory();
        printFactory.getResultPrinter(printType).print(result);
    }
}

