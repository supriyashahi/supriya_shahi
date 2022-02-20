package Feb15;

import java.util.Scanner;


public class one {
    
    public static void printArr(int n, int m, int arr[][]) {
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1= new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] sumArr =new int[n][m];
        System.out.println("Enter Elements: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first Array is: ");
        printArr( n,  m, arr1);
        System.out.println("The second Array is: ");
        printArr(n,m,arr2);
        System.out.println("the sum of both matrix is: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArr[i][j]= arr1[i][j]+arr2[i][j];
                System.out.printf("%d\t", sumArr[i][j] );
                 
            }
            System.out.println();   
        }
        
        sc.close();
    }
}
