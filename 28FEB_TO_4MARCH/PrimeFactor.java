import java.util.*;

public class PrimeFactor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;

        System.out.println("Enter the number");
        x = input.nextInt();

        System.out.println("Prime factors of " + x + " are:");

        for (int i = 2; i <= x; i++) {

            if (x % i == 0) {
                int p = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        p++;
                        break;
                    }
                }
                if (p == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
