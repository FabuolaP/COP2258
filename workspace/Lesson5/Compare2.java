//import Scanner class
import java.util.Scanner;

public class Compare2 {
    
        public static void main(String[] args) {
        
                //Declare variables
                int num1;
                int num2;
                
                //Create a scanner object
                Scanner sc = new Scanner(System.in);
                
                //Prompt user for num 1
                System.out.println("Enter first value: ");
        
                //Read num 1
                num1 = sc.nextInt();
                
                //Prompt user for num2
                System.out.print("Print second value: ");
                
                //Read num2
                num2 = sc.nextInt();
                
                //Use a selection statement to determine whether num1 is greater than num2
               
                if ( num1 > num2 ) {
                    System.out.println("num1 is greater than num2");
                    
                }else {System.out.println("num2 is greater than num1 or num1 and num2 are equivalent");
                    
                System.out.println("This is the end of the if statement example!");
               } //end of if statement
        
        }//end of main
        
}//end of class