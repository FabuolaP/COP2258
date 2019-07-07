import java.util.Scanner; 

public class CGEapp {
  public static void main(String[] args) {
      
    //declare variables
    char letter = ' ';
    int confirm;
    
    // Create a Scanner
     Scanner userInput = new Scanner (System.in);
    
    //Enter program header  
    System.out.print("\t\t\t***************************************\n\t\t\t\t Welcome to the FSU CGE APP!\n\t\t\t***************************************");
      
    //Step 1:  Ask user to enter family name initial
    System.out.print("\nPlease enter your family name's initial: ");
    
     
    //Step 2:  Receive the letter from the keyboard
    letter = userInput.next().charAt(0);
    letter = Character.toUpperCase (letter);

    System.out.print("The initial you have entered is '" + letter);

    //Step 3: prompt user for confirmation
    System.out.print("', is that correct? Please enter 1 for yes, or 0 for no: ");
    
    //Step 4
    confirm = userInput.nextInt();
    

      if (confirm == 1) {
         if ((letter == 'A') || (letter== 'B') || (letter=='C')||(letter=='D')||(letter=='E'))
	      System.out.print("\nPlease wait while we process your request...\nYou have been assigned to Staff number 1, and your unique identifier number is: " + (int)Math.random()*((9999-1000)+1) + 1000);
      
      else if((letter == 'F')||(letter=='G')||(letter=='H')||(letter=='I')||(letter=='J')||(letter=='K')){
	      System.out.print("\nPlease wait while we process your request...\nYou have been assigned to Staff number 2, and your unique identifier number is: " + (int)Math.random()*((9999-1000)+1) + 1000);
      }
      else if((letter == 'L')||(letter=='M')||(letter=='N')||(letter=='O')||(letter=='P')){
	      System.out.print("\nPlease wait while we process your request...\nYou have been assigned to Staff number 3, and your unique identifier number is: " + (int)Math.random()*((9999-1000)+1) + 1000);
      }
      else if((letter == 'Q')||(letter=='R')||(letter=='S')||(letter=='T')||(letter=='U')){
	      System.out.print("\nPlease wait while we process your request...\nYou have been assigned to Staff number 4, and your unique identifier number is: " + (int)Math.random()*((9999-1000)+1) + 1000);  
      }
      else if((letter == 'V')||(letter=='W')||(letter=='X')||(letter=='Y')||(letter=='Z')){
	      System.out.print("\nPlease wait while we process your request...\nYou have been assigned to Staff number 5, and your unique identifier number is: " + (int)Math.random()*((9999-1000)+1) + 1000);          
      }
      }
      else{
        System.out.println("\nThe initial is not confirmed, please try again later!");
      }
      
      //Enter program header  
      System.out.print("\n\t\t\t***************************************\n\t\t\t\t Thanks for visiting FSU CGE!\n\t\t\t***************************************");

  }//end of main
}//end of class

