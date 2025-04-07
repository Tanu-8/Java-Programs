
class Car {
    String color;

    void displayColor() {
        System.out.println("color"+color);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.displayColor();
    }
}

