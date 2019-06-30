/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg420week2_codingassignment;

/**
 *
 * @author Ryanc
 */
import java.util.Scanner;

public class PRG420Week2_CodingAssignment {

    public static void main(String[] args) {
               
        String userInputStringOfAngles;  // Declare a variable of type String to capture user input
        int numberOfAngles; // Declare a variable of type int to hold the converted user input

        Scanner myInputScannerInstance = new Scanner(System.in); // Recognize the keyboard
        System.out.print("Please type the integer 3, 4, or 5 and then press Enter: "); // Prompt the user
        userInputStringOfAngles= myInputScannerInstance.next(); // Capture user input as string
        numberOfAngles = Integer.parseInt(userInputStringOfAngles); // Convert the string to a number in case this will be useful later
        
        // LINE 1. CODE TO DETERMINE WHETHER USER INPUT IS OUT OF BOUNDS GOES HERE
        if(numberOfAngles > 5){ 
            System.out.println("The number is out of bounds");
        }else if (numberOfAngles < 3){
        System.out.println("The number is out of bounds");
        }
      
            
        // LINE 2. SWITCH CODE TO PRINT CORRECT "SHAPE" MESSAGE BASED ON USER INPUT GOES HERE
         
        switch (numberOfAngles ) {
            case 1:  userInputStringOfAngles  = "A triangle has 3 sides.";
                     break;
            case 2:   userInputStringOfAngles = "A rectangle has 4 sides.";
                     break;
            case 3:  userInputStringOfAngles = "A pentagon has 5 sides.";
        
        }
        myInputScannerInstance.close(); // Close the Scanner object
      }
    }
