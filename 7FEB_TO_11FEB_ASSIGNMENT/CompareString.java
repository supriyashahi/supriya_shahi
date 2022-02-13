import java.util.*;

public class CompareString {

    public static void main(String[] args) {
        String s1 = "Abhishek";
        String s2 = "Abhishek";
        String s3 = new String("Abhishek");
        String s4 = "Abhinav";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));// false
    }
}
