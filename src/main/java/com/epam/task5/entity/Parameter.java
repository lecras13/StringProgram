package com.epam.task5.entity;

import java.util.Arrays;

public class Parameter {
    private String[] parameters;

    public Parameter(String[] parameters){
        this.parameters = parameters;
    }

    public int getPositionToChange(){
        int position = Integer.parseInt(parameters[0]);
        return position;
    }

    public String getCharacter(){
        return parameters[1];
    }

    public String getPrintType(){
        return parameters[2];
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Parameter that = (Parameter) o;
        return Arrays.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(parameters);
    }

    @Override
    public String toString(){
        return getPositionToChange() + " " + getCharacter();
    }
}
