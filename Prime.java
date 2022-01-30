//WAP that checks if a number is a prime or not,take the user input.

import java.util.*;

public class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==0||n==1)
System.out.println("NOT A PRIME NUMBER");

for(int i=2;i<=n/2;i++){
if(n%i==0){
System.out.println("NOT A PRIME NUMBER");}
else
System.out.println("PRIME NUMBER");

}

}
}  

