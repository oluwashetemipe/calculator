package com.restful.calculator.service;

import com.restful.calculator.model.Result;
import com.restful.calculator.model.Values;

import java.util.Optional;

public interface CalculatorService {
    Result calculate(Optional<Values> values);
}
