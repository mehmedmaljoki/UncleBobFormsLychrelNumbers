package lychrel;

import org.junit.Test;

import static org.junit.Assert.*;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Test
    public void facts() throws Exception {
        convergesAtIteration(1, 0);
        convergesAtIteration(2, 0);
        convergesAtIteration(10, 1);
        convergesAtIteration(11, 0);
    }

    private void convergesAtIteration(int n, int iteration) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, LIMIT));
    }

    @Test
    public void palindromes() throws Exception {
        isPalindrome(1);
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(12321);
        isPalindrome(1234321);
    }

    @Test
    public void nonPalindrome() throws Exception {
        isNotPalindrome(10);
        isNotPalindrome(12331);
        isNotPalindrome(1243321);
    }

    private void isNotPalindrome(int n) {
        assertFalse(Lychrel.isPalindrome(n));
    }

    private void isPalindrome(int n) {
        assertTrue(Lychrel.isPalindrome(n));
    }
}