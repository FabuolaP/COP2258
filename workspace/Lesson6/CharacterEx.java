//import Scanner class
import java.util.Scanner;

public class CharacterEx {
    
        public static void main(String[] args) {
            
        //declare variables 
        char value1 = '*'
        char value2 = 'c';
        char value3 = '5';
        
        //example of calling a static method
        System.out.println("Is it a digit?" + Character.isDigit( value1));
        System.out.println("Is it a letter?" + Character.isLetter( value2));
        
        //example of the isLowerCase static method
        System.out.println("Is it lowercase? " + Character.isLowerCase( value2));
        
        //example of the toUpperCase static method
        System.out.println("Value2 in uppercase " + Character.toUpperCase( 't'));

                
        }//end of main
        
}//end of class