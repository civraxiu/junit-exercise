package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class AssumptionsAndAssertionsTest {

    @Test
    void test_on_linux() {
        String so = System.getProperty("os.name").toLowerCase();
        assumeTrue(so.contains("linux"));
        assertTrue(true, "Test executed on linux");
    }

    @Test
    void test_on_windows() {
        String so = System.getProperty("os.name").toLowerCase();
        assumeTrue(so.contains("windows"));
        assertTrue(true, "Test executed on windows");
    }
    
    @Test
    void test_on_mac() {
        String so = System.getProperty("os.name").toLowerCase();
        assumeTrue(so.contains("mac"));
        assertTrue(true, "Test executed on Mac");
    }

    @Test
    void test_common_assertions() {
        assertNull(null);
        assertNull(null, "we expect that...");
        
        assertTrue(1 == 1);
        assertTrue(1 == 1, "we expect that...");
        assertFalse(1 != 1);
        assertFalse(1 != 1, "we expect that...");
        
        assertEquals(1, 1);
        assertEquals(1, 1, "we expect that...");

        assertNotEquals(1, 2);
        assertNotEquals(1, 2, "we expect that...");
        
        assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
        assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3}, "we expect that...");

        assertIterableEquals(new ArrayList(), new ArrayList());
        assertIterableEquals(new ArrayList(), new ArrayList(), "we expect that...");

        assertThrows(IllegalStateException.class, () -> {
            /*
             * Block of code that eventually throws an exception
             * */
            throw new IllegalStateException("Throw this!");
        });
        assertThrows(IllegalStateException.class, () -> {
            /*
             * Block of code that eventually throws an exception
             * */
            throw new IllegalStateException("Throw this!");
        }, "we expect that...");
    }
}
