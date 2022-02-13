import java.util.*;

public class Permutation {
    public static Boolean permutation(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length)
            return false;
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            int x = arr1[i];
            if (hM.get(x) == null)
                hM.put(x, 1);
            else {
                int k = hM.get(x);
                hM.put(x, k + 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            if (hM.get(x) == null || hM.get(x) == 0)
                return false;
            int k = hM.get(x);
            hM.put(x, k - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 5, 6, 7, 8, 3 };
        int arr2[] = { 4, 6, 7, 8, 5, 2, 3 };
        boolean p = permutation(arr1, arr2);
        System.out.print(p);
    }
}
