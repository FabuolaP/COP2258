/***************************************
//File name: Expressions1.java

//Due Date: Thursday, October 18

//Author: Fabuola Pierre

//Program Description:

//Program Input:

* Program Output:

//Program Processing:
***************************************/

//import Scanner class
import java.util.Scanner;

public class Expressions2 {
    
        public static void main(String[] args) {
            
            //declare variables
            int x = 5;
            int n = 2;
            double result;
            
            //prompt the user for value x
            System.out.println("Please enter a value for x: " );
            
            //prompt the user for value n
            System.out.println("Please enter a value for n: " );
            
            //compute the final result 
            result = Math.pow(1 + x , n) + (n * x) + ( (n * ( n - 1 )  * Math.pow(x , 2)) / 2);
            
            //display the results
            System.out.println("The result of the expression is: ");
            
        }//end of main
        
}//end of class