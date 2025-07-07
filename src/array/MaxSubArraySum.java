package array;
/*
Maximum Subarray Sum - Kadane's Algorithm
Given an integer array arr[], find the subarray (containing at least one element)
which has the maximum possible sum, and return that sum.
Note: A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
 */

public class MaxSubArraySum {
    public static int maxSubArraySumBruteForce(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentSum=0;
            for (int j = i; j <n; j++) {
                currentSum= currentSum+arr[j];
                maxSum=Math.max(maxSum,currentSum);
            }
            System.out.println(currentSum);
        }
        return maxSum;
    }

    public static int maxSubArraySumOptimal(int[] arr){
        
    }

    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum sum:"+maxSubArraySumBruteForce(arr));
    }
}
