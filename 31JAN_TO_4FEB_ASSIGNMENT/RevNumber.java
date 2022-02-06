import java.util.*;

public class RevNumber {
    public static void ReverseNumber(int n) {
        int d, rev = 0;
        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println("Reverse number is : " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        ReverseNumber(n);
        sc.close();
    }
}
