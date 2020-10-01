package com.epam.task5.data;

import com.epam.task5.entity.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleDataAcquirer implements DataAcquirer {

    public Text getText(){
        String toReturn = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter text:");
                toReturn =reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Text(toReturn);
    }
}
