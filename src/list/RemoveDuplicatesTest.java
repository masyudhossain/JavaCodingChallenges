package list;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicateAndSortWithNumbers() {
        List<Integer> input = List.of(4, 3, 5, 4, 0, 1, 3, 6, 8, 4, 5);
        List<Integer> expected = List.of(0, 1, 3, 4, 5, 6, 8);
        List<Integer> result = RemoveDuplicates.removeDuplicateAndSortGeneric(input);
        assertEquals(expected, result);
    }

    @Test
    void testRemoveDuplicateAndSortWithStrings() {
        List<String> input = List.of("Masyud", "hossain", "Hussaina", "Parvin", "minhaz", "masyud");
        List<String> expected = List.of("hossain", "hussaina", "masyud", "minhaz", "parvin");
        List<String> result = RemoveDuplicates.removeDuplicateAndSort(input);
        assertEquals(expected, result);
    }

    @Test
    void testRemoveDuplicateAndSortWithEmptyList() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = RemoveDuplicates.removeDuplicateAndSortGeneric(input);
        assertEquals(expected, result);
    }

    @Test
    void testRemoveDuplicateAndSortWithSingleElement() {
        List<Integer> input = List.of(42);
        List<Integer> expected = List.of(42);
        List<Integer> result = RemoveDuplicates.removeDuplicateAndSortGeneric(input);
        assertEquals(expected, result);
    }

    @Test
    void testRemoveDuplicateAndSortWithCaseInsensitiveStrings() {
        List<String> input = List.of("Java", "java", "JAVA", "Python", "PYTHON", "python");
        List<String> expected = List.of("java", "python");
        List<String> result = RemoveDuplicates.removeDuplicateAndSort(input);
        assertEquals(expected, result);
    }
}
