package string;
/*
Given a string s consisting of lowercase English Letters.
Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: -1
Explanation: All the characters in the given string are repeating.
 */
public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String s1){
        int[] freq= new int[26];
        if (s1==null|| s1.isEmpty()) return '$';

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch>='a' && ch<='z' && freq[ch-'a']==1){
                return ch;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("geeksforgeeks")); // f
        System.out.println(findFirstNonRepeating("racecar"));        // e
        System.out.println(findFirstNonRepeating("aabbccc"));        // $
        System.out.println(findFirstNonRepeating("a"));              // a
        System.out.println(findFirstNonRepeating("aabccddee"));      // b
        System.out.println(findFirstNonRepeating(""));               // $
        System.out.println(findFirstNonRepeating(null));             // $
        System.out.println(findFirstNonRepeating("abcabcde"));       // d
    }
}
