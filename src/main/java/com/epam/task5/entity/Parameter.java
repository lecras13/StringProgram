package com.epam.task5.entity;

import com.epam.task5.logic.placeholder.enums.ProcessorType;
import com.epam.task5.view.enums.PrintType;

public class Parameter {
    private int position;
    private char character;
    private ProcessorType processorType;
    private PrintType printType;

    public Parameter(int position, char character, ProcessorType processorType, PrintType printType){
        this.position = position;
        this.character = character;
        this.processorType = processorType;
        this.printType = printType;
    }

    public int getPosition() {
        return position;
    }

    public char getCharacter() {
        return character;
    }

    public ProcessorType getProcessorType(){
        return processorType;
    }

    public PrintType getPrintType(){
        return printType;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parameter)) {
            return false;
        }

        Parameter parameter = (Parameter) o;

        if (position != parameter.position) {
            return false;
        }
        if (character != parameter.character) {
            return false;
        }
        if (processorType != parameter.processorType) {
            return false;
        }
        return printType == parameter.printType;
    }

    @Override
    public int hashCode(){
        int result = position;
        result = 31 * result + (int) character;
        result = 31 * result + (processorType != null ? processorType.hashCode() : 0);
        result = 31 * result + (printType != null ? printType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "Parameter{" +
                "position=" + position +
                ", character=" + character +
                ", processorType=" + processorType +
                ", printType=" + printType +
                '}';
    }
}
