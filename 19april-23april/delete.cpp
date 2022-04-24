import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class morph {

    public static LinkedList<String> list;

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>(); // creating list

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // user will enter total elements

        while (num > 0) {
            ll.add(sc.nextInt());
            num--; // decrement till the index became 0
        }
        sc.close();
        System.out.println(ll);
    }
}
