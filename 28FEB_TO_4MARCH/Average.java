import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, avg;
        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < 10; i++) {

            s = s + sc.nextInt();

        }
        avg = s / 10;
        System.out.println("Average is " + avg);

    }
}