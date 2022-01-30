//WAP to calculate distance between two points.


import java.util.*;

public class Dist{
 public static void main(String agrs[])
{
double dis;
Scanner sc=new Scanner(System.in);
System.out.println("Enter x1 and y1 :");
int x1=sc.nextInt();
int y1=sc.nextInt();
System.out.println("Enter x2 and y2 :");
int x2=sc.nextInt();
int y2=sc.nextInt();
dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Distance is "+dis);
}
}


