//import Scanner class
import java.util.Scanner;

public class ReadName {
    
        public static void main(String[] args) {
            
            //Declare variables
            String fname;
            
            //Create a Scanner object
            Scanner input = new Scanner(System.in);
            
            //Prompt user for full name 
            System.out.print("Please enter your full name: ");
            
            //Read the first name
           fname = input.next();  
            
            //Parse the String to return the first name
            fname = input.next(); 
            
            //Display the first name only
            System.out.println("Thanks " + fname + "!");

                
        }//end of main
        
}//end of class