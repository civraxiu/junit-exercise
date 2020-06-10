package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisabledAndNamedTest {

    @Test
    @DisplayName("Test with a name")
    public void testConvertToDecimalInvalidDenominator() {
        assertTrue(true);
    }
    
    @Test
    @Disabled
    @DisplayName("Test disabled")    
    public void test_disable() {
        fail("Always fail if not disabled");
    }
}
