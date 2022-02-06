import java.util.*;

public class TrianglePeri {
    public static void Perimeter(int n, int m, int p) {
        int peri = n + m + p;
        System.out.println("Peimeter of triangle is :" + peri);

    }

    public static void main(String[] args) {
        Perimeter(2, 3, 5);
    }
}
