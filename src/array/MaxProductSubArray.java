package array;
/*
Given an array arr[] that contains positive and negative integers (may contain 0 as well).
Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the answer fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.
Input: arr[] = [2, 3, 4]
Output: 24
Explanation: For an array with all positive elements, the result is product of all elements.
Constraints:
1 ≤ arr.size() ≤ 106
-10  ≤  arr[i]  ≤  10


 */
public class MaxProductSubArray {  //arr= {-2, 6, -3, -10, 0, 2}
    public static int maxProductSubArrayBruteForce(int[] arr){
        if (arr.length==0) return 0;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;
            for (int j = i; j <arr.length; j++) {
                currentProduct = currentProduct * arr[j];
                maxProduct = Math.max(maxProduct,currentProduct);
//                System.out.println(currentProduct);
            }
//            System.out.println(maxProduct);
        }
        return maxProduct;
    }

    public static int maxProductSubArrayOptimal(int[] arr){
        if(arr.length == 0 ) return 0;
        
        int curMaxProduct = arr[0];
        int curMinProduct = arr[0];
        int overallMaxProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<0){
                int temp = curMaxProduct;
                curMaxProduct = curMinProduct;
                curMinProduct = temp;
            }
            curMaxProduct = Math.max(arr[i], curMaxProduct*arr[i]);
            curMinProduct = Math.min(arr[i],curMinProduct*arr[i]);
            overallMaxProduct = Math.max(curMaxProduct,overallMaxProduct);

        }
        return overallMaxProduct;
    }

    public static void main(String[] args) {
        int[] arr= {-2, 6, -3, -10, 0, 2};
        System.out.println("Maximum Product: "+maxProductSubArrayBruteForce(arr));
        int[][] testCases = {
                {1, 2, 3, 4},                   // All positive  24
                {-1, -2, -3, -4},               // All negative (even count) 24
                {-1, -2, -3},                   // All negative (odd count)   6
                {2, 3, -2, 4},                  // Mix  6
                {-2, 0, -1},                    // Contains zero 0
                {0, -2, -3, 0, 4, -1},          // Multiple zeros 6
                {-1, 2, -3, 4, -5},             // Neg start/end   120
                {5},                            // One element positive 5
                {-7},                           // One element negative  -7
                {-1, 2, -3, 4, -5, 6},          // Alternating signs  720
                {-1, -1, -1, 0, -1, -1},        // Repeating -1s with 0   1
                {}                              // Empty array   0
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = maxProductSubArrayBruteForce(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }

        System.out.println("Maximum Product: "+maxProductSubArrayOptimal(arr));
        
        for (int i = 0; i < testCases.length; i++) {
            int result = maxProductSubArrayOptimal(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
}
