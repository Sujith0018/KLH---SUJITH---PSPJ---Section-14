import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double Fahrenheit = input.nextFloat();

        double Celsius = ((Fahrenheit - 32) * 5 / 9);

        System.out.println("The temperature in celsius is: " + Celsius);

        
        input.close();
       
        }
    }