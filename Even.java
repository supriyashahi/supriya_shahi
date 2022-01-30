//WAP tp print 2,4,6,8,10 using for and while loop.

import java.util.*;
public class Even {
    public static void main(String args[]) {
      int i=2;
      while(i<=10)
      {
       if(i%2==0)
      System.out.println(i);
      i++;
       }
   for(int j=2;j<=10;j=j+2)
   System.out.println(j);

    }
}