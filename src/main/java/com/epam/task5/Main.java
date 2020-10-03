package com.epam.task5;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.factory.ConsoleDataAcquirerFactory;
import com.epam.task5.data.factory.FileDataAcquirerFactory;
import com.epam.task5.entity.Parameter;
import com.epam.task5.exception.ExceptionData;
import com.epam.task5.logic.parameters.StartParameterByConsole;
import com.epam.task5.logic.placeholder.TextProcessor;
import com.epam.task5.logic.placeholder.factory.ProcessorByCharFactory;
import com.epam.task5.view.PrintFactory;

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
        DataAcquirer dataAcquirer = new ConsoleDataAcquirerFactory().createFactory();
       // String text = dataAcquirer.getText();

        DataAcquirer dataAcquirer1 = new FileDataAcquirerFactory().createFactory();
        String text = dataAcquirer1.getText();

        StartParameterByConsole startParameterByConsole = new StartParameterByConsole();
        Parameter parameter = startParameterByConsole.getParameters();
        int position = parameter.getPositionToChange();
        String character = parameter.getCharacter();
        String printType = parameter.getPrintType();

        TextProcessor textProcessorChar = new ProcessorByCharFactory().createFactory();
        String resultByChar = textProcessorChar.changeCharacter(text, position, character);

        TextProcessor textProcessorRegex = new ProcessorByCharFactory().createFactory();
        String resultByRegex = textProcessorRegex.changeCharacter(text, position, character);

        TextProcessor textProcessorString = new ProcessorByCharFactory().createFactory();
        String resultByString = textProcessorString.changeCharacter(text, position, character);

        PrintFactory printFactory = new PrintFactory();
        printFactory.getResultPrinter(printType).print(resultByChar);
        printFactory.getResultPrinter(printType).print(resultByRegex);
        printFactory.getResultPrinter(printType).print(resultByString);
    }
}

