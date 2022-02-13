import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void isUnique(Integer[] arr1) {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr1));
        if (arr1.length == set.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5, 6 };
        isUnique(arr1);

    }
}
