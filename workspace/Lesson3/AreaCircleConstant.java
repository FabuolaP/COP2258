//Purpose of program: Calculate the area of a circle using a Constant Variable

public class AreaCircleConstant {
    
        public static void main(String[] args) {
            
            
            //declare and initialize variables
            double radius;
            double area;
            
            radius = 2.369;
            
            //declare and initialize the constant variable
            final double PI = 3.14159;
            
            //calculate the area of the circle
            //area equals radius times radius times PI
            area = radius * radius * PI ;
            
            //display the area of the circle
            System.out.println("The area of the circle is: " + area );


                
        }//end of main
        
}//end of class