package FebNine;

import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        
        int n = 10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Middle of all elements : "+arr[4]+" and "+arr[5]);
        
        sc.close();
    }
}
