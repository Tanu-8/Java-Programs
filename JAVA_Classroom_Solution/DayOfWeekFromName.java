import java.util.Scanner;

public class DayOfWeekFromName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;

        System.out.print("Enter day name: ");
        day = sc.nextLine().toLowerCase();

        switch (day) {
            case "monday": System.out.println("1st day of the week"); break;
            case "tuesday": System.out.println("2nd day of the week"); break;
            case "wednesday": System.out.println("3rd day of the week"); break;
            case "thursday": System.out.println("4th day of the week"); break;
            case "friday": System.out.println("5th day of the week"); break;
            case "saturday": System.out.println("6th day of the week"); break;
            case "sunday": System.out.println("7th day of the week"); break;
            default: System.out.println("Invalid day name");
        }

        sc.close();
    }
}
