package array;

import java.util.Arrays;



/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you
 have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower.
After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
Input: k = 3, arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11.
Constraints
1 ≤ k ≤ 107
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 107

 */
public class TowerHeightDifferenceMin {
    public static int getMinDiff(int[] arr, int k){
        int N = arr.length;
        if (N==0) return 0;

        Arrays.sort(arr); // Sorting the array O(nlogn)

        int minDiff = arr[N-1] - arr[0]; // Because in accenting sorted array 1st element is smallest and last element is largest

        for (int i = 0; i < N-1; i++) { //O(n)
            int maxHeight = Math.max(arr[N-1]-k,arr[i]+k);
            int minHeight = Math.min(arr[0]+k, arr[i+1]-k);

            if(minHeight<0) continue; //After the operation, the resultant array should not contain any negative integers.

            minDiff =Math.min( minDiff,(maxHeight - minHeight));
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
            int[] arr1 = {1, 5, 8, 10};
            int k1 = 2;
            System.out.println("Output: " + getMinDiff(arr1,k1)); // Output: 5

            int[] arr2 = {3, 9, 12, 16, 20};
            int k2 = 3;
            System.out.println("Output: " + getMinDiff(arr2, k2)); // Output: 11
        }
}

// Time Complexity - O(nlogn)