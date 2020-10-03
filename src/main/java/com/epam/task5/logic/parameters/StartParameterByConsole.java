package com.epam.task5.logic.parameters;

import com.epam.task5.entity.Parameter;
import com.epam.task5.exception.ExceptionData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartParameterByConsole implements StartParameter {
    @Override
    public Parameter getParameters() throws ExceptionData{
        String[] parameters = new String[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number position to change:");
            parameters[0] = reader.readLine();
            System.out.println("Enter replacement character:");
            parameters[1] = reader.readLine();
            System.out.println("Enter type to print(console or file):");
            parameters[2] = reader.readLine().toUpperCase();
            Parameter parameter = new Parameter(parameters);
            return parameter;
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
