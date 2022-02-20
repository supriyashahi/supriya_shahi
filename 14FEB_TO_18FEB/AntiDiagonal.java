import java.util.*;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, sum = 0;
        System.out.println("Enter the numbers of rows : ");
        r = sc.nextInt();
        System.out.println("Enter the numbers of col : ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Elements of the matrix are : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix :");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");

            }
            System.out.println("");
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i + j == a.length - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Anti Diagonal sum is : " + sum);
        sc.close();
    }
}