package list;

import java.util.*;

public class RemoveDuplicates {
    public static List<String> removeDuplicateAndSort(List<String> list) {
        // Convert all elements to lowercase for case-insensitive comparison
        Set<String> set = new LinkedHashSet<>();
        for (String item : list) {
            set.add(item.toLowerCase()); // Convert to lowercase before inserting
        }

        // Convert back to a list and sort
        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static <E extends Comparable<E>> List<E> removeDuplicateAndSortGeneric(List<E> list) {
        Set<E> set = new LinkedHashSet<>(list); // Removes duplicates while maintaining order
        List<E> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 3, 5, 4, 0, 1, 3, 6, 8, 4, 5);
        List<Integer> sortedNumbers = removeDuplicateAndSortGeneric(new ArrayList<>(numbers));
        System.out.println(sortedNumbers); // Output: [0, 1, 3, 4, 5, 6, 8]

        List<String> words = List.of("Masyud", "hossain", "Hussaina", "Parvin", "minhaz", "masyud","munir");
        List<String> sortedWords = removeDuplicateAndSort(new ArrayList<>(words));
        System.out.println(sortedWords); // Output: [hossain, hussaina, masyud, minhaz, parvin]
    }
}
