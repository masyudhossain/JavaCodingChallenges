package sorting;
/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2
 */
import java.util.Arrays;

public class Sort012 {
    public static void sort012(int[] arr){
        int n=arr.length;
        int count0=0,count1=0,count2=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }

        int index=0;
        for (int i = 0; i < count0; i++) {
            arr[index++]=0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++]=1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++]=2;
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,0,2,0,2,1,0,1,2,0,0,0,2,2,1,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
