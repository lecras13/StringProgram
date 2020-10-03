package com.epam.task5.view;


public class PrintFactory {
    private static final String FILEPATH = "src/FileResultPrinter.txt";

    public ResultPrinter getResultPrinter(String type){
        ResultPrinter toReturn;
        if ("CONSOLE".equals(type)) {
            toReturn = new ConsoleResultPrinter();
        } else if ("FILE".equals(type)) {
            toReturn = new FileResultPrint(FILEPATH);
        } else {
            throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}


