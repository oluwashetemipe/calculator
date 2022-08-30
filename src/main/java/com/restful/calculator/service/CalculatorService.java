package com.restful.calculator.service;

import com.restful.calculator.model.Result;
import com.restful.calculator.model.Values;

import java.util.Optional;

public interface CalculatorService {
    Result add(Optional<Values> values);
    Result multiply(Optional<Values> values);
    Result divide(Optional<Values> values);
    Result subtract(Optional<Values> values);
}
