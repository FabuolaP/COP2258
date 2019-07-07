//import Scanner class
import java.util.Scanner;

public class ComputeAreaInput {
    
        public static void main(String[] args) {
            
            //Declare variables
            final double PI = 3.14159;
            double radius, area; 
            
            //Create a Scanner object called keyboard
            Scanner keyboard = new Scanner (System.in);
            
            //Prompt the user to enter the radius
            System.out.print("Enter the radius: ");
            
            //Read and initialize the radius
            radius = keyboard.nextDouble();
            
            //Compute the area
            area = radius * radius * PI;
            
            //Display the results
            System.out.println("The area of the circle is: " + area);
                
        }//end of main
        
}//end of class