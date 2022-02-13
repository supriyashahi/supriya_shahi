import java.util.Arrays;

public class LastIndex {

    public static void main(String[] args) {
        Integer[] array1 = { 2, 4, 6, 8, 10 };

        int getIndex = Arrays.asList(array1).indexOf(10);

        System.out.println("10 is located at " + getIndex + " index");
    }
}
