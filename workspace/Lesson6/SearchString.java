//import Scanner class
import java.util.Scanner;

public class SearchString {
    
        public static void main(String[] args) {
            //declare variables
            String fullName = "";
            int space; //represents the index of the first occurence of a space
            int secondSpace; //represents the index of the second occurence of a space
            String fname = "", lname = "", mname = "";
            
            //create a scanner object
            Scanner keyboard = new Scanner(System.in);
            
            //prompt the user for their full name
            System.out.print("Please enter your full name: ");
            
            //read their full name
            fullName = keyboard.nextLine();
            
            //1. Find the index of the first space
            space = fullName.indexOf(' ');
            
            //TESTING
            System.out.println("The index of the first space is: " + space);
            
            //2. Retrive the first name from the full name
            //using the substring(B,E) method
            //Example of using Chaining methods
            fname = fullName.substring(0 , space ).toUpperCase();
            
            //Test for fname
            System.out.println("First name is: " + fname);
            
            //3. Find the index of the last occurence of a space
            secondSpace = fullName.lastIndexOf(' ');
            
            //Test for second space
            System.out.println("The index of the second space is: " + secondSpace);
            
            //4.Retrieve the middle name from fullName
            mname = fullName.substring(space + 1, secondSpace);
            
            //Testing
            System.out.println("Middle name is: " + mname);
            
            //5. Retrieve the last name from fullName
            //using substring(B) method
            lname = fullName.substring( secondSpace + 1);
            
            //Test lname
            System.out.println("Last name is: " + lname);
            
                
        }//end of main
        
}//end of class


