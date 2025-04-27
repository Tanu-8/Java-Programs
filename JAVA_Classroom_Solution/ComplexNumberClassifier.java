import java.util.Scanner;

public class ComplexNumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real, imag;

        System.out.print("Enter real part: ");
        real = sc.nextInt();

        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();

        if (imag == 0) {
            if (real == 0) {
                System.out.println("The number is zero");
            } else {
                System.out.println("The number is purely real");
            }
        } else if (real == 0) {
            System.out.println("The number is purely imaginary");
        } else {
            System.out.println("The number is a complex number");
        }

        sc.close();
    }
}

