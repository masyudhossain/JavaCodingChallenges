package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTextTest {

    @Test
    void testReverseNormalString() {
        assertEquals("dcba", ReverseText.reverse("abcd"), "Reversing a normal string failed");
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", ReverseText.reverse("a"), "Reversing a single character should return the same character");
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", ReverseText.reverse(""), "Reversing an empty string should return an empty string");
    }

    @Test
    void testReversePalindrome() {
        assertEquals("madam", ReverseText.reverse("madam"), "Reversing a palindrome should return the same string");
    }

    @Test
    void testReverseWithSpaces() {
        assertEquals("dlroW olleH", ReverseText.reverse("Hello World"), "Reversing a string with spaces failed");
    }

    @Test
    void testReverseWithSpecialCharacters() {
        assertEquals("!@#321", ReverseText.reverse("123#@!"), "Reversing a string with special characters failed");
    }

    @Test
    void testReverseNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ReverseText.reverse(null);
        });
        assertEquals("Text is not initialized", exception.getMessage(), "Exception message does not match");
    }
    @Test
    void testReverseOddsNormalString() {
        assertEquals("afcdeb", ReverseText.reverseOddText("abcdef"), "Reversing odd indices in 'abcdef' failed");
    }

    @Test
    void testReverseOddsSingleCharacter() {
        assertEquals("a", ReverseText.reverseOddText("a"), "Single character should remain unchanged");
    }

    @Test
    void testReverseOddsEmptyString() {
        assertEquals("", ReverseText.reverseOddText(""), "Empty string should return empty string");
    }

    @Test
    void testReverseOddsPalindrome() {
        assertEquals("madam", ReverseText.reverseOddText("madam"), "Reversing odd indices in palindrome failed");
    }

    @Test
    void testReverseOddsWithSpaces() {
        assertEquals("hlloo wlred", ReverseText.reverseOddText("hello world"), "Reversing odd indices in 'hello world' failed");
    }

    @Test
    void testReverseOddsWithSpecialCharacters() {
        assertEquals("1!3@2#", ReverseText.reverseOddText("1#3@2!"), "Reversing odd indices in special characters failed");
    }

    @Test
    void testReverseOddsNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ReverseText.reverseOddText(null);
        });
        assertEquals("Text is not initialized", exception.getMessage(), "Exception message does not match");
    }
}
