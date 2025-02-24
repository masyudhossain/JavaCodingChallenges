package string;

import java.util.Scanner;

/*Given a string of characters, reverse the order of the characters in an efficient manner*/
public class ReverseText {

    public static String reverse( String text){
        if (text == null){
            throw new IllegalArgumentException("Text is not initialized");
        }

        char[] charArray = text.toCharArray();
        char temp;
        final int length = charArray.length;

        for (int index = 0; index <length/2; index++) {
            temp = charArray[index];
            charArray[index] = charArray[length-1-index];
            charArray[length-1-index] = temp;
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String input = sc.nextLine();
        System.out.println("Reverse of the string is "+ reverse(input));
    }
}
