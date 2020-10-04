package com.epam.task5.logic.parameters;

import com.epam.task5.entity.Parameter;
import com.epam.task5.exception.ExceptionData;
import com.epam.task5.logic.placeholder.enums.ProcessorType;
import com.epam.task5.view.enums.PrintType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleParameterReader implements ParameterReader {
    @Override
    public Parameter getParameters() throws ExceptionData{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number position to change:");
            int position =Integer.parseInt(reader.readLine());
            System.out.println("Enter replacement character:");
            char character = reader.readLine().charAt(0);
            System.out.println("Enter type to change(char or regex or string):");
            ProcessorType processorType =ProcessorType.valueOf(reader.readLine().toUpperCase());
            System.out.println("Enter type to print(console or file):");
            PrintType printType =PrintType.valueOf(reader.readLine().toUpperCase());
            Parameter parameter = new Parameter(position, character, processorType, printType);
            return parameter;
        } catch (IOException e) {
            throw new ExceptionData(e.getMessage());
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
