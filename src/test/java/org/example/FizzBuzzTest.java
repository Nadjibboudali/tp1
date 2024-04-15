package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTest;

    @BeforeEach
    void setUp() {
        fizzBuzzTest = new FizzBuzz();
    }

    @Test
    public void test_Negative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTest.fizzBuzz(-1));
    }

    @Test
    public void testMultiple_de_3() {
        assertEquals("Fizz", fizzBuzzTest.fizzBuzz(9));
    }

    @Test
    public void testMultiple_de_5() {
        assertEquals("Buzz", fizzBuzzTest.fizzBuzz(5));
    }

    @Test
    public void testMultiple_de_3_et_5() {
        assertEquals("FizzBuzz", fizzBuzzTest.fizzBuzz(15));
    }

    @Test
    public void testNotMultiple_de_3_ou_5() {
        assertEquals("13", fizzBuzzTest.fizzBuzz(13));
    }
}
