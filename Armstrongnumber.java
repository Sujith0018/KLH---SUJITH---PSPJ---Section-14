import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.in);
        System.out.print("Enter a number: ");
        int number = scanner. nextInt();

        int temp = number;
        int countTemp = number;
        int digits = 0;
        int sum = 0;

        while (countTemp > 0) {
            countTemp = countTemp / 10;
            digits++;
        }
        temp = number;

        while (temp > 0) {
            int digit = temp % 10;

            int powerResult = 1;
            for (int i = 1; i <= digits; i++) {
                powerResult = powerResult * digit;
            }
            sum = sum + powerResult;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}

