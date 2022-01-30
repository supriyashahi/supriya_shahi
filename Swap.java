//WAP to swap to number.

import java.util.*;

public class Swap{
public static void main(String args[]){
int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number :");
int n=sc.nextInt();

System.out.println("Enter second number :");
int m=sc.nextInt();

temp=n;
n=m;
m=temp;
System.out.println("First number is :"+n);
System.out.println("Second number iS:"+m);


}
}


