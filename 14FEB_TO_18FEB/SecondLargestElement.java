import java.util.Arrays;  
public class SecondLargestElement{  
public static int getSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={9, 7, 15, 6, 13, 11};  
System.out.println("Second Largest: "+getSecondLargest(a,6));  
 }}