package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class PalindromeTest {
    private Palindrome palindrome;
    @BeforeEach
    void SetUp() {
        palindrome = new Palindrome();
    }



    @Test
    public void test_Palindrome() {
        assertEquals(true, palindrome.isPalindrome("radar"));
    }


    @Test
    public void testIsPalindromeWithOneWord() {
        assertEquals(true, palindrome.isPalindrome("elle"));
    }


    @Test
    public void test_pas_Palindrome() {

        assertEquals(false, palindrome.isPalindrome("algerie"));
    }


    @Test
    void test_execption_si_null_chaine() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindromeOriginal(null));
    }


}