
/*
1010101
 10101 
  101  
   1 
*/
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        int space = 0, m = 7;
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= m; j++) {
                if (j % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            m = m - 2;
            System.out.println("");

        }
    }
}
