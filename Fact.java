//WAP to calculate factorial of a number using while loop,where n is taken from user.

import java.util.*;

public class Fact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
int i=1,fact=1;
while(i<=n){
fact=fact*i;
i++;
}
System.out.println("Factorial is "+" "+fact);
}
}


