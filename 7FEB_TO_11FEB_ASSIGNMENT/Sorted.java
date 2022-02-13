import java.util.*;

public class Sorted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
