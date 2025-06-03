package array;

public class RotateArray {
    public static void rotateArrayNaive(int[] arr, int d){
        int n = arr.length;

        for (int i= 0; i< d;i++){
            int first = arr[0];

            for (int j = 0; j < n-1; j++) {
                arr[j]=arr[j+1];                
            }
            arr[n-1] = first;
        }
    }

    public static void reverse(int[] arr, int first, int last){
        while (first<last)
        {
            int temp = arr[first];
            arr[first] =  arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d= d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d = 1;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nafter rotation "+d+" times");
        leftRotate(arr,d);
//        rotateArrayNaive(arr,d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
