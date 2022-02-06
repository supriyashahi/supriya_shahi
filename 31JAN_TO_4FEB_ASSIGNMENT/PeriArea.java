import java.util.*;

public class PeriArea {
    public static void Perimeter(int a, int c) {
        int p = 2 * (a + c);
        System.out.println("Perimeter is :" + p);
    }

    public static void Area(int a, int c) {
        int area = a * c;
        System.out.println("Area is :" + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath of rectangle :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Perimeter(l, b);
        Area(l, b);
    }
}
