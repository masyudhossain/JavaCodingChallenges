package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumOfEvenTest {

    @Test
    public void testSumOfEvenNumbers() {
        assertEquals(0, SumOfEven.sumOfEvenNumbers(0));
        assertEquals(2, SumOfEven.sumOfEvenNumbers(2));
        assertEquals(2, SumOfEven.sumOfEvenNumbers(3));
        assertEquals(6, SumOfEven.sumOfEvenNumbers(5));
        assertEquals(20, SumOfEven.sumOfEvenNumbers(8));
    }

    @Test
    public void testSumOfOddNumbers() {
        assertEquals(0, SumOfEven.sumOfOddNumbers(0));
        assertEquals(1, SumOfEven.sumOfOddNumbers(1));
        assertEquals(4, SumOfEven.sumOfOddNumbers(3));
        assertEquals(9, SumOfEven.sumOfOddNumbers(5));
        assertEquals(16, SumOfEven.sumOfOddNumbers(7));
    }
}
