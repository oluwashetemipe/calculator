package com.restful.calculator.service;

import com.restful.calculator.model.Result;
import com.restful.calculator.model.Values;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CalculatorServiceImpl implements CalculatorService{
    private Values extractValues(Optional<Values> values){
        if (values.isEmpty()){
            throw new IllegalArgumentException("Values cannot be empty");
        }
        double first = values.get().getFirstOperand();
        double second = values.get().getSecondOperand();
        String operator = values.get().getOperator();
        Values extractedValues = new Values();
        extractedValues.setFirstOperand(first);
        extractedValues.setSecondOperand(second);
        extractedValues.setOperator(operator);
        return extractedValues;
    }
    @Override
    public Result calculate(Optional<Values> values) {
        Values extractValues = extractValues(values);
        Result result = new Result();
        switch(extractValues.getOperator()) {
            case "+":
                result.setResult(extractValues.getFirstOperand() + extractValues.getSecondOperand());
                break;
            case "-":
                result.setResult(extractValues.getFirstOperand() - extractValues.getSecondOperand());
                break;
            case "*":
                result.setResult(extractValues.getFirstOperand() * extractValues.getSecondOperand());
                break;
            case "/":
                result.setResult(extractValues.getFirstOperand() / extractValues.getSecondOperand());
                break;
            case "^":
                result.setResult(Math.pow(extractValues.getFirstOperand(),extractValues.getSecondOperand()));
                break;
            default:
                result.setResult(0);
        }

        return result;
    }
}
