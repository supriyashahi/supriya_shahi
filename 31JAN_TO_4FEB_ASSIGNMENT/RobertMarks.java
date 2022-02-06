import java.util.*;

public class RobertMarks {
    public static void Marks(int a, int b, int c) {
        int t = a + b + c;
        System.out.println("Total marks is : " + t);
        float p = (float) ((t / 300.0) * 100);
        System.out.println("Percentage is : " + p);
    }

    public static void main(String[] args) {
        Marks(78, 45, 62);

    }
}
