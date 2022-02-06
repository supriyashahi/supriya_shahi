import java.util.*;

public class Temperature {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the fahrenheit :");
        float F = s.nextFloat();
        float C = 1;
        C = ((F - 32) * 5) / 9;
        System.out.println("Temperature in celsius is :" + C);

    }
}
