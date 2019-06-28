/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg420week5_analyzeassignment;

/**
 *
 * @author Ryan Cowger
 */
public class PRG420Week5_AnalyzeAssignment {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[])
    {
        int a, b, c;		// We define variables of type integer named a, b, and c. 
        try
        {			// We set up the try check block. We will be looking for an invalid value for integer c
            a = 0;		// Now we assign values to the variables. 
            b = 15;
            c = b / a;		// The result of dividing a number by 0 is undefined. Exception!
            System.out.println("This line will not be executed when a=0 because when a=0, the previous line throws an exception to the catch block.");
        }
        catch (ArithmeticException e)
        { // As soon as an exception is thrown in the "try" block, execution of this code begins.
            System.out.println("Catching this exception thrown by the try block: " + e);
        }
        System.out.println("Execution resumes here after both the try and catch blocks execute.");
    }
}