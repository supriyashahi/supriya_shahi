import java.util.*;

public class SwapWithoutVar {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Number before swapping is : " + a + " & " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Number before swapping is : " + a + " & " + b);
    }
}
