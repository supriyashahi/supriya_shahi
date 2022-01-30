//WAP to calculate sum of even and odd digit.
import java.util.*;

public class SumOE{
 public static void main(String agrs[])
{
int sume=0,sumo=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements of array :");
int n=sc.nextInt();
int[] a =new int[n];
System.out.println("Enter the elements of array :");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
sume=sume+a[i];
}
else
{
sumo=sumo+a[i];
}
}
System.out.println("Sum of even digit :"+sume);
System.out.println("Sum of odd digit :"+sumo);
}
}


