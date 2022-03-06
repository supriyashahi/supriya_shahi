
/*
  *  
 *** 
*****
 *** 
  *  
*/
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        int space = 2;
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");

            }
            space--;
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");

            }
            space++;
            for (int j = 1; j <= (2 * (3 - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
