package MyLessons.Exceptions;

import oop.Arithmetic;
import java.util.InputMismatchException;

import java.util.Scanner;

/** Exceptions = an event that occurs during the execution of a program that,
*               - DISRUPTS the normal flow of instructions
 *
 *               try block- runs through original code
 *
 *               catch block- catches any exceptions(like dividing by zero) and gives you option what to do
 *
 *               finally block- will execute even if there is no exception
*/

public class ExceptionsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { // try's the code
            System.out.println("Enter a WHOLE number to divide: ");
            int x = scanner.nextInt();// stores the users number input

            System.out.println("Enter a Whole number to divide by: ");
            int y = scanner.nextInt();// stores users next Int input

            int z = x / y; // divides our two inputs and souts answer to console;

            System.out.println(z + " is your answer");

        }
        catch(ArithmeticException e){ // catches and displays message if you divide by ZERO
            System.out.println("You cant divide by zero! Idiot!");

        }
        catch(InputMismatchException e){// Cathces and displays message if a word is typed instead of a number
            System.out.println("I Said enter a whole NUMBER ! Not a word!!");

        }
        catch(Exception e){// catches All Exceptions BUT is considered lazy amongst coders!!!!(use when its a last choice)
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This will Always print");
            scanner.close();// used in finally block to close scanner


        }
    }
}
