package sorting;
/*
Given an array of integers arr[]. You have to find the Inversion Count of the array.
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104 
 */
public class InversionCount {

    public static int countInversions(int[] arr){
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr,temp,0,arr.length-1);
    }

    public static int mergeSortAndCount(int[] arr, int[] temp, int left, int right){
        int inversionCount = 0;

        if(left<right){
            int mid = left + (right-left)/2;

            //count inversion in the left half
            int leftInversions = mergeSortAndCount(arr,temp,left,mid);

            //count inversion in the right half
            int rightInversion = mergeSortAndCount(arr,temp,mid+1,right);

            //count cross inversions while merging
            int mergeInversions = mergeAndCount(arr,temp,left,mid,right);

            //total inversions for this segment
            inversionCount = leftInversions+rightInversion+mergeInversions;
        }
        return inversionCount;
    }

    //merge two sorted halves and count cross-pair inversions
    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right){
        int i= left;
        int j=mid+1;
        int k = left;   //pointer to the merged array
        int inversionCount = 0;

        while(i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
                inversionCount += (mid-i+1); // all remaining elements in left aer grater
            }
        }

        //copy the remaining element from left half(int any
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //copy remaining element from right half
        while(j<=right){
            temp[k++] = arr[j++];
        }
        //copy of sorted and merged elements back to original array
        for (i=left;i<=right;i++){
            arr[i]=temp[i];
        }
        return inversionCount;
    }

    public static int countInversionBruteforce(int[] arr){
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println("Inversion count: " + countInversionBruteforce(arr1)); // Output: 3
        System.out.println("Inversion count: " + countInversions(arr1)); // Output: 3

        int[] arr2 = {2, 3, 4, 5, 6};
        System.out.println("Inversion count: " + countInversions(arr2)); // Output: 0

        int[] arr3 = {10, 10, 10};
        System.out.println("Inversion count: " + countInversions(arr3)); // Output: 0
    }
}
