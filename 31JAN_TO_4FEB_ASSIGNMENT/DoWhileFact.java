import java.util.*;

public class DoWhileFact {
    public static void main(String[] args) {
        int fact = 1;
        char ans;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number whose factorial is to be found :");
            int n = sc.nextInt();
            for (int i = n; i > 0; i--) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is :" + fact);
            System.out.println("Do you want to continue?(N for no & Y for yes)");
            ans = sc.next().charAt(0);
        } while (ans != 'N');
        System.out.println("exit");

    }
}
