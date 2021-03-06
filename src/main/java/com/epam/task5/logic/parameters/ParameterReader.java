package com.epam.task5.logic.parameters;

import com.epam.task5.entity.Parameter;
import com.epam.task5.exception.ExceptionData;

public interface ParameterReader {
    Parameter getParameters() throws ExceptionData;
}
