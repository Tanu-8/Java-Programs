import java.util.Scanner;

public class AutomorphicCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sq = n * n;
            int temp = n;
            int pow = 1;

            while (temp > 0) {
                pow *= 10;
                temp /= 10;
            }

            if (sq % pow == n) {
                System.out.println("Automorphic");
            } else {
                System.out.println("Not Automorphic");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }
}
