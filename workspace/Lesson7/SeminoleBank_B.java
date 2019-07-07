import java.util.Scanner; //needed to use Scanner for input

public class SeminoleBank_B {
  public static void main(String[] args) {
      
      //Declare and initialize variable
      int deposit, withdrawal;
      double balance = 1000.00;
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
              
              case 'B': System.out.println("\nAccount Number: " + acctNumber + " has a current balance of: " + "$" + balance); 
              System.out.println("");
              break;
                
                default:  System.out.println("\nYou have entered an invalid menu choice!");
              
      }//end of switch        


      }while(menuChoice !='X'); //end of do while
    
    //Display final message
   System.out.println("\nThank you for being a loyal Seminole Bank customer!");
    
  }//end of main
}//end of class
