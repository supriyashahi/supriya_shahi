import java.util.*;

public class HighestOccuring {

    public static void main(String[] args) {
        String str = "AAABBCCCCC"; // input String
        int length = str.length(); // length of a String

        // Created an object of a StringBuilder class
        StringBuilder sb = new StringBuilder();

        int count = 1; // counter for counting number of occurances

        for (int i = 0; i < length; i++) {
            // if i reaches at the end then append all and break the loop
            if (i == length - 1) {
                sb.append(str.charAt(i) + "" + count);
                break;
            }

            // if two successive chars are equal then increase the counter
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // else append character with its count
                sb.append(str.charAt(i) + "" + count);
                count = 1; // reseting the counter to 1
            }
        }

        // String representation of a StringBuilder object
        System.out.println(sb.toString());

    }
}