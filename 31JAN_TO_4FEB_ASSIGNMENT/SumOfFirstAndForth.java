import java.util.*;

public class SumOfFirstAndForth {
    public static void main(String[] args) {
        int n = 34567;
        int first, sec, third, fourth, fifth, sum = 0;
        first = n / 10000;
        n = n % 10000;
        sec = n / 1000;
        n = n % 1000;
        third = n / 100;
        n = n % 100;
        fourth = n / 10;
        n = n % 10;
        sum = first + fourth;
        System.out.println("Sum is : " + sum);
    }
}
