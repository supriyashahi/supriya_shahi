//WAP to print first x terms of the series 3N+2 which are not multiples of 4.


import java.util.*;

public class SE{
 public static void main(String agrs[])
{
int s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
for(int i=1;i<=1000;i++)
{
if(n!=0){
s=(3*i)+2;
if(s%4!=0)
{
System.out.println(s);
n--;
}
}
}
}
}






