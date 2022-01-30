//WAP to check if year is leap or not.

import java.util.*;

public class Leap{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year :");
int year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0))
System.out.println("Leap Year");
else
System.out.println("Not A Leap Year");
}
}



