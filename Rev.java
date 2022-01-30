//WAP to reverse the number.


import java.util.*;

public class Rev{
 public static void main(String agrs[])
{
int d,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
while(n>0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}

System.out.println(rev);

}
}





