package com.example.dabagiretermonebackend.services;

import com.example.dabagiretermonebackend.utils.InvalidOperationException;
import org.springframework.stereotype.Service;

public interface MathService {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
