import java.util.Scanner;

public class KaprekarCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long) n * n;
        String s = String.valueOf(sq);
        int len = s.length();
        boolean found = false;

        for (int i = 1; i < len; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int a = Integer.parseInt(left);
            int b = Integer.parseInt(right);
            if (b > 0 && a + b == n) {
                found = true;
                break;
            }
        }

        if (n == 1 || found) {
            System.out.println("Kaprekar");
        } else {
            System.out.println("Not Kaprekar");
        }
        sc.close();
    }
}
