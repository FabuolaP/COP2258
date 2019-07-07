//import Scanner class
import java.util.Scanner;

public class Greeting {
    
        public static void main(String[] args) {
            
            //Problem: Greet each person (5) using a loop
            
            //1. initialize control variable
            
            int numOfFolk = 5;
            
            //2. Condition involving the control variable
            while( numOfFolk > 0){
                
                System.out.println(numOfFolk + ". HELLO!");
                
                //3. Update the value of the control vairable
                numOfFolk--;
                
            }//end of loop

            System.out.println("OUT OF FOLK!");
                
        }//end of main
        
}//end of class