import java.util.*;

public class FreqOddEven {
    public static void main(String[] args) {
        int r, c, countE = 0, countO = 0;
        int a[][] = { { 1, 3, 5 },
                { 2, 4, 1 },
                { 7, 8, 9 } };
        r = a.length;
        c = a[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] % 2 == 0)
                    countE++;
                else
                    countO++;
            }
        }
        System.out.println("Even = " + countE);
        System.out.println("Odd = " + countO);
    }
}
