import java.util.*;

public class InchesTOMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inches :");
        float inches = sc.nextFloat();
        double meter = inches * 0.00245;
        System.out.println(inches + " in meter is " + meter);

    }
}
