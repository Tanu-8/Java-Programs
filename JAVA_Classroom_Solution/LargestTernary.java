import java.util.Scanner;

public class LargestTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, max;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        max = (a > b) ? a : b;

        System.out.println("Largest number is: " + max);

        sc.close();
    }
}

