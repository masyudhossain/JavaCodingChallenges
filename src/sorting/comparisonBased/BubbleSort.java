package sorting.comparisonBased;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
       int n = arr.length;
       boolean swapped;
       for (int i = 0; i < n - 1; i++) {
           swapped=false;
           for (int j = 0; j < n - 1 - i; j++) {
               if (arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]=temp;
                   swapped=true;
               }
           }
           if (!swapped) break;
       }
    }
    public static void printArray(int[] arr){
       for (int num:arr){
           System.out.print(num+" ");
       }
        System.out.println();
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] data = { 8,0,5,9,1,2,68,9 };
        int[] data1 = { 1,1,1,1,0,5,5,5,5,9,9,9 };

        System.out.println("Unsorted array:");
        printArray(data);
        printArray(data1);

        bubbleSort(data);
        bubbleSort(data1);

        System.out.println("\nSorted array:");
        printArray(data);
        printArray(data1);
    }
}
