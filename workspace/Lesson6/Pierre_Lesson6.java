/************************************************************************************************
 * File Name:   Pierre_Lesson6.java
 * 
 * Due Date:    November 20, 2018
 * 
 * Author:      Fabuola Pierre
 * 
 * Program Description:  
 *             Creating a radio station menu and processing the information for each of the different choices. 
 * 
 * Input:       Last name, menu choice, new station, station choice
 *
 * Output:      menu, selected station choice, last name            
 *
 * Processing:  the user's menu input choice          
 *              
 * **********************************************************************************************/

import java.util.Scanner; //needed to use Scanner for input

public class Pierre_Lesson6 {
  public static void main(String[] args) {
   
        //Declare variables
        String lastName = ""; //variable for last name
        int menuChoice; // variable for menu choice
        String newStation = ""; // variable for a new station choice
        int stationChoice; // variable for a new station choice
        
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);  
        
        //Display the Opening Statement which includes the Slacker Radio Menu
        System.out.println("*************************************** Welcome to Slacker Radio! ***************************************");
        System.out.println("\n\t\t\t\tSLACKER RADIO MENU:");
        System.out.println("\n\t\t\t\t1 - Create a New Slacker Radio Station");
        System.out.println("\n\t\t\t\t2 - Play a Slacker Radio Station");
        System.out.println("\n\t\t\t\t3 - Exit Slacker Radio");
        System.out.println("\n*********************************************************************************************************");
  
        //Prompt the user for their last name and menu choice option
 
        System.out.print("\n\nPlease enter your last name followed by your Slacker Radio Menu Choice: " );
 
        //Read the user's lastname and read the user's menu choice; Parse string if necessary!
  
        lastName = keyboard.next();
        menuChoice = keyboard.nextInt();
        
        //Clear the input stream buffer
        keyboard.nextLine();
  
        //Convert last name to uppercase, if necessary

        lastName = lastName.toUpperCase();

        //Use a control statement such as an (if()/else if() or switch()) to process the user's menu choice (options:  1, 2, 3, other)
        if (menuChoice == 1){
            
            System.out.println("\nYou have selected the CREATE A NEW Slacker Radio STATION menu option");
            System.out.print("\nPlease enter the name of the new station: " );
            
            newStation = keyboard.next().toUpperCase();
            
            System.out.println("\nYou have successfully created the following station: " + newStation);
            System.out.println(" \n" +  lastName + "!\tThank you for being a valued listener!");
            System.out.println("\n*******************************GOODBYE Slacker Radio LISTENER*****************************" );
            
        } else if (menuChoice == 2) {
            
            System.out.println("You have selected the PLAY A SLACKER RADIO STATION menu option.");
            System.out.println("The user " + lastName + " currently has created the following stations:" );
            System.out.println("1 - Justin Timberlake");
            System.out.println("2 - Beyoncé Knowles");
            System.out.println("3 - Pretty Ricky");
            System.out.println("4 - Drake");            
            System.out.println("5 - Carimi");            
            System.out.println("6 - Rihanna");            
            System.out.println("7 - Jonas Brothers");            
            System.out.println("8 - Justin Bieber");            
            System.out.println("9 - Plies");            
            System.out.println("10 - Kodak Black");          
            System.out.print("\nWhich station would you like to listen to? (Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10): "  );
            
            //Read user station input choice
            stationChoice = keyboard.nextInt();
            
                //switch statement for station choices
                switch (stationChoice){
                    case 1 :  System.out.println("\nYou are now listening to JUSTIN TIMBERLAKE!" ); break;
                    case 2 :  System.out.println("\nYou are now listening to BEYONCE KNOWLES!");break;
                    case 3 :  System.out.println("\nYou are now listening to PRETTY RICKY!");break;
                    case 4 :  System.out.println("\nYou are now listening to DRAKE!");break;
                    case 5 :  System.out.println("\nYou are now listening to CARIMI!");break;
                    case 6 :  System.out.println("\nYou are now listening to RIHANNA!");break;
                    case 7 :  System.out.println("\nYou are now listening to JONAS BROTHERS!");break;
                    case 8 :  System.out.println("\nYou are now listening to JUSTIN BIEBER!");break;
                    case 9 :  System.out.println("\nYou are now listening to PLIES");break;
                    case 10:  System.out.println("\nYou are now listening to KODAK BLACK!");break;
                    
                    default:  System.out.println("You have entered an invalid station!");
    
            }//end of switch statement
            
            //Display thank you message
            System.out.println(" \n" + lastName + "!\tThank you for being a valued listener!");
            System.out.println("\n*******************************GOODBYE Slacker Radio LISTENER*****************************" );
        } else if (menuChoice == 3 ) {
            
            System.out.println("\nYou have selected the EXIT Slacker Radio menu option.");
            System.out.println(" \n" +  lastName + "!\tThank you for being a valued listener!");
            System.out.println("\n*******************************GOODBYE Slacker Radio LISTENER*****************************" );
        }
 
        

  }//end of main
}//end of class