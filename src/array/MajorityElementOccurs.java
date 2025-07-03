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

    public static List<Integer> majorityElementOptimal(int[] arr){
        int n = arr.length;

        int candidate1 = 0, candidate2 = 1;
        int count1=0;
        int count2=0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1){
                count1++;
            } else if (arr[i] == candidate2) {
                count2++;
            }
            else if (count1 == 0){
                candidate1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = arr[i];
                count2 = 1 ;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1){
                count1++;
            }
            else if (arr[i] == candidate2){
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1>n/3){
            result.add(candidate1);
        }
        if (count2>n/3){
            result.add(candidate2);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {2,2,3,1,3,2,3,1};
//        System.out.println("Output:"+majorityElementBruteForce(arr));
        System.out.println("Output:"+majorityElementOptimal(arr));

        int[] arr1 = {-5,1,-5};
//        System.out.println("Output:"+majorityElementBruteForce(arr1));
        System.out.println("Output:"+majorityElementOptimal(arr1));

        int[] arr2 = {};
        System.out.println("Output:"+majorityElementOptimal(arr2));

        int[] arr4 = {2,4,5,2,3,1,4,5,2,4,1,1,1,1,1,1,1,1,1,23,3,32,2,2,2,2,4,5,3,};
        System.out.println("Output:"+majorityElementOptimal(arr4));

    }
}
