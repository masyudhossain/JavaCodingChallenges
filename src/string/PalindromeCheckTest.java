package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    @Test
    void testBasicPalindromes() {
        assertTrue(PalindromeCheck.isPalindrome("madam"));
        assertTrue(PalindromeCheck.isPalindrome("racecar"));
    }

    @Test
    void testCaseInsensitivePalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("Madam"));
        assertTrue(PalindromeCheck.isPalindrome("RaCecaR"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(PalindromeCheck.isPalindrome("A man a plan a canal Panama"));
        assertTrue(PalindromeCheck.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    void testNonPalindromeStrings() {
        assertFalse(PalindromeCheck.isPalindrome("hello"));
        assertFalse(PalindromeCheck.isPalindrome("java"));
        assertFalse(PalindromeCheck.isPalindrome("palindrome"));
    }

    @Test
    void testEdgeCases() {
        assertFalse(PalindromeCheck.isPalindrome(null)); // Null case
        assertFalse(PalindromeCheck.isPalindrome(""));   // Empty string case
        assertTrue(PalindromeCheck.isPalindrome("a"));   // Single character (always palindrome)
    }
}
