import java.util.Scanner;    // needed to use Scanner for input

public class DecrementExample1 {
   public static void main(String[] args) {
      
        //Declare and initialize variables
        int apple = 6;
        int ball = apple--;
       
        //Print values of variables to the screen       
        System.out.println(apple);
        System.out.println(ball);
       
        //Initialize variables to a new value
        apple = 6;
        ball = --apple;
        
        //Print current values of variables to the screen
        System.out.println(apple);
        System.out.println(ball);      
       
   }//end of main
}//end of class