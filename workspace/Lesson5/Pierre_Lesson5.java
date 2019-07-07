/*******************************************************************************
 * 
 * File Name:   Pierre_Lesson5.java   
 * 
 * Due Date:    11/02/18
 * 
 * Author:      Fabuola Pierre
 * 
 * Program Description:  
 *              This program is designed to determine the exchange rate from U.S. Dollars to another global currency.
 * 
 * Program Input:         U.S. Dollars
 *
 * Program Output:  Exchange rate for selected global currency
 *
 * Program Processing: exchange rate          
 *    
 * 
 * Online Currency Converter Example:  https://www.oanda.com/currency/converter/
 * ****************************************************************************/

//Import Scanner class
import java.util.Scanner;

public class Pierre_Lesson5 {

    public static void main(String[] args) {
        //declare variable
        int menuChoice; 
        double USD; 
        double result; 
        double AUD = 1.40885; //declares Australian Dollar and assigns it to that country's exchange rate.
        double XBT = 0.00025;
        double GBP = 0.76826;
        double CAD = 1.30976;
        double CNY = 6.93780;
        double DKK = 6.49079;
        double EUR = 0.87007;
        double HKD = 7.83955;
        double IRR = 42000;
        double NGN = 361.969;
    
        
        //print application header
        System.out.println("\n\t\t**********************************************************");
        System.out.println("\t\t\tTHE CURRENCY CALCULATOR (as of October 23, 2018)");
        System.out.println("\t\t**********************************************************");
        
        //create scanner class
        Scanner userInput = new Scanner(System.in);
        
        //prompt user for how much money to convert
        System.out.printf("\nHow many United States Dollars (USD) would you like to convert?: $");
        
        //read USD amount
        USD = userInput.nextDouble();
        
        //print menu
        System.out.println("\nGlobal Currency List:");
        System.out.println("1 - Australian Dollar (AUD)");
        System.out.println("2 - Bitcoin (XBT");
        System.out.println("3 - British Pound (GBP");
        System.out.println("4 - Canadian Dollar (CAD)");
        System.out.println("5 - Chinese Yuan Renminibi (CNY)");
        System.out.println("6 - Danish Krone (DKK)");
        System.out.println("7 - Euro (EUR)");
        System.out.println("8 - Hong Kong Dollar (HKD)");
        System.out.println("9 - Iranian Rial (IRR)");
        System.out.println("10 - Nigerian Naira (NGN)");
        
        //prompt user for menu option
        System.out.print("\nWhat global currency would you like to convert to?: "); 
        
        // Read menu option
        menuChoice = userInput.nextInt();
        
        //Process the menu option using a multi-way branching statement
        if (menuChoice == 1){
            
            result = USD * AUD;
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD:$%.2f", USD); System.out.printf(" to AUD:$%.2f", result);
            System.out.println("\n***************************************************");
            
        } else if (menuChoice == 2) {
        
            result = USD * XBT;
            
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD:$%.2f", USD); System.out.printf(" to XBT:$%.2f ", result);
            System.out.println("\n***************************************************");
            
        } else if (menuChoice == 3 ) {
            
            result = USD * GBP;

            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to GBP: $%.2f", result);
            System.out.println("\n***************************************************");
        
        } else if (menuChoice == 4) {
            
            result = USD * CAD;
        
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to CAD: $%.2f", result);
            System.out.println("\n***************************************************");
        
        } else if (menuChoice == 5) {
        
            result = USD * CNY;
            
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to CNY: $%.2f", result);
            System.out.println("\n***************************************************");
            
        } else if (menuChoice == 6) {
            
            result = USD * DKK;

            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to DKK: $%.2f", result);
            System.out.println("\n***************************************************");
        
        } else if (menuChoice == 7) {
            
            result = USD * EUR;
        
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf("to EUR: $%.2f", result);
            System.out.println("\n***************************************************");

        } else if (menuChoice == 8) {
            
            result = USD * HKD;
        
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f$", USD); System.out.printf(" to HKD: $%.2f", result);
            System.out.println("\n***************************************************");
               

        } else if (menuChoice == 9) {
            
            result = USD * IRR;
        
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to IRR: $%.2f", result);
            System.out.println("\n***************************************************");

        } else if (menuChoice == 10) {
            
            result = USD * NGN;
        
            System.out.println("\n***************************************************");
            System.out.printf("\t\tUSD: $%.2f", USD); System.out.printf(" to NGN: $%.2f", result);
            System.out.println("\n***************************************************");
        }   
         else{
            System.out.println("\nYou have entered an invalid menu choice! Goodbye!!");
        }//Why? To determine exchange rate of 10 countries with U.S. Dollars
              


    
    }//end of main

}//end of class


