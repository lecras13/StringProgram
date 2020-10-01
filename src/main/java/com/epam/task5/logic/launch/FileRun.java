package com.epam.task5.logic.launch;

import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.ResultPrinter;
import com.epam.task5.view.enums.PrintType;

public class FileRun {
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
    }*/

    private static void print(PrintType type, String result){
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
