import java.util.*;

public class LowestTerm {

    public static void main(String[] args) {

        int num;
        int den;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerator");
        num = input.nextInt();
        System.out.println("Enter denominator");
        den = input.nextInt();

        // calculating HCF
        int a, b, gcd, t;
        if (num > den) {
            a = num;
            b = den;
        } else {
            b = num;
            a = den;
        }
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        gcd = a;

        System.out.println("In lowest form = " + num / gcd + "/" + den / gcd);
    }
}
