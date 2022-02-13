package FebEight;

import java.util.Scanner;

public class phoneNo {
    public static void convert(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        // StringBuilder s2 = new StringBuilder("+91-");
        // String s= s2.append(sb).toString();

        sb.insert(0, "+91-");
        System.out.println(sb.toString());
        
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10-digit Phone no.: ");
        
        int number = sc.nextInt();
        
        convert(number);

        sc.close();
    }
}
