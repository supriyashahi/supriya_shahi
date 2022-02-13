package FebNine;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        
        int n = 10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >0){
                System.out.println(arr[i]);  
            }
        }
        
        sc.close();
    }
}
