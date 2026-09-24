import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light colour (R/Y/G): ");
        char colour = sc.next().charAt(0);
        colour = Character.toUpperCase(colour);

        switch (colour) {
            case 'R':
                System.out.println("The light is RED. STOP.");
                break;
            case 'Y':
                System.out.println("The light is YELLOW. PREPARE TO STOP.");
                break;
            case 'G':
                System.out.println("The light is GREEN. PROCEED.");
                break;
            default:
                System.out.println("Invalid input! Please enter R, Y, or G.");
        }

        sc.close();
    }
}
    

