package com.epam.task5.view;

import com.epam.task5.exception.ExceptionData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileResultPrint implements ResultPrinter {
    private String fileName;

    public FileResultPrint(String fileName){
        this.fileName = fileName;
    }

    public void print(String result) throws ExceptionData{
        System.out.println("Open FileResultPrinter to know the result");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
            String str = String.valueOf(result);
            writer.newLine();
            writer.write(str);
        } catch (IOException e) {
            throw new ExceptionData(e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
