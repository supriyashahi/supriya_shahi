import java.util.*;

public class DigitGreaterThanTwo {
    public static void main(String[] args) {
        int n = 3456;
        int first = 0, sec = 0, third = 0, fourth = 0;
        first = n / 1000;
        n = n % 1000;
        first = first + 2;
        sec = n / 100;
        n = n % 100;
        sec = sec + 2;
        third = n / 10;
        n = n % 10;
        third = third + 2;
        fourth = n;
        fourth = fourth + 2;

        System.out.println("Number after adding two digits is : " + first + sec + third + fourth);
    }
}
