//import Scanner class
import java.util.Scanner;

public class StringExample1 {
    
        public static void main(String[] args) {
        
        //declare objects of type string
        String city1 = "Thomasville";
        String city2 =  "Tallahassee";
        String city3 = "tallahassee";
        String city4 = "Jacksonville";
        
        //print the length of city4
        
        System.out.println("City4 length: " + city4.length() );
        
        //compare city2 to city3 to see if they're equal
        if( city2.equals(city3) ){
            System.out.println("City2 is eqivalent to City3!");
        }else{
            System.out.println("City2 is not equivalent to City3!");
        }
        
        //compare city2 to city3 to determine if equivalent not considering the case
        if( city2.equals(city3) ){
            System.out.println("City2 is not eqivalent to City3!");
        }else{
            System.out.println("City2 is equivalent to City3!");
        }
        
        //Print city4 in all caps
        System.out.println("City4 in caps: " + city4.toUpperCase() );
        

                
        }//end of main
        
}//end of class