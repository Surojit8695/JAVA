import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner once
        int day;

        while (true) {
            System.out.print("Enter the day (0-6, any other number to exit): ");
            day = sc.nextInt(); // Keep using the same scanner

            switch (day) {
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
                default:
                    System.out.println("Invalid input... exiting program.");
                    break; // or use System.exit(0) if you prefer
            }

            if (day < 0 || day > 6) {
                break; // Exit the loop
            }
        }

        // Close scanner AFTER you're done with input
        sc.close();
    }
}