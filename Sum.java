//WAP to calculate sum of a number till n using while loop,where n is taken from user.

import java.util.*;

public class Sum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");

int n=sc.nextInt();
int i=1,sum=0;
while(i<=n){
sum=sum+i;
i++;
}
System.out.println("Sum is "+sum);
}
}


