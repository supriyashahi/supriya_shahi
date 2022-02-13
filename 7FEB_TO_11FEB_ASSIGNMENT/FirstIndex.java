import java.util.Arrays;

public class FirstIndex {
    public static void main(String[] args) {
        Integer[] array1 = { 2, 4, 6, 8, 10 };

        int getIndex = Arrays.asList(array1).indexOf(2);

        System.out.println("2 is located at " + getIndex + " index");
    }
}
