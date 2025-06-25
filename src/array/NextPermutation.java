package array;

import java.util.Arrays;

/*

next permutation algorithm: Given an array size n, let say arr[n]

Step 1: Find the first decreasing element from the right(pivot):
-> Traverse from right to left.
-> Find the first index i such that arr[i]<arr[i+1].

Step 2: If such an index is found:
2.a. Find the just greater element than arr[i] from the right (let's call it j)
and swap them.
2.b Swap arr[i] and arr[j]




 */
//arr = {2, 4, 1, 7, 5, 0}
public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n = arr.length; //6
        int i = n-2; // 4

        //Step 1:Find the first decreasing element from the right(pivot):
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        // Step 2: If such an element is found
        if(i>=0){
            int j = n-1;

            // Step 2.a : Find the just greater element than arr[i] from the right
            while(arr[j]<=arr[i]) {
                j--;
            }

            // Step 2.b Swap arr[i] and arr[j]
            swap(arr,i,j);
        }

        //Step3: Reverse the subarray from arr[i+1] to end (whether pivot was found or not)
        reverse(arr,i+1,n-1);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;  
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        nextPermutation(arr);
        System.out.println("Next permutation: " + Arrays.toString(arr));
    }
}
