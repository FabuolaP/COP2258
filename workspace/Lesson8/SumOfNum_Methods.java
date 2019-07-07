//import Scanner class
import java.util.Scanner;

public class SumOfNum_Methods {
    
        public static void main(String[] args) {
            //declare local variables
            int num1, num2;
            int max;
            
            //create a scanner object
            Scanner input = new Scanner(System.in);
            
            //prompt user for first and second number
            System.out.print("Please enter two numbers separated by a space: ");
            
            //read first number
            num1 = input.nextInt();
            
            //read second number
            num2 = input.nextInt();
            
            //REMOVED THE STATEMENTS TO FIND THE MAX OF TWO INTS
            
            //Function call - call/invoke the findMax()
            //Call statement for a value-return method
            //pass the valyes in the INFORMAL parameter - NO DATATYPES INCLUDED
            max = findMax(num1, num2 );
            
            //REMOVED PRINT STATEMENT
            //Call the printLargest() - void function
            //Pass by value the variable max
            printLargest( max );
            
                
        }//end of main
        
        //FUNCTION DEFINITIONS
        
        //Purpose: Find the largest of two numbers and return largest value to main()
        public static int findMax (int num1, int num2){
            //body of the function
            
            //declare a local variable
            int largest;
        
            //find the largest of the two numbers
            if(num1 > num2) {
                largest = num1;
            }   else {
                 largest = num2;
            }//end of branching statement
        
            //return the VALUE for the variable largest back to main
            return largest;
        }//end of findMax()
        
        //Purpose: Print the largest value to the screen
        //Return type: void
        public static void printLargest(int max ){
            
            //print largest number
            System.out.println("The largest value is: " + max );
            
        }//end of printLargest()
        
        
}//end of class