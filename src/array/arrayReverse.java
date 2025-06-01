package array;
/* Given an array arr[], the task is to reverse the array.
Reversing an array means rearranging the elements such that the first element becomes the last,
 the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position,
 the second element 4 moves to second-last and so on.

Input: arr[] = {4, 5, 1, 2}
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.*/
public class arrayReverse {
    public static void arrayReverseNavie(int[] arr){
        int n = arr.length;
        int[] dummyArray = new int[n];

        for(int i=0;i<n;i++){
            dummyArray[i] = arr[n-i-1];
        }
        for (int i=0;i<dummyArray.length;i++){
            arr[i]=dummyArray[i];
        }
    }

    public static void arrayReverseTwoPointer(int[] arr){
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        int[] arr1 = {10, 3, 9};
        arrayReverseNavie(arr);
        arrayReverseTwoPointer(arr1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");
        }
    }
}
