package string;

public class FirstNonRepeating {
    public static Integer findFirstNonRepeating(int[] arr){
        int n= arr.length;

        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;

            for (int j = 0; j < n; j++) {
                if (i!=j && arr[i] ==arr[j]){
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating){
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        Integer result = findFirstNonRepeating(arr);
        System.out.println(result != null ? result : "No non-repeating element.");
    }
}
