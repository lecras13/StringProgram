package com.epam.task5.data;

import com.epam.task5.entity.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private String fileName;

    public FileDataAcquirer(String fileName){
        this.fileName = fileName;
    }

    public Text getText(){
        String toReturn = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
                toReturn =reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new Text(toReturn);
    }
}
