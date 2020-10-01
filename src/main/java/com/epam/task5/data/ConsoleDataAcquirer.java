package com.epam.task5.data;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ConsoleDataAcquirer implements DataAcquirer {

    public List<String> getString() {
        List<String> listToReturn = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter text:");
            while(reader.ready()){
                String str =reader.readLine();
                listToReturn.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listToReturn;
    }
}
