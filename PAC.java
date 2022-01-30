//WAP to find permutation and combination of number

import java.util.*;

public class PAC{
static int fact(int n){
int fact=1;
int i=1;
while(i<=n)
{
fact=fact*i;
i++;
}
return fact;
}
public static void main(String args[]){
int per=1,comb=1;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the n :");
int n=sc.nextInt();
System.out.println("Enter the r:");
int r=sc.nextInt();
per=fact(n)/fact(n-r);
comb=fact(n)/(fact(r)*fact(n-r));
System.out.println("Permutation is "+per);
System.out.println("combination is "+comb);
}
}


