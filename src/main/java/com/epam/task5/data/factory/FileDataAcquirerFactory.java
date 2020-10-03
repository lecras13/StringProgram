package com.epam.task5.data.factory;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.FileDataAcquirer;

public class FileDataAcquirerFactory implements DataAcquirerFactory{
    private static final String FILEPATH = "src/main/resources/FileDataAcquirer.txt";

    @Override
    public DataAcquirer createFactory(){
        return new FileDataAcquirer(FILEPATH );
    }
}
