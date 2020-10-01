package com.epam.task5;


import com.epam.task5.data.DataFactory;

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
       // runFromConsole(factory);
        //runFromFile(factory);
    }

/*    private static void runFromConsole(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        Array array = console.getArray();
        //print before sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //sort
        array.bubbleSort();
        //print after sort
        print(PrintType.CONSOLEPRINTER, array.toString());
        //binary search and print
        print(PrintType.CONSOLEPRINTER, findTheResultBinary(array));
    }

    private static void runFromFile(DataFactory dataFactory){
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
    }

    private static void print(PrintType type, String result){
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }*/
}
