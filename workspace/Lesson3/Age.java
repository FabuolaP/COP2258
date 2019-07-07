
//import the Scanner class
import java.util.Scanner;

public class Age {
    
        public static void main(String[] args) {
            
            //declare variables
            int num1, num2, sum, product, modulus;
            
            //Create Scanner object
            //Object name is keyboard
            Scanner keyboard = new Scanner(System.in);
            
            //Prompt the user for first number
            System.out.print("Please enter the first number: ");
            
            //Read the first number 
            num1 = keyboard.nextInt();
            
            //Prompt the user for the second number
            System.out.print("Please enter the second number: ");
            
            //Read the second number
            num2 = keyboard.nextInt();
            
            //Calculate the sum
            sum = num1 + num2;
            
            //Calculate the product
            product = num1 * num2;
            
            //Calculate the modulus
            modulus = num1 % num2;
            
            //Display the results
            System.out.println("The sum is: " + sum);
            System.out.println("The product is: " + product);
            System.out.println("The modulus is: " + modulus);
        }//end of main
        
}//end of class