package com.epam.task5.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    private String fileName;

    public FileDataAcquirer(String fileName){
        this.fileName = fileName;
    }

    public List<String> getString(){
        List<String> listToReturn = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while(reader.ready()){
                String str =reader.readLine();
                listToReturn.add(str);
            }
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
        return listToReturn;
    }
}
