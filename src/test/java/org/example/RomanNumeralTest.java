package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RomanNumeralTest {
    private RomanNumeral romanNumeral;

    @BeforeEach
    void SetUp() {
        romanNumeral = new RomanNumeral();
    }


    @DisplayName(" pour tout les teste suivant sont pour les teser des nombres romain")

    @Test
     void test_sup_3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(99666651));
    }

    @Test
    void test_inf_1() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-229995));
    }

    @Test
    void test_10() {
        String expected = "X";
        String returned = RomanNumeral.toRoman(10);
        assertEquals(expected, returned);
    }

    @Test
    void test_9() {
        String expected = "IX";
        String returned = RomanNumeral.toRoman(9);
        assertEquals(expected, returned);
    }

    @Test
    void test_8() {
        String expected = "VIII";
        String returned = RomanNumeral.toRoman(8);
        assertEquals(expected, returned);
    }

    @Test
    void test_14() {
        String expected = "XIV";
        String returned = RomanNumeral.toRoman(14);
        assertEquals(expected, returned);
    }

}