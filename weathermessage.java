import java.util.Scanner;

public class weathermessage {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter temperature in Centigrade: ");
        
        // Check if the input is a valid number
        if (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();

            // Determine and display the weather state based on the temperature
            if (temp < 0) {
                System.out.println("Freezing weather");
            } else if (temp >= 0 && temp < 10) {
                System.out.println("Very Cold weather");
            } else if (temp >= 10 && temp < 20) {
                System.out.println("Cold weather");
            } else if (temp >= 20 && temp < 30) {
                System.out.println("Normal in Temp");
            } else if (temp >= 30 && temp < 40) {
                System.out.println("Its Hot");
            } else {
                System.out.println("Its Very Hot");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid numerical temperature.");
        }
        scanner.close();
    }
}

          