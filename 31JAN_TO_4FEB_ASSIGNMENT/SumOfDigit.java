import java.util.*;

public class SumOfDigit {
    public static void SumOfDigits(int n) {
        int d, sum = 0;
        while (n > 0) {
            d = n % 10;
            sum = sum + d;
            n = n / 10;

        }
        System.out.println("Sum of digit of number is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        SumOfDigits(n);
        sc.close();
    }
}
