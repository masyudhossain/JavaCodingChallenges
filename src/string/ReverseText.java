package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Given a string of characters, reverse the order of the characters in an efficient manner*/

public class ReverseText {

    public static String reverse( String text){
        if (text == null){
            throw new IllegalArgumentException("Text is not initialized");
        }

        char[] charArray = text.toCharArray(); // O(n)
        char temp;
        final int length = charArray.length;

        for (int index = 0; index <length/2; index++) { // O(n/2)
            temp = charArray[index];
            charArray[index] = charArray[length-1-index];
            charArray[length-1-index] = temp;
        }

        return String.valueOf(charArray); // O(n)
    }

    public static String reverseOddText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text is not initialized");
        }

        char[] charArray = text.toCharArray();
        List<Character> oddChars = new ArrayList<>();

        // Collect odd-indexed characters
        for (int i = 1; i < charArray.length; i += 2) {
            oddChars.add(charArray[i]);
        }

        // Reverse the collected characters
        Collections.reverse(oddChars);

        // Replace the characters back at odd indices correctly
        int oddIndex = 0;
        for (int i = 1; i < charArray.length; i += 2) {
            charArray[i] = oddChars.get(oddIndex++);
        }

        return new String(charArray);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String input = sc.nextLine();
        System.out.println("Reverse of the string is "+ reverse(input));
        System.out.println("Reverse of OddIndex "+reverseOddText(input));
    }
}
