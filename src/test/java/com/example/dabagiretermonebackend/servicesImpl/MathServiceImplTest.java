package com.example.dabagiretermonebackend.servicesImpl;

import com.example.dabagiretermonebackend.utils.InvalidOperationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceImplTest {

    private MathServiceImpl mathService = new MathServiceImpl();

    @Test
    public void testAddition() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "+");
        assertEquals(3, result);
    }

    @Test
    public void testSubtraction() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "-");
        assertEquals(-1, result);
    }

    @Test
    public void testMultiplication() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "*");
        assertEquals(2, result);
    }

    @Test
    public void testDivision() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "/");
        assertEquals(0.5, result);
    }

    @Test
    public void testUnknownOperation() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "%");
    }

    @Test
    public void testExponentiation() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "**");
        assertEquals(1, result);
    }

    @Test
    public void testLogarithm() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "log");
        assertEquals(0.3010299956639812, result);
    }

    @Test
    public void testNaturalLogarithm() throws InvalidOperationException {
        double result = mathService.doMath(1, 2, "ln");
        assertEquals(0.6931471805599453, result);
    }

    @Test
    public void testDivisionByZero() throws InvalidOperationException {
        double result = mathService.doMath(1, 0, "/");
    }
}
