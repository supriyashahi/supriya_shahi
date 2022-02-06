import java.util.*;

public class Ternanry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        String res = n > 10 ? "Number is greater than 10"
                : n > 5 ? "Number is greater than 5" : "Number is less than or equal to 5";
        System.out.println(res);
        sc.close();

    }
}
