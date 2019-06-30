/** ********************************************************************
 *	Program:	 PRG420Week1_CodingAssignment
 * 	Purpose: 	 Week 1 Individual Assignment #2
 *	Programmer:	 Ryan Cowger
 *	Class:		 PRG/420
 *	Creation Date:	 05/03/2019
 *********************************************************************
 *
 **********************************************************************
 *	Program Summary: This program asks the user for a one-word name
 *                        and then displays a constructed greeting
 *                        that looks like this:
 *
 *                        Welcome, NAME!
 ********************************************************************* */
package prg420week1_codingassignment;

import java.util.Scanner;


/**
 *
 * @author Ryanc
 */
public class PRG420Week1_CodingAssignment {

    
    public static void main(String[] args) {
        // Create a usable instance of an input device    
        // LINE 1. INSTANTIATE AN INSTANCE OF SCANNER AND ASSIGN IT TO A VARIABLE OF TYPE SCANNER. 
        Scanner sc = new Scanner (System.in);
        
        // Prompt user for input
        // LINE 2. USE THE PRINT() METHOD TO PROMPT THE USER FOR HIS OR HER FIRST NAME.
        System.out.println("What is your First Name?");
        
        // Capture first word and assign it to A VARIABLE
        // LINE 3. USE THE NEXT() METHOD OF YOUR SCANNER INSTANCE TO ASSIGN A VALUE TO A STRING VARIABLE.
        String name = sc.next();
        // Construct the greeting 
        // LINE 4. USE THE PRINTLN() METHOD TO CONSTRUCT A CORRECTLY PUNCTUATED GREETING.
        System.out.println("Welcome! " +name);
        // Close the Scanner object
        // LINE 5. USE THE CLOSE() METHOD OF SCANNER CLASS
        // close the scanner
        System.out.println("closing scanner!");
        sc.close();
	System.out.println("Scanner closed!");
      
    }
    
}
