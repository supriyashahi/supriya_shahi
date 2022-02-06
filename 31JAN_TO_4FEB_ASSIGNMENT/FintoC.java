
import java.util.*;

public class FintoC {
    public static void FahrenheitToCelsius(float f) {
        float C = 1;
        C = ((f - 32) * 5) / 9;
        System.out.println("Temperature in celsius is :" + C);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the fahrenheit :");
        float F = s.nextFloat();
        FahrenheitToCelsius(F);
        s.close();

    }
}
