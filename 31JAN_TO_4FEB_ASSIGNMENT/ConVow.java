import java.util.*;

public class ConVow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any character :");
        char ch = sc.next().charAt(0);
        String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == 'O' || ch == 'U') ? ch + " is a vowel." : ch + " is a consonant.";

        System.out.println(res);

    }
}
