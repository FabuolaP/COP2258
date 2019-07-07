import java.util.Scanner;

public class SwitchExample1  {
    public static void main (String [ ] args) {
    
     //declare and initialize the variable day
     String day = "";  
     
     //Declare and Create a Scanner Object
     Scanner userInput = new Scanner (System.in);
     
     //Prompt the user for the day of the week
     System.out.print("Please enter the day of the week: ");
     
     //Read the user's input (String) for the day of the week
     day = userInput.next();
     
     //Process the variable day.  Depending on the day of the week a specific String will display
     switch (day) {
         
         case "Monday": System.out.println("Happy Monday!");
                           break;
                           
         case "Tuesday": System.out.println("It's almost Wednesday!");
                           break;
                           
         case "Wednesday": System.out.println("Happy hump day!");
                           break;
                           
         case "Thursday": System.out.println("Today is hump day!");
                           break;   
                           
         case "Friday":   System.out.println("Today is hump day!");
                           break;
                           
         case "Saturday": 
         case "Sunday":   System.out.println("Enjoy your weekend!");
                           break;
                           
         default:  System.out.println("You have entered an invalid day of the week!");
         
     }//end of switch
       
    }//end of main    
}//end of the class