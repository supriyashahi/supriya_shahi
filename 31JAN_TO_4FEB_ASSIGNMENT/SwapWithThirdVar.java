import java.util.*;

public class SwapWithThirdVar {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;
        System.out.println("Number before swapping is : " + a + " & " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Number before swapping is : " + a + " & " + b);
    }
}
