package string;
 /*
 Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation:
  100
+  10
  110
Constraints:
1 ≤s1.size(), s2.size()≤ 106


  */
public class AddBinaryString {
    public static String addString(String s1, String s2){
        int i = s1.length() -1;
        int j = s2.length() -1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(i>=0 || j>=0 || carry!=0){
            int bit1 = (i>=0)? s1.charAt(i) - '0':0;
            int bit2 = (j>=0)? s2.charAt(j) - '0':0;
            int sum = bit1+bit2+carry;
            result.append(sum%2);
            carry= sum/2;
            i--;
            j--;
        }

        result.reverse();

        while(!result.isEmpty() && result.charAt(0)==0){
            result.deleteCharAt(0);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";
        String result = addString(s1,s2);
        System.out.println(result);
    }
}
