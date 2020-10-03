package com.epam.task5.data;

import com.epam.task5.exception.ExceptionData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private String fileName;

    public FileDataAcquirer(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getText() throws ExceptionData{
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
                return reader.readLine();
        } catch (IOException e) {
            throw new ExceptionData();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
