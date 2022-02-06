import java.util.*;

public class PallinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String str1 = "";
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        if (str.equals(str1)) {
            System.out.println("Pallindrome String");
        }

    }
}