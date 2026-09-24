import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     

        
        System.out.print("Enter the year you were born ");
        int birthYear = input.nextInt();
        
        System.out.print("Enter the present year ");
        int presentYear = input.nextInt();
        
        int age = presentYear - birthYear;


        System.out.println("Your age is: " + age);









        input.close();
    }
}

        
        

    
