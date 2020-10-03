package com.epam.task5.data.factory;

import com.epam.task5.data.ConsoleDataAcquirer;
import com.epam.task5.data.DataAcquirer;

public class ConsoleDataAcquirerFactory implements DataAcquirerFactory{
    public DataAcquirer createFactory(){
        return new ConsoleDataAcquirer();
    }
}
