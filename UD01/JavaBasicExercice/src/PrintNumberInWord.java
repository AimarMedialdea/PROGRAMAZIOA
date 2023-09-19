/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println("uno");
      } else if (number == 2) {
         System.out.println("uno");
      } else if (number == 3) {
         System.out.println("uno");
         
      
    
      } else {
         
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println("uno"); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println("dos"); break;
         
         
         default: System.out.println("pon un numero valido"); 
      }
   }
}