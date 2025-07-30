package sorting.comparisonBased;

public class MergeSort{

    // ===== Recursive Merge Sort =====
    public static void recursiveMergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            recursiveMergeSort(arr, left, mid);
            recursiveMergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // ===== Iterative Merge Sort =====
    public static void iterativeMergeSort(int[] arr) {
        int n = arr.length;

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    // ===== Common Merge Logic =====
    private static void merge(int[] arr, int left, int mid, int right) {
        //Sizes of two array
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //initialize two temporary array of size
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy data to temporary array
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];                           
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        //merge the temporary arrays

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        //copy the remaining element
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    // ===== Print Utility =====
    public static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        int[] arr1 = { 38, 27, 43, 3, 9, 82, 10 };
        int[] arr2 = {38,27,43,3}; // Clone for second method

        System.out.println("Original Array:");
        printArray(arr1);

        // Call either of the sorting methods
        recursiveMergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted with Recursive Merge Sort:");
        printArray(arr1);

        recursiveMergeSort(arr2,0,arr2.length-1);
        System.out.println("Sorted with recursive Merge Sort:");
        printArray(arr2);
    }
}
