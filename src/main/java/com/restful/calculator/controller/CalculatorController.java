package com.restful.calculator.controller;

import com.restful.calculator.model.Result;
import com.restful.calculator.model.Values;
import com.restful.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService calculate;
//
//    @PostMapping("/calculate")
//    public String calculate(
//            @RequestParam String leftOperand,
//            @RequestParam String operator,
//            @RequestParam String rightOperand) {
//        double leftNumber;
//        double rightNumber;
//
//        try {
//            leftNumber = Double.parseDouble(leftOperand);
//            rightNumber = Double.parseDouble(rightOperand);
//        }
//        catch (NumberFormatException ex) {
//            leftNumber = 0;
//            rightNumber = 0;
//        }
//
//        Calculator calculator = new Calculator(
//                leftNumber,
//                rightNumber,
//                operator
//        );
        @PostMapping("/cal")
        public ResponseEntity<?> calculate(@RequestBody Optional<Values> values) {
            try {
                //entry point
                return new ResponseEntity<>(calculate.calculate(values), HttpStatus.OK);
            } catch (Exception exception) {
                return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
            }
        }

}
