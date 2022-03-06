import java.util.*;

class Truncate {
    public static String truncateSentence(String s, int k) {
        // change string to array
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        // make string using k words
        for (int i = 0; i < k; i++) {
            sb.append(arr[i] + " ");
        }

        // trim is used to remove last white space
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String str1 = truncateSentence(s, k);
        System.out.println(str1);
    }
}
