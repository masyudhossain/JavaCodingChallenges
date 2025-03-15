package math;

/**Given an Integer N, calculates the sum of all even numbers from 1 to N.**/

public class SumOfEven {
    public static int sumOfEvenNumbers(int n){
        int sum=0;
        for (int number = 1; number <=n; number++) {
            if (number%2 == 0)
            {
                sum=sum+number;
                System.out.println(number);
            }
        }
        return sum;
    }

    public static int sumOfOddNumbers(int n){
        int sum=0;
        for (int number = 1; number <= n; number+=2) {
            sum=sum+number;
//            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(sumOfEvenNumbers(6));
        System.out.println(sumOfEvenNumbers(2));
        System.out.println("..........");
        System.out.println(sumOfEvenNumbers(3));
        System.out.println("..........");
        System.out.println(sumOfEvenNumbers(5));
        System.out.println("..........");
        System.out.println(sumOfEvenNumbers(8));
//        System.out.println(sumOfOddNumbers(5));
    }
}
