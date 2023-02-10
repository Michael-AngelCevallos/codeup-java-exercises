public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");

        //System.out.println is used to output information to the console with a newline.

        //System.out.print can be used to output information WITHOUT a newline.






        /** EXERCISE 2 START WITH NOTES */

        /** IMPORTANT Every line needs to end with --->>> ; <<--- to run properly*/

        System.out.println("Hello World");// Strings inside parenthesis need to have Quotations,  not single quotations
        System.out.println("Hello Zenith");


        System.out.println(3 + 8);
        System.out.println(200 - 54);

        System.out.println(3 + "5");// OUTPUT 35


        System.out.println('c');// ONLY single can have characters can have single quotes

        /**shortcut for System.out.println() is -->>>> type sout and press tab */

        //code written inside braces needs to be indented( or start of with space) example { x = 10; }


        /** !!!! ALL variables Must be called BEFORE they are used */
/** CALL A VARIABLE */

        int four = 4;
        System.out.println(four);// <<<---- how to call a variable

/** CONSTANTS in java are ------>>>> identified by the word ---->>>> final */

        final int SIDES_OF_A_DICE = 6;
        // final String API_KEY = "b75b703d8195f6f433ca";
        // final String GITHUB_API_BASE_URL = "https://api.github.com";
        System.out.println(SIDES_OF_A_DICE);

        /** Arithmetic and Assignment Operators*/

//     int myNumber = 12 + 12 * 2;// 36
//
//
//     //this adds to last
//     myNumber += 9;// same as saying 36(from above) + 9
//    // equivalent to
//       // myNumber = myNumber + 9;// same as saying 36(from above) + 9
//
//     System.out.println(myNumber);// output 45


        /** CASTING-- 2 TYPES IMPLICIT AND EXPLICIT */
        //Casting is coercing a value of one type into another.
        // There are --->>>> TWO <<<--- types of casting, IMPLICIT casting and EXPLICIT casting.

        /**IMPLICIT */
        //Implicit casting usually involves assigning a value of a LESS precise data type to a variable whose types is of a HIGHER precision,
        // OR going from a more specific to a less specific type. In this case, we won't have to write any additional code, the cast will
        // take place --->>> implicitly.

        int myInteger = 900;
        long morePrecise = myInteger;
        System.out.println(morePrecise);// WOULD NOT RUN UNLESS --->>>LONG<<<--  VARIABLE WAS CALLED, BECAUSE INT CANNOT HOLD 900


        //In the example above we assigned a value of type INT to a variable of type LONG, which can HOLD A LARGER range of values than
        // int can. This is also called a ---->>>>WIDENING CONVERSION.


        /**Explicit*/
        // EXPLICIT casting involves GOING FROM A LESS specific type TO A MORE specific type,OR going from a higher precision type to a lower
        // precision type. If we want an explicit cast to happen, we'll need to, explicitly, put the name of type we are casting to inside
        // of parenthesis before the value to be cast.

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);// <<<---- how to call a variable

        //Here we are going from a DOUBLE, a type that contains information about DECIMAL places in a number, to an INT, a type that
        // does not. This is also called a narrowing conversion.





        /** STRING VARIABLE DECLARATION,, NEEDS TO START WITH -->> String <--- */




//        TODO 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
          int myFavoriteNumber = 13;
            System.out.println(myFavoriteNumber);
//
//        TODO 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//        String myString = " Yo";
//        System.out.println(myString);
//
//        TODO 3. Change your code to assign a character value to myString. What do you notice? - Crashes program
//
//        String myString = 'c';
//        System.out.println(myString);
//
//        TODO 4. Change your code to assign the value 3.14159 to myString. What happens?
//
//        //String myString = 3.14159;
//        //System.out.println(myString);// CRASHES JAVA STRING CAN NOT TAKE IN NUMBERS

//
//        TODO 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//        long myNumber ;
//        System.out.println(myNumber);// returns VARIABLE MY NUMBER might not have been initialized,  CRASHES JAVA
//
//        TODO 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//              long myNumber = 3.14;
//                System.out.println(myNumber);// returns POSSIBLE LOSSY CONVERSION FROM DOUBLE TO LONG ; crashes does not work

//        TODO 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        long myNumber = 123L;
//        System.out.println(myNumber);// prints out 123, not the L
////
//        TODO 8. Change your code to assign the value 123 to myNumber.
//            byte myNumber = 123;
//            System.out.println(myNumber);
//
//        TODO 9. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//              because int( or integer)
//        long a = 3.14;
//        System.out.println(a);

//        int t = 3.14;
//        System.out.println(t);
//
//        TODO 10. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//
//              float myNumber = 3.14;// DOESNT WORK, FLOAT NEEDS TO CONTAIN A LETTER EXAMPLE : 3.4E38;
//                System.out.println(myNumber);
//
//                    CHANGE FLOAT TO DOUBLE
                    double myNumber = 3.14;
                    System.out.println(myNumber);

//                    OR CHANGE THE NUMBER TO A VIABLE OPTIONS, FLOAT CAN TAKE IN NUMBERS 3.4E38 to 3.4E38
                        float myNum = 3.4F;
                        System.out.println(myNum);

//
//        TODO 11.Copy and paste the following code blocks one at a time and execute them

        //  int x = 5;
//  System.out.println(x++);
//  System.out.println(x);// output is 6


//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);// posted six twice



//        TODO 12. Try to create a variable named class. What happens?
              //  class // doesnt work

//todo Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);// VARIABLE THREE IS ALREADY DEFINED


//todo Rewrite the following expressions using the relevant shorthand assignment operators:

        System.out.println("yo");


        int x = 4;
        x = x + 5;
        System.out.println(x);// 9



//        int x = 3;
//        int y = 4;
//        y = y * x;



//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;


        //todo  What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?





    }


//    public class ConsoleExercises{
//        public static void main(String[] args) {
//
//            double pi = 3.14159;
//            System.out.println(pi);


        }

















