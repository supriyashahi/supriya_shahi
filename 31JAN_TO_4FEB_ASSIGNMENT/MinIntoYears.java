import java.util.*;

public class MinIntoYears {
    public static void main(String[] args) {
        double minINyear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes :");
        double m = sc.nextDouble();
        long years = (long) (m / minINyear);
        int days = (int) (m / 60 / 24) % 365;
        System.out.println((int) m + "Mintues is " + years + " years " + days + " days");

    }
}
