package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram anagram;
    @BeforeEach
    void SetUp() {
        anagram = new Anagram();
    }


    @Test
    public void test_Anagram() {
        assertEquals(true, anagram.isAnagram("abcd", "acbd"));
    }

    @Test
    public void test_defferent_longeur() {
        assertFalse(anagram.isAnagram("abcdef", "aaaaabcd"));
    }

    @Test
    void test_les_2_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void test_le_premier_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "nadjib"));
    }

    @Test
    void test_le_dexieme_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("nadjib", null));
    }

    @Test
    public void test_pas_Anagram() {
        assertFalse(anagram.isAnagram("abcdef", "aaaaaaaaaaa"));
    }

}