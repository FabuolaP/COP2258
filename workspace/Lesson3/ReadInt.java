//import the Scanner class
import java.util.Scanner;

public class ReadInt {
    
        public static void main(String[] args) {
            //declare variable
            int age;
            
            //Create a new Scanner object
            Scanner input = new Scanner(System.in);
            
            //Prompt the user for the age
            System.out.print("How old are you? ");
            
            //Read the user's age using the nextInt() method
            age = input.nextInt();
            
            //Display their age + 5 to console
            System.out.println("You will be " + (age + 5) + " in 5 years!" );
                
        }//end of main
        
}//end of class