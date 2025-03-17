package math;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year == 0) {
            return true; // Handle year 0 as a leap year
        }
        if (year < 0) {
            return false;
        }
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2100));
    }
}
