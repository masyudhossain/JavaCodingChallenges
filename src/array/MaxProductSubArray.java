package array;

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

    public static void main(String[] args) {
        int[] arr= {-2, 6, -3, -10, 0, 2};
        System.out.println("Maximum Product: "+maxProductSubArrayBruteForce(arr));
        int[][] testCases = {
                {1, 2, 3, 4},                   // All positive
                {-1, -2, -3, -4},               // All negative (even count)
                {-1, -2, -3},                   // All negative (odd count)
                {2, 3, -2, 4},                  // Mix
                {-2, 0, -1},                    // Contains zero
                {0, -2, -3, 0, 4, -1},          // Multiple zeros
                {-1, 2, -3, 4, -5},             // Neg start/end
                {5},                            // One element positive
                {-7},                           // One element negative
                {-1, 2, -3, 4, -5, 6},          // Alternating signs
                {-1, -1, -1, 0, -1, -1},        // Repeating -1s with 0
                {}                              // Empty array
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = maxProductSubArrayBruteForce(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
}
