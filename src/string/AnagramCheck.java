package string;
/*
* Check if two Strings are Anagrams of each other
Given two non-empty strings s1 and s2 of lowercase letters,
determine if they are anagrams — i.e.,
if they contain the same characters with the same frequencies.

Examples:

Input: s1 = “geeks”  s2 = “kseeg”
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.

Input: s1 = "allergy", s2 = "allergyy"
Output: false
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.

Input: s1 = "listen", s2 = "lists"
Output: false
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.*/

public class AnagramCheck {
    public static boolean anagramCheck(String s1, String s2){
        if(s1==null|| s2==null) return false;

        s1=s1.replaceAll("\\s+","").toLowerCase();
        s2=s2.replaceAll("\\s+","").toLowerCase();

        if (s1.length()!=s2.length()) return false;

        int[] freq= new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq[ch-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(anagramCheck(s1,s2));
        System.out.println(anagramCheck("A gentleman", "Elegant man")); // true
        System.out.println(anagramCheck("Clint Eastwood", "Old West Action")); // true
        System.out.println(anagramCheck("listen", "lists"));           // false
        System.out.println(anagramCheck("allergy", "allergyy"));       // false
//        System.out.println(anagramCheck("123", "321"));                // true (digits removed, both empty)
    }
}
