package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HooksTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Eseguito PRIMA di tutti i test una sola volta!");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Eseguito DOPO tutti i test una sola volta!");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Eseguito PRIMA di ogni test!");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Eseguito DOPO ogni test!");
    }

    @Test
    void test_1() {
        System.out.println("Test #1");
        int actual = 1 + 1;
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        System.out.println("Test #2");
        String actual = "abc" + "def";
        String expected = "abcdef";
        assertEquals(expected, actual);
    }

}
