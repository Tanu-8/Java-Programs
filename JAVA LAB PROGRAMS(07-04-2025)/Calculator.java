public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int intSum = calc.add(5, 10);
        double doubleSum = calc.add(3.5, 7.2);

        System.out.println("Integer sum: " + intSum);
        System.out.println("Double sum: " + doubleSum);
    }
}