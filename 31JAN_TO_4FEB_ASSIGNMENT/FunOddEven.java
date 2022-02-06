import java.util.*;

public class FunOddEven {
    public static void EvenOdd(int a) {
        if (a % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
