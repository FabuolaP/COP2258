/************************************************************************
 * File Name:   Pierre_Lesson3.java
 * 
 * Due Date:    09/28/18
 * 
 * Author:      Fabuola Pierre
 * 
 * Program Description:  
 *              This program is designed to compute the tax and tip on a restaurant bill.
 * 
 * Program Input: meal charge, tip percentage, tax        
 *
 * Program Output: the total bill                 
 *
 * Program Processing:            
 *              
 * **********************************************************************/
 import java.util.Scanner;
 public class Pierre_Lesson3 {

    public static void main(String[] args) {
        
        //declare variables
        double mealCharge;
        double taxAmount;
        double tipAmount;
        double totalBill;
        double tax;
        double tip;
        
        //declare and initialize constant variables
        final double TAX = .0675;
        final double TIP = .15;
        
        //Create Scanner object
        Scanner input = new Scanner(System.in);
        //Scanner mealCharge = new Scanner(System.in);
        
        //Prompt the user for cost of meal
        System.out.print("Please enter the cost of the meal: ");
                    
  
       mealCharge = input.nextDouble();
       
       taxAmount = mealCharge * TAX;
       
       tipAmount = mealCharge * TIP;
       
       totalBill = mealCharge + taxAmount + tipAmount;
        
        //Display program header
        System.out.println("\t\t\tSeminole Buffet \n\t\t\t123 Gaines Street \n\t\t\tTallahassee, Florida 32301");
        
        //Display Receipt Details
        System.out.println("\nReceipt Details:");
        
        //Display the results
        System.out.println("Meal Cost: = " + mealCharge );
        System.out.println("Tax Amount:  " + mealCharge * TAX );
        System.out.println("Tip Amount: " + mealCharge * TIP );
        System.out.println("Total Bill: " + totalBill ); 
        
       //Display Thank You message
       System.out.println("\nThank You for Dining With Us!\nPlease Come Again to Seminole Buffet!");
        
    }//end of main

}//end of class





