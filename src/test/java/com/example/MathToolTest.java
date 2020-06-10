package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathToolTest {

    @Test
    @DisplayName("Test successful decimal conversion")
    public void testConvertToDecimalSuccess() {
        double result = MathTools.convertToDecimal(3, 4);
        double expectated = 0.75;
        assertEquals(expectated, result);
    }

    @Test
    @DisplayName("Test failure on zero denominator")
    public void testConvertToDecimalInvalidDenominator() {
        assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
    }
}
