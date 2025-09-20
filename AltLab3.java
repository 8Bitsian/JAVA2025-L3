// Alternative Interview Question for Lab 3
import java.util.Scanner; // Import the Scanner class for user input

public class AltLab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create Scanner object for input
    
    //Section A: If Statement
    System.out.print("Number? ");            // Prompt the user for input
    int numIf = input.nextInt();             // Read an integer from user input
    if (numIf % 2 == 0)                      // If the remainder when divided by 2 is 0...
      System.out.println("Even");            // Then Output is "Even"
    else
      System.out.println("Odd");             // Else Output is "Odd"
    
    //Section B: Switch Statement
    System.out.print("Number? ");            // Prompt the user for input
    int numSwitch = input.nextInt();         // Read an integer from user input
    switch (numSwitch % 2)                   // Get remainder when divided by 2
      case 0: System.out.println("Even"); break;  // If remainder is 0, then output "Even"
      case 1:                                     // If remainder is +1, then output "Odd"
      case -1: System.out.println("Odd"); break;  // If remainder is -1, then output "Odd"
  }
}
