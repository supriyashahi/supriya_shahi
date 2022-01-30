//WAP tp print 10,8,6,4,2 using for and while loop.

import java.util.*;
public class EvenR {
    public static void main(String args[]) {
      int i=10;
      while(i>=2)
      {
       if(i%2==0)
      System.out.println(i);
      i--;
       }
   for(int j=10;j>=2;j=j-2)
   System.out.println(j);

    }
}