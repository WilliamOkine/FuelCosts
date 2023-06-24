import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gas = 0; // The number of gallons of gas in the tank
        double eff = 0; // Efficiency in miles per gallon
        double tank = 0; // The amount of gallons in the tank

        System.out.print("Enter the amount of gallons left in your tank: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                tank = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }

        System.out.print("Enter your car's miles per gallon: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                eff = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }

        System.out.print("Enter the price of gas per gallon: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                gas = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }

        double milesLeft = tank * eff;
        double costPer100 = (100 / eff) * gas;

        System.out.println("The car can go " + milesLeft + " miles with the gas in the tank.");
        System.out.println("The cost per 100 miles is " + costPer100);
    }
}
