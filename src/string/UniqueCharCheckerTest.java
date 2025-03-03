package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueCharCheckerTest {
    @Test
    void testAllUniqueCharacters(){
        assertTrue(UniqueCharChecker.hasAllUniqueChars("abcdef")); // All unique characters
    }

    @Test
    void testDuplicateCharacters(){
        assertFalse(UniqueCharChecker.hasAllUniqueChars("hello")); // 'l' appears twice
    }

    @Test
    void testEmptyString() {
        assertTrue(UniqueCharChecker.hasAllUniqueChars("")); // Edge case: empty string
    }

    @Test
    void testSingleCharacter() {
        assertTrue(UniqueCharChecker.hasAllUniqueChars("a")); // Edge case: single character
    }

    @Test
    void testLongStringWithDuplicates(){
        assertFalse(UniqueCharChecker.hasAllUniqueChars("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-{}[]|:;<>,.?/~`abcdefghijklmnopqrstuvwxyz")); // Contains duplicate letters
    }

    @Test
    void testLongStringWithoutDuplicates() {
        String allUnique = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-{}[]|:;<>,.?/~`";
        assertTrue(UniqueCharChecker.hasAllUniqueChars(allUnique)); // String of length 94 (all unique)
    }

    @Test
    void testMoreThan128Characters() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 129; i++) {
            sb.append((char) (i % 128)); // Generate string longer than 128 characters
        }
        assertFalse(UniqueCharChecker.hasAllUniqueChars(sb.toString())); // Should return false
    }
}
