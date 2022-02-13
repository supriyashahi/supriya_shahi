package FebNine;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        int sum = 0;
        int n = 10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum  +=arr[i];
        }
        System.out.println("Sum of all elements : "+sum);
        
        sc.close();
    }
}
