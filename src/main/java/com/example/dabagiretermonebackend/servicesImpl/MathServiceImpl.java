package com.example.dabagiretermonebackend.servicesImpl;

import com.example.dabagiretermonebackend.services.MathService;
import com.example.dabagiretermonebackend.utils.InvalidOperationException;

public class MathServiceImpl implements MathService {
    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if("/".equals(operation) && operand2 == (double) 0) {
            throw new InvalidOperationException("Cannot divide by zero");
        }

        switch (operation) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "**":
                return Math.pow(operand1, operand2);
            case "log":
                return operand1 * Math.log10(operand2);
            case "ln":
                return operand1 * Math.log(operand2);
            default:
                throw new RuntimeException("Unknown operation");
        }
    }
}
