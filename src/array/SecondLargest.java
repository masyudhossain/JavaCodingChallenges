package array;
/*
Second-Largest Element in an Array
Given an array of positive integers arr[] of size n,
the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.*/

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[]= {10,5,9,15,8,16,10};
        int arr1[] = {10,5,10};
        int arr2[] = {10,10,10};

        System.out.println(findSecondLargest(arr));     //15
        System.out.println(findSecondLargest(arr1));    //5
        System.out.println(findSecondLargest(arr2));    //-1
    }
}
