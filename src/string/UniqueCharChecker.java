package string;

public class UniqueCharChecker {
    public static boolean hasAllUniqueChars(String str){
        if(str.length()>128){ // ASCII limitation
            return false;
        }

        boolean[] booleans = new boolean[128]; // Track seen characters

        for (int idx = 0; idx < str.length(); idx++) {
            int value = str.charAt(idx);
            if (booleans[value]){
                return false;
            }
            booleans[value] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasAllUniqueChars("hello")); // false
        System.out.println(hasAllUniqueChars("world")); // true
        System.out.println(hasAllUniqueChars("ghijklmn")); // true
    }
}
