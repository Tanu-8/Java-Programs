import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, D, root1, root2, real, imag;

        System.out.print("Enter coefficient a: ");
        a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        c = sc.nextDouble();

        D = b * b - 4 * a * c;

        if (D > 0) {
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two distinct real roots: " + root1 + " and " + root2);
        } else if (D == 0) {
            root1 = -b / (2 * a);
            System.out.println("One repeated real root: " + root1);
        } else {
            real = -b / (2 * a);
            imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Two imaginary roots: " + real + " + " + imag + "i and " + real + " - " + imag + "i");
        }

        sc.close();
    }
}
