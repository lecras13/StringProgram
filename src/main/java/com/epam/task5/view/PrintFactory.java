package com.epam.task5.view;

import com.epam.task5.view.enums.PrintType;

public class PrintFactory {
    private static final String FILE_PATH = "src/FileResultPrinter.txt";

    public ResultPrinter getResultPrinter(PrintType type){
        ResultPrinter toReturn;
        switch (type) {
            case CONSOLE:
                toReturn = new ConsoleResultPrinter();
                break;
            case FILE:
                toReturn = new FileResultPrint(FILE_PATH);
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}


