package string;

public class StringToInteger {
    public static int myAtoi(String s){
        int n= s.length();
        int i=0;
        int sign = 1;   // assume it positive
        long result = 0; // use long to detect overflow

        //  skip leading white space
        while (i<n && s.charAt(i)== ' ')  {
            i++;
        }

        // check for sign
        if (i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i) == '-')? -1 : 1;
            i++;
        }

        // Parse digit
        while (i<n && s.charAt(i)>= '0' && s.charAt(i)<='9'){
            int digit = s.charAt(i) - '0';
            result = result*10 + digit;

            //check overflow
            if (sign == 1 && result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        //return result with sign
        return (int)(sign*result);
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("-123"));               // -123
        System.out.println(myAtoi("  -"));                // 0
        System.out.println(myAtoi(" 1231231231311133"));  // 2147483647
        System.out.println(myAtoi("-999999999999"));      // -2147483648
        System.out.println(myAtoi("  -0012gfg4"));        // -12
    }
}
