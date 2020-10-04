package com.epam.task5.data.factory;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.FileDataAcquirer;

public class FileDataAcquirerFactory implements DataAcquirerFactory{
    private static final String FILE_PATH = "src/main/resources/FileDataAcquirer.txt";

    @Override
    public DataAcquirer createFactory() {
        return new FileDataAcquirer(FILE_PATH );
    }
}
