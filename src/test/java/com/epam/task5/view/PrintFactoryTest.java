package com.epam.task5.view;

import org.junit.Test;

public class PrintFactoryTest {
    @Test(expected = IllegalArgumentException.class)
    public void printTestWhenPrintNotHaveInFactory(){
        PrintFactory factory = new PrintFactory();
        ResultPrinter resultPrinter = factory.getResultPrinter("tEST");
    }
}

