package array;
/*
Majority Element II - Elements occurring more than ⌊N/3⌋ times
Given an array arr[] consisting of n integers, the task is to find all
the array elements which occurs more than floor(n/3) times.

Note: The returned array of majority elements should be sorted.*/

import java.util.*;

public class MajorityElementOccurs {
    public static List<Integer> majorityElementBruteForce(int[] arr){
        int n= arr.length;
        int threshold = n/3;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }

            if (count>threshold && !result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1,3,2,3,1};
        System.out.println("Output:"+majorityElementBruteForce(arr));

        int[] arr1 = {-5,1,-5};
        System.out.println("Output:"+majorityElementBruteForce(arr1));

        int[] arr2 = {};
        System.out.println("Output:"+majorityElementBruteForce(arr2));

    }
}
