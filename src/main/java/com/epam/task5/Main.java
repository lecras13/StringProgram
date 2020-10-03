package com.epam.task5;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.logic.parameters.StartParameterByConsole;
import com.epam.task5.logic.placeholder.ProcessorByCharMethod;
import com.epam.task5.logic.placeholder.ProcessorByRegularExp;
import com.epam.task5.logic.placeholder.ProcessorByStringMethod;
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
    public static void main(String[] args){
        DataFactory factory = new DataFactory();
        runFromConsole(factory);
        runFromFile(factory);
    }

    public void runFromConsole(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        Text text = console.getText();

        //getting parameters fo start
        StartParameterByConsole parameterForStart = new StartParameterByConsole();
        String[] parametes = parameterForStart.getParameters();

        //changing by string method
        ProcessorByStringMethod characterPlaceholderByStringMethod = new ProcessorByStringMethod();
        // Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes[0], parametes[1]);

        //changing by Char method
        ProcessorByCharMethod characterPlaceholderByCharMethod = new ProcessorByCharMethod();
        //Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);

        //changing by Regular method
        ProcessorByRegularExp characterPlaceholderByRegularExp = new ProcessorByRegularExp();
        Text newRedaction = characterPlaceholderByRegularExp.changeCharacter(text, parametes);

        //print after
        PrintFactory printFactory = new PrintFactory();
        printFactory.getResultPrinter(PrintType.CONSOLEPRINTER).print(newRedaction.toString());
    }

    public void runFromFile(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.FILE);
        Text text = console.getText();

        //getting parameters fo start
        StartParameterByConsole parameterForStart = new StartParameterByConsole();
        String[] parametes = parameterForStart.getParameters();

        //changing by string method
        ProcessorByStringMethod characterPlaceholderByStringMethod = new ProcessorByStringMethod();
        //Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);

        //changing by Char method
        ProcessorByCharMethod characterPlaceholderByCharMethod = new ProcessorByCharMethod();
        //Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);

        //changing by Regular method
        ProcessorByRegularExp characterPlaceholderByRegularExp = new ProcessorByRegularExp();
        Text newRedaction = characterPlaceholderByRegularExp.changeCharacter(text, parametes);

        //print after
        PrintFactory printFactory = new PrintFactory();
        printFactory.getResultPrinter(PrintType.FILEPRINTER).print(newRedaction.toString());
    }
}
