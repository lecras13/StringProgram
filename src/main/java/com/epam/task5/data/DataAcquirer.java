package com.epam.task5.data;

import com.epam.task5.exception.ExceptionData;

public interface DataAcquirer {
   String getText() throws ExceptionData;
}
