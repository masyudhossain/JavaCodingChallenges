package array;

public class SmallestPositiveMissingNumber {
    public static int findSmallestPositiveMissingNumberBruteForce(int[] arr){
        int n = arr.length;
        for (int i = 1; i <=n+1; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j]==i){
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] testCases = {
                {2, 3, 7, 6, 8, -1, -10, 15},     // Expected: 1
                {1, 2, 3, 4, 5},                 // Expected: 6
                {3, 4, -1, 1, 1},                // Expected: 2
                {-3, -2, -1, -5},                // Expected: 1
                {1, 1, 0, -1, -2},               // Expected: 2
                {2},                             // Expected: 1
                {1},                             // Expected: 2
                {5, 3, 2, 5, 1},                 // Expected: 4
                {2, -3, 4, 1, 1, 7},             // Expected: 3
                {100, 101, 102},                 // Expected: 1
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = findSmallestPositiveMissingNumberBruteForce(testCases[i]);
            System.out.println("Test Case " + (i + 1) + " → Output: " + result);
        }
    }
}
