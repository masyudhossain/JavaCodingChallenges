package sorting.comparisonBased;

public class InsertionSort {

    // Method to perform insertion sort on an array
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Current element to be inserted
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] data = { 12, 11, 13, 5, 6 };

        System.out.println("Unsorted array:");
        printArray(data);

        insertionSort(data);

        System.out.println("\nSorted array:");
        printArray(data);
    }
}
