package com.epam.task5;

import com.epam.task5.data.DataFactory;

import static com.epam.task5.logic.launch.ConsoleRun.runFromConsole;

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




}
