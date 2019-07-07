/************************************************************************
 * File Name:   Pierre_Lesson4.java
 * 
 * Due Date:    10/12/18
 * 
 * Author:      Fabuola Pierre
 * 
 * Program Description:  
 *              This program is designed to read and calculate a car loan amount including the annual interest rate and the term of car loan in year
 * 
 * Program Input:         
 *
 * Program Output:                   
 *
 * Program Processing:            
 *              
 * **********************************************************************/

import java.util.Scanner;

public class Pierre_Lesson4 {
    public static void main(String[] args) {
        
        //Declare variables
        int principal;       //amount of car loan
        double annualInterestRate;      //amount of yearly interest rate
        int term;           //length of car loan in years
        double monthlyPayment;      // amount of monthly rate
        int numMonth = 12;      //how many months in a year
        double totalLoan;       //total cost of the car loan
        double monthlyRate;

        
        //Create Scanner object
        Scanner input = new Scanner(System.in);
 
        //Prompt user for the loan amount
        System.out.println("Please enter a value for principal: ");
        
        //Read loan amount using the nextInt() method
        principal = input.nextInt();
    
        //Prompt user for the annual percentage rate
        System.out.println("Please enter a value for the annual interest rate: " );    
        
        //Read annual percentage rate using the nextDouble() method
        annualInterestRate = input.nextDouble();
        
        monthlyRate = annualInterestRate/1200;
        //Prompt user for the term of car loan (in years)
        System.out.println("Please enter a value for the term of car loan: " );    
        
        //Read the term of car loan (in years) using the nextInt() method
        term = input.nextInt();
        
        //Print application header
        System.out.println("******************************************************************************************** \n\t\t\t\tCar Loan Calculator\n********************************************************************************************");
        
        //Calculate the monthly payment (THIS STEP MAY REQUIRE SEVERAL STEPS!)
        monthlyPayment = (monthlyRate * principal) /(1 - Math.pow(1+ monthlyRate,(-term *numMonth)));
                    
        //Calculate the total cost of car loan 
        totalLoan = (term * numMonth) * monthlyPayment;
        
        //Display the output
        System.out.println("\nCar Loan Amount $" + principal);
        
        System.out.println("\nAnnual Percentage Rate (%): " + annualInterestRate);
       
        System.out.println("\nTerm of Car Loan (in years): " + term);
        
        System.out.println("*********************************************************************************************");
        System.out.println("\t\t\tMonthly Cost:");
        
       System.out.printf("Loan Amount \t\t\t\t$" + principal);

        System.out.println("\nInterest rate(%): \t\t\t " + annualInterestRate);
        
        System.out.printf("Loan period (months): \t\t\t" + (term * numMonth));
        
        System.out.printf("\nMonthly payment \t\t\t %.2f$", monthlyPayment);
        
        System.out.printf("\nTotal Cost of Car Loan: \t\t %.2f$", totalLoan);
        
    }//end of main

}//end of class
