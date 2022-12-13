package com.example.dabagiretermonebackend.controllers;

import com.example.dabagiretermonebackend.dtos.DoMathRequest;
import com.example.dabagiretermonebackend.servicesImpl.MathServiceImpl;
import com.example.dabagiretermonebackend.utils.CalcResponse;
import com.example.dabagiretermonebackend.utils.InvalidOperationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MathController {
    private MathServiceImpl mathService = new MathServiceImpl();

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/do-math")
    public CalcResponse doMath(@RequestBody DoMathRequest doMathRequest) throws InvalidOperationException {
        double result =  mathService.doMath(doMathRequest.getOperand1(), doMathRequest.getOperand2(), doMathRequest.getOperation());

        return new CalcResponse(result);
    }
}
