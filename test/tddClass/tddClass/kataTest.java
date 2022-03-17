package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class kataTest {
    public void getPalindrome() {
        Kata palindrome = new Kata();
        assertNotNull(palindrome);
    }

    @Test
    public void toCheckIfPalindromeIsTrue() {
        Kata palindrome = new kata ();
        palindrome.getPalindrome();
        assertEquals(true, palindrome.isOn());
    }


}