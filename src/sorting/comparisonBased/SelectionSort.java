package sorting.comparisonBased;

public class SelectionSort {

    // Method to perform selection sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum
            int minIndex = i;

            // Find the index of the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] data = { 29, 10, 14, 37, 13 };

        System.out.println("Unsorted array:");
        printArray(data);

        selectionSort(data);

        System.out.println("\nSorted array:");
        printArray(data);
    }
}
 