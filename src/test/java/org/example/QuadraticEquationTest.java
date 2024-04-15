package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation;

    @BeforeEach
    void SetUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @Test
    void test_a_egale_0() {
        double a = 0,b=7,c=20;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a, b, c));
    }

    @Test
    void test_delata_inf_0() {
        double a = 4,b=2,c=5;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertNull(roots);
    }

    @Test
    void test_delta_egale_0() {
        double a = 2,b = 4,c = 2;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{-b / (2 * a)}, roots);
    }

    @Test
    void test_delta_sup_0() {
        double a = 7,b = 20,c = 5;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)}, roots);
    }


}