//WAP to calculate power of a number.

import java.util.*;

public class Power{
public static void main(String args[]){
int pow=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
System.out.println("Enter the power");
int power=sc.nextInt();
for(int i=1;i<=power;i++){
pow=pow*number;}
System.out.println("Power of a number is "+" "+pow);

}
}


