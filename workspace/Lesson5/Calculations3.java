//import Scanner class
import java.util.Scanner;

public class Calculations3 {
    
        public static void main(String[] args) {

        //declare variables
        String month;
        int day;
        int year;
        
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter month of birth
        System.out.print("\nPlease enter the month you were born in as a STRING.\nExample: January, June, April, etc.: ");
        
        //read month
        month = input.next();
        
        //prompt user to enter day of birth
        System.out.print("\nPlease enter the day you were born: ");
        
        //read day
        day = input.nextInt();

        //prompt user to enter year of birth
        System.out.print("\nPlease enter the 4-digit year you were born: ");
        
        //read year
        year = input.nextInt();
        
        System.out.println("\nThank you!");  
        
       //process the variable month
        
        switch(month){
            case "January": 
            System.out.print("\nYou have the following birthday: 1/" + day + "/" + year); break;
                    
            case "February": 
            System.out.print("\nYou have the following birthday: 2/"  + day + "/" + year);  break;
                    
            case "March": 
            System.out.print("\nYou have the following birthday: 3/" + day + "/" +year);  break;
                    
            case "April": 
            System.out.println("\nYou have the following birthday: 4/" + day + "/" + year); break;
            
            case "May": 
            System.out.println("\nYou have the following birthday: 5/" + day + "/"+ year); break;
            
            case "June": 
            System.out.println("\nYou have the following birthday: 6/" + day + "/" + year); break;
            
            case "July": 
            System.out.println("\nYou have the following birthday: 7/" + day +  "/" + year); break;
            
            case "August": 
            System.out.println("\nYou have the following birthday: 8/" + day + "/" + year); break;
            
            case "September": 
            System.out.println("\nYou have the following birthday: 9/" + day +  "/" + year); break;
            
            case "October": 
            System.out.println("\nYou have the following birthday: 10/" + day +  "/" + year); break;
        
            case "November": 
            System.out.println("\nYou have the following birthday: 11/" + day +  "/" + year); break;
            
            case "December": 
            System.out.println("\nYou have the following birthday: 12/" + day +  "/" + year); break;
            
        }        
            
        }//end of main
        
}//end of class