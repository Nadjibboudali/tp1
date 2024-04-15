package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BinarySearchTest {

    private BinarySearch binarySearch;
    @BeforeEach
    void SetUp() {
        binarySearch = new BinarySearch();
    }



    @Test
    void test_tab_NULL() {
        Array a = null;
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 3;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(2, index);
    }

    @Test
    void test_element_nexiste_pas_dans_tab() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }

}