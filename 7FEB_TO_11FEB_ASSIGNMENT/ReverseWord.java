import java.util.*;

public class ReverseWord {
    public void reverse(String str) {
        String[] words = str.split(" ");
        String revstring = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revword = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revword = revword + word.charAt(j);
            }
            revstring = revstring + revword + " ";
        }
        System.out.println(str);
        System.out.println(revstring);
    }

    public static void main(String[] args) {
        ReverseWord obj = new ReverseWord();
        obj.reverse("Hello My Name is Supriya Shahi.");
    }
}
