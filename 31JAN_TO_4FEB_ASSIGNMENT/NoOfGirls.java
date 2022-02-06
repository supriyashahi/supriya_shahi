import java.util.*;

public class NoOfGirls {
    public static void main(String[] args) {
        int total = 90;
        int boys = 45;
        int girls = total - boys;
        // 50% of the total students secured grade 'A' out of which 20 are boys so..
        int grade_A = total / 2;
        int grade_A_of_Girls = grade_A - 20;
        System.out.println("Total number of girls getting grade A is : " + grade_A_of_Girls);
    }
}