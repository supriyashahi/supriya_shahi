//WAP to print multiplication table of a number entered by user. 

import java.util.*;

public class Mul{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m=1;
System.out.println("Enter the number :");
int n=sc.nextInt();

for(int i=1;i<=10;i++)
{
 m=n*i;
  System.out.println(n+"*"+i+"="+m);
}


}
}


