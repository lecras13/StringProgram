package com.epam.task5.logic.addparameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParametersForStartByConsole implements ParameterForStart {
    public String[] getParameters(){
        String[] parameters = new String[2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number position to change:");
            parameters[0] = reader.readLine();
            System.out.println("Enter replacement character:");
            parameters[1] = reader.readLine();
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
        return parameters;
    }
}
