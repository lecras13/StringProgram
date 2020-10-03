package com.epam.task5.data;

import com.epam.task5.exception.ExceptionData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {
    @Override
    public String getText() throws ExceptionData{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter text:");
            return reader.readLine();//return
        } catch (IOException e) {
            throw new ExceptionData();
        }
    }
}
