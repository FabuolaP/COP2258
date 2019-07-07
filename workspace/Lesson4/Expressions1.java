/***************************************
//File name: Expressions1.java

//Due Date: Thursday, October 18

//Author: Fabuola Pierre

//Program Description: 

//Program Input:

//Program Output:

//Program Processing:
***************************************/

//import Scanner class
import java.util.Scanner;

public class Expressions1 {
        public static void main(String[] args) {
            
            //declare and initialize the variables
            int x = 5;
            int n = 2;
            double result;
            
            //Create Scanner object
            Scanner input = new Scanner(System.in);
            
            //compute the results of the equation
            result = Math.pow(1 + x , n) + (n * x) + ( (n * ( n - 1 )  * Math.pow(x , 2)) / 2);
            
            //display the results
            System.out.println("The result of the expression is: " + result);
                
        }//end of main
        
}//end of class