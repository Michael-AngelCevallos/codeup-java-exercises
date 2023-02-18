package MyLessons;

import java.util.function.DoubleFunction;

/** PrintF - An optional method to control, format, and display text to the console window.
 *  two arguments - format string + (object/variable/value)
 *  % [flags] [precision] [width] [conversion-character]
 */


public class PrintF {

    public static void main(String[] args) {


        boolean myBoolean = true;
        char myChar = 'c';
        String myString = "Mike";
        int myInt = 13;
        double myDouble = 3.14;
        double myDouble2 = 1000;



        System.out.printf("This is a format string", 123); // first is format string, second will be eithier (object, variable , or a value)
        System.out.println();
        System.out.printf("This number is equal too %d", 123);


        /** CONVERSION-CHARACTERS*/
        //display boolean value- %b
        System.out.printf("My boolean is equal to %b", myBoolean);

        System.out.println();

        //display char value - %c
        System.out.printf("My character is equal to %c", myChar);

        System.out.println();

        //display String value - %s
        System.out.printf("My string is equal to %s", myString);

        System.out.println();

        //Display int value - %d (d stands for decimal)
        System.out.printf("My int value is equal to %d", myInt);

        System.out.println();

        //Display double value - %f ( f stands for floating point values)
        System.out.printf("My double value is equal to %f", myDouble);

        System.out.println();

        /** WIDTH - MINIMUM NUMBER OF CHARACTERS TO BE WRITTEN AS OUTPUT */
        System.out.printf("Hello %10s", myString);// puts 10 characters in between the string/ returns "Hello       Mike         "

        System.out.println();

         /** Precision - sets number of digits of precision when outputting floating-point values */
        System.out.printf("You have this much money %.2f", myDouble);// will print out 2 spaces right of the decimal!!!!


        System.out.println();

        /** Flags - adds an effect to output based on the flag added to format specifier*/

        /** Original*/
        System.out.printf("You have this much money %f", myDouble);// returns 3.140000
        System.out.println();

        /** - :  Left justify*/
        System.out.printf("You have this much money %.1f", myDouble); // prints only 1 number to the right of a decimal - returns 3.1
        System.out.println();

        /** Justify right*/
        System.out.printf("You have this much money %20f", myDouble);//- returns "You have this much money              3.140000"
        System.out.println();

        /** + : output (+) or (-) sign for a numeric value*/
        System.out.printf("You have this much money %+f", myDouble);// return You have this much money +3.140000- adds plus sign to front
        System.out.println();

        /** , : comma grouping separators if number > 1000*/
        System.out.printf("You have this much money %,f", myDouble2);// adds comma to 1000 place - returns 1,000.000000;
        System.out.println();

        /**  0 : numeric values are zero padded(takes off everything after the decimal and returns*/
        System.out.printf("You have this much money %.0f", myDouble);// takes off everything from decimal and to the right -returns 3


    }
}
