//WAP to print first x terms of the series 3N+2 which are not multiples of 4.


import java.util.*;

public class COM{
 public static void main(String agrs[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Principal ,rate of interest,time period and number of times that interest is compounded per unit t: ");
float p=sc.nextFloat();
float r=sc.nextFloat();
float t=sc.nextFloat();
float n=sc.nextFloat();

double amount =p*Math.pow(1+(r/n),n*t);
double cinterest = amount -p;
System.out.println("Compound Interest "+cinterest);
}}






