import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        a += b;
        System.out.println("a += b: " + a);

        a -= b;
        System.out.println("a -= b: " + a);

        a *= b;
        System.out.println("a *= b: " + a);

        if (b != 0) {
            a /= b;
            System.out.println("a /= b: " + a);

            a %= b;
            System.out.println("a %= b: " + a);
        } else {
            System.out.println("Cannot perform division or modulus by zero.");
        }

        System.out.println("a++: " + (a++));
        System.out.println("After a++: " + a);

        System.out.println("++a: " + (++a));

        System.out.println("a--: " + (a--));
        System.out.println("After a--: " + a);

        System.out.println("--a: " + (--a));

        sc.close();
    }
}
