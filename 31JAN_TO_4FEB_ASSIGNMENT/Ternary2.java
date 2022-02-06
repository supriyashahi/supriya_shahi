import java.util.*;

public class Ternary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        String result = (n == 10 || n == 20 || n == 30 || n == 40 || n == 50) ? "yes" : "none of these";
        System.out.println(result);
    }
}
