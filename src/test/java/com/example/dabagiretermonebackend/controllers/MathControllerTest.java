package com.example.dabagiretermonebackend.controllers;

import com.example.dabagiretermonebackend.dtos.DoMathRequest;
import com.example.dabagiretermonebackend.servicesImpl.MathServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @MockBean
    private MathServiceImpl mathService;
    private DoMathRequest doMathRequest;

    @Test
    public void testDoMathAddition() throws Exception {
        doMathRequest = new DoMathRequest();
        doMathRequest.setOperand1(2);
        doMathRequest.setOperand2(2);
        doMathRequest.setOperation("+");

        Mockito.when(mathService.doMath(doMathRequest.getOperand1(),
                doMathRequest.getOperand2(), doMathRequest.getOperation())).thenReturn(4.0);


    }

    @Test
    public void testDoMathSubtraction() throws Exception {
        doMathRequest = new DoMathRequest();
        doMathRequest.setOperand1(2);
        doMathRequest.setOperand2(2);
        doMathRequest.setOperation("-");

        Mockito.when(mathService.doMath(doMathRequest.getOperand1(),
                doMathRequest.getOperand2(), doMathRequest.getOperation())).thenReturn(0.0);

    }

    @Test
    public void testDoMathMultiplication() throws Exception {
        doMathRequest = new DoMathRequest();
        doMathRequest.setOperand1(2);
        doMathRequest.setOperand2(2);
        doMathRequest.setOperation("*");

        Mockito.when(mathService.doMath(doMathRequest.getOperand1(),
                doMathRequest.getOperand2(), doMathRequest.getOperation())).thenReturn(4.0);

    }

    @Test
    public void testDoMathDivision() throws Exception {
        doMathRequest = new DoMathRequest();
        doMathRequest.setOperand1(2);
        doMathRequest.setOperand2(2);
        doMathRequest.setOperation("/");

        Mockito.when(mathService.doMath(doMathRequest.getOperand1(),
                doMathRequest.getOperand2(), doMathRequest.getOperation())).thenReturn(1.0);

    }

    @Test
    public void testDoMathPower() throws Exception {
        doMathRequest = new DoMathRequest();
        doMathRequest.setOperand1(2);
        doMathRequest.setOperand2(2);
        doMathRequest.setOperation("**");

        Mockito.when(mathService.doMath(doMathRequest.getOperand1(),
                doMathRequest.getOperand2(), doMathRequest.getOperation())).thenReturn(4.0);

    }
}
