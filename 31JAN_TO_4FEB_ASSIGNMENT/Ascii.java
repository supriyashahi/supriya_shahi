import java.util.*;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character :");
        char ch = sc.next().charAt(0);
        int n = ch;
        System.out.println("ASCII value of" + ch + " is " + n);

    }

}
