/************************************************************************************************
 * File Name:   Pierre_Lesson8.java
 * 
 * Due Date:    December 10, 2018
 * 
 * Author:      Fabuola Pierre
 * 

 * **********************************************************************************************/

import java.util.Scanner;

public class Pierre_Lesson8 {
    

        //Main Function
        public static void main(String []args){
                
      //Declare and initialize variable
      int deposit, withdrawal;
      double balance = 5000.00;
      char menuChoice;
      int acctNumber;
      
      //Create Scanner object
      Scanner keyboard = new Scanner (System.in);
      
      //Display welcome messages and request and read users' account number 
      
        System.out.println("******************************************************************************");
        System.out.println("\t\t\tWelcome to Seminole Bank! ");
        System.out.println("******************************************************************************");
        
        System.out.print("\nPlease enter your 5-digit Seminole Account Number: ");
        acctNumber = keyboard.nextInt();
        System.out.println("\nThank you!");
      
      //Process menu until user enters X using a switch statement
      do {
          //Display menu choices and request and read the users' banking choice
             System.out.print("\nEnter D for deposit, W for withdrawal, B for balance or- X to exit the menu: ");
             menuChoice = keyboard.next().toUpperCase().charAt(0);
             System.out.println("");
             
          switch (menuChoice) {
              
              case 'D': System.out.print("\nEnter the amount of the deposit:$ ");
              deposit = keyboard.nextInt();
              balance = balance + deposit;
              System.out.println("");
              break;
              
              case 'W': System.out.print("\nEnter the amount of withdrawal:$ ");
              withdrawal = keyboard.nextInt();
              balance = balance - withdrawal; 
              System.out.println("");
              break;
              
              case 'B': System.out.printf("\nAccount Number: " + acctNumber + " has a current balance of: $%.2f\n", balance);
              System.out.println("");
              break;
                
                default:  System.out.println("\nYou have entered an invalid menu choice!");
              
      }//end of switch        


      }while(menuChoice !='X'); //end of do while
    
    //Display final message
   System.out.println("\nThank you for being a loyal Seminole Bank customer!");
    
  }//end of main


             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/

         
         public static void welcomeMessage(){            
             
                //Purpose of Function:  Display the welcome message 
                //NOTE:  The parameter of this function is empty.
                //NOTE:  There is NO RETURN STATEMENT

                //Print the welcome message "Welcome to Seminole Bank!"
                System.out.println("******************************************************************************");
                System.out.println("\t\t\tWelcome to Seminole Bank! ");
                System.out.println("******************************************************************************");                
            
         }//end of welcomeMessage
         
    
         
         public static double accountInfo (){
             
                //Purpose of Function:  Prompt and Read user's account number. 
                //NOTE:  RETURN the account number to main()
                //NOTE:  The parameter of this function is empty.
             
                //Declare local variable(s) including a Scanner object
                int acctNumber;
                Scanner input = new Scanner (System.in);
             
                //Prompt user "Please enter your 5-digit Account Number:  "
                System.out.print("\nPlease enter your 5-digit Seminole Account Number: ");
       
            
                //Read user’s account number AND assignment it to a local variable
                acctNumber = input.nextInt();
             
                //Print "Thank you!!"
                 System.out.println("\nThank you!"); 
             
                //RETURN the user’s account number to main()                    
                return acctNumber;
             
                }//end of accountInfo
         
        

         public static char displayMenu (){
             
                //Purpose of Function:  Display menu choices to the user and Read the user's banking choice.           
                //NOTE:  RETURN the user’s menu choice to main()
                //NOTE:  The parameter of this function is empty.

             
                //Declare local variable(s) including a Scanner object
                Scanner input = new Scanner(System.in);
             
                //Prompt user "Enter D for deposit, W for withdrawal, B for balance, X to exit the menu: "
                System.out.print("\nEnter D for deposit, W for withdrawal, B for balance or- X to exit the menu: ");
               
                 System.out.println("");
                 
                //Read the user's menu choice AND assignment it to a local variable
                char menuChoice;
             
                //Ensure user input has correct case [HINT:  menu choice = Character.toUpperCase(menu choice)]
                 menuChoice = input.next().toUpperCase().charAt(0);
             
                //RETURN menu choice to main()
                return menuChoice;
                                     
         }//end of displayMenu
         
    
         

         public static double depositFunds(double balance){
             
                //Purpose of Function:  Prompt the user for the amount to deposit and Read deposit amount.           
                //NOTE:  Update the balance and RETURN the balance to main()
                //NOTE:  Pass this function the balance in the parameter
             
                //Declare local variable(s) including a Scanner object
                double nBalance;
                double deposit;
                
                Scanner input = new Scanner (System.in);
                
                //Prompt user "Enter the amount of the deposit: "
                System.out.print("Please enter the amount of the deposit: ");
             
                //Read the deposit amount
                deposit = input.nextInt();
             
                //Calculate the new balance after the deposit [HINT:  balance = balance + deposit amount]
                nBalance = balance;
                
                //RETURN balance to the main()
                return nBalance;
                          
         }//end of depositFunds
         

    

         public static double withdrawFunds (double balance){
             
                //Purpose of Function:  Prompt the user for the amount to withdraw and Read withdrawal amount.  
                //NOTE:  Update the balance and RETURN the balance to main()
                //NOTE:  Pass this function the balance in the parameter
             
                //Declare local variable(s) including a Scanner object
                double nBalance;
                double withdrawal;
                
                Scanner input = new Scanner(System.in);
             
                //Prompt user "Enter the amount of the withdrawal: "
                System.out.print("\nEnter the amount of withdrawal:$ ");
             
                //Read the withdrawal amount AND assignment it to a local variable
                 withdrawal = input.nextInt();
             
                //Calculate the balance after the withdrawal [HINT:  balance = balance - withdrawal amount]
               nBalance = balance - withdrawal;
             
                //RETURN balance to the main()             
                return nBalance;
             
         }//end of withdrawFunds
     
    
    
    
         public static void checkBalance(int acctNumber, double balance){
             
                //Purpose of Function:  Display the balance and DO NOT RETURN anything to main().            
                //NOTE:  Pass this function the account number AND the balance in the parameter
                //NOTE:  There is NO RETURN STATEMENT
             
                //Display "Account Number:  " + (INSERT THE ACCOUNT NUMBER) + " has a current balance of :  $ " + balance             
                System.out.printf("\nAccount Number: " + acctNumber + " has a current balance of: $%.2f\n", balance);
               
         }//end of checkBalance
                  
        /**************************************************END OF Pierre_Lesson8.java Class **************************************************/
    
    
}//end of BankAccount Class

