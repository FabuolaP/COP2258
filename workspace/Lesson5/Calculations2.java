//import Scanner class
import java.util.Scanner;

public class Calculations2 {
    
        public static void main(String[] args) {

        //declare variables
        double num1;
        double num2;
        double result;
        int menuChoice;
        
        
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user for num1
        System.out.print("Enter first value: ");  
        
        //read num1
        num1 = input.nextDouble();
        
        //Prompt user for num2
        System.out.print("Enter second value: "); 
        
        //read num2
        num2 = input.nextDouble();
        
        //Print menu
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        
        //Prompt user for menu option
        System.out.println("What would you like to do? [Enter 1, 2, 3, OR 4: "); 
        
        // Read menu option
        menuChoice = input.nextInt();
        
        //Process the menu option using a multi-way branching statement
        switch(menuChoice){
            case 1: result = num1 + num2;
            System.out.println("The result of addition is: " + result); break;
                    
            case 2: result = num1 - num2;
            System.out.println("The result of subtraction is: " + result); break;
                    
            case 3: result = num1 * num2;
            System.out.println("The result of multiplication is: " + result); break;
                    
            case 4: result = num1 / num2;
            System.out.println("The result of division is: " + result); break;
                
        }
        
        

            
        }//end of main
        
}//end of class