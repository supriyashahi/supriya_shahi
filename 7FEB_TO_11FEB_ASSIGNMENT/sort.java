package febTen;

import java.util.Scanner;



public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        
        int n = 10;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
            
        }
        
        sc.close();
    }
}
