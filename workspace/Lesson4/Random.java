//import Scanner class
import java.util.Scanner;

public class Random {
    
        public static void main(String[] args) {
            
        
        System.out.println("Random numbers from 0 < 1: " + Math.random() );
        
        //Generate random numbers from 0 to 9
        System.out.println("Random numbers from 0 < 1: " + 0 + (int)  ( Math.random() * 10) );        
                
        System.out.println("Random numbers from 100 < 200: " + (100 + (int)  ( Math.random() * 100)) );              
        }//end of main
        
}//end of class