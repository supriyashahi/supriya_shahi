import java.util.*;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String str1 = "";
        System.out.println("Enter the name of city :");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println(str1);
    }

}
