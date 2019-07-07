//import Scanner class
import java.util.Scanner;

public class SumOfNum_NoMethods {
    
        public static void main(String[] args) {
            //declare variables
            int num1, num2, largest;
            
            //create a scanner object
            Scanner input = new Scanner(System.in);
            
            //prompt user for first and second number
            System.out.print("Please enter two numbers separated by a space: ");
            
            //read first number
            num1 = input.nextInt();
            
            //read second number
            num2 = input.nextInt();
            
            //find the largest of the two numbers
            if(num1 > num2) {
                largest = num1;
            }   else {
                 largest = num2;
            }//end of branching statement
            
            //print largest number
            System.out.println("The largest between " +num1 + " and " + num2 + "is: " + largest);
            
            

                
        }//end of main
        
}//end of class