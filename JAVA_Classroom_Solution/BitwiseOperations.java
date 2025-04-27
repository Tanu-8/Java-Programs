import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Enter first number: ");
        x = sc.nextInt();

        System.out.print("Enter second number: ");
        y = sc.nextInt();

        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("~x = " + (~x));
        System.out.println("x << 1 = " + (x << 1));
        System.out.println("x >> 1 = " + (x >> 1));

        sc.close();
    }
}
