package string;

public class PalindromeCheck {
    public static boolean isPalindrome(String text){
        if(text==null || text.isEmpty()){ // Edge case: empty or null string
            return false;
        }

        text = text.replaceAll("\\s+", "").toLowerCase();

        int length = text.length();
        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i)!=text.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("m"));
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("Madam")); // true
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome(""));
    }
}
