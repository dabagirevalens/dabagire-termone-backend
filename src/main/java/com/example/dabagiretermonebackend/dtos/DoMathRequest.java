package com.example.dabagiretermonebackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoMathRequest {
    private double operand1;

    private double operand2;

    private String operation;
}
