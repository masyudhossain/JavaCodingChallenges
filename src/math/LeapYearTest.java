package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testLeapYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    void testLeapYearDivisibleBy4Not100() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    void testNotLeapYearDivisibleBy100Not400() {
        assertFalse(LeapYear.isLeapYear(2100));
    }

    @Test
    void testNotLeapYearNotDivisibleBy4() {
        assertFalse(LeapYear.isLeapYear(2023));
    }

    @Test
    void testNegativeYear() {
        assertFalse(LeapYear.isLeapYear(-400));
    }

    @Test
    void testYearZero() {
        assertTrue(LeapYear.isLeapYear(0));
    }
}
