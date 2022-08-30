package com.restful.calculator.service;

import com.restful.calculator.model.Result;
import com.restful.calculator.model.Values;

import java.util.Optional;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public Result add(Optional<Values> values) {
        if (values.isEmpty()){
            throw new IllegalArgumentException("");
        }
        long first = values.get().getFirstOperand();
        long second = values.get().getSecondOperand();
        return new Result((first+second));
    }

    @Override
    public Result multiply(Optional<Values> values) {
        return null;
    }

    @Override
    public Result divide(Optional<Values> values) {
        return null;
    }

    @Override
    public Result subtract(Optional<Values> values) {
        return null;
    }
}
