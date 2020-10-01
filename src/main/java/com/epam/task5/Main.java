package com.epam.task5;


import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.DataFactory;
import com.epam.task5.data.enums.DataType;
import com.epam.task5.entity.Text;
import com.epam.task5.logic.CharacterPlaceholderByStringMethod;
import com.epam.task5.logic.ParameterForStart;
import com.epam.task5.logic.ParametersForStartByConsole;
import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.ResultPrinter;
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
        //runFromFile(factory);
    }

    private static void runFromConsole(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        Text text = console.getText();

        //getting parameters fo start
        ParametersForStartByConsole parameterForStart = new ParametersForStartByConsole();
        String[] parametes = parameterForStart.getParameters();
        //changing by string method
        CharacterPlaceholderByStringMethod characterPlaceholderByStringMethod = new CharacterPlaceholderByStringMethod();
        Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);
        //print after
        print(PrintType.CONSOLEPRINTER, newRedaction.toString());
    }

    /*private static void runFromFile(DataFactory dataFactory){
        DataAcquirer file = dataFactory.getDataAcquirer(DataType.FILE);
        Array array = file.getArray();
        //print before sort
        print(PrintType.FILEPRINTER, array.toString());
        //sort
        array.bubbleSort();
        //print after sort
        print(PrintType.FILEPRINTER, array.toString());
        //binary search and print
        print(PrintType.FILEPRINTER, findTheResultBinary(array));
    }

    private static String findTheResultBinary(Array array){
        BinarySearch binarySearch = new BinarySearch();
        String result = binarySearch.searchingBinary(array);
        return result;
    }*/

    private static void print(PrintType type, String result){
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
