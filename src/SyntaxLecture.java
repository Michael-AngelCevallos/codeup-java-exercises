
        public class SyntaxLecture {


            public static void main(String[] args) {


                byte a; // -128 to 127
                a = 127;
                System.out.println(a);

                short b;// -32768 - 32767
                b = 32767;
                System.out.println(b);

                int c;
                c = 2147483647;
                System.out.println(c);

                long f;//9,223,372,036,854,775,807
                f = 1000000000;
                System.out.println(f);

                float x;
                x = 3.5F;
                System.out.println(x);// prints 3.5


                double y;
                y = 1.7E308;
                System.out.println(y);

                char z;
                z = 'c';
                System.out.println(z);

                boolean w;
                w = true;
                System.out.println(w);

//                DIFFERENT PRINT METHODS

                /**PRINTLN( … ) / PRINT( … )*/

//                The println("This is an example.") method prints: "This is an example." and MOVES CURSOR TO NEW LINE. In this case is the output a string, but the string could also be from the type int and double.


//
//                        The print("This is an example.") method instead prints just the string "This is an example.", DOES NOT MOVE CURSOR TO NEW LINE. In this case is the output a string, but the string could also be from the type int and double.


//

//                        println()/print is efficient for simply printing a line of text.
//
//                        If the line of text needs to be formatted (ex: alignment (left/right/etc..-justified) ), then printf would be used.

/**PRINTF(” … “)*/

// printf gives you the option to PRINT A VARIABLE IN A PIECE OF TEXT. For example:

                char letter = 'a';
                int number = 10;
                System.out.printf("Give the number we want is: %d", number);

                System.out.printf("the character that im thinking of is: %c", letter);

/** SPECIFIERS */

//                Specifier	                         Type

//                  %c	                           character
//                  %d	                            integer
//                  %f	                        floating-point number
//                  %s	                        a string of characters
//                  %%	                        print a percent sign
//                  %e	                       exponential floating-point number


 // ================== STATEMENTS (s-3)

                // Statements may be...
                // Declarations
//        int x;

                // Assignment expressions
//         x = 3;

                // Any use of ++ or --
//         x++;
//         --x;

                // Method invocations
//         Math.random();

                // Object creation expressions
//         SomeObject = new SomeObject();

                // ================== COMMENTS (s-4)

                // single line comment

        /*

            multi-line comment

         */

                /**
                 * Comment block
                 */

//        System.out.println("test");


                // ================== DATA TYPES (s-5, 6, 7)

//        int primitiveExample = 3;
//        System.out.println(primitiveExample);


//        Student referenceExample = new Student();

                // use the smallest type needed for the job

                // primitive types...

                byte age = -32;
                System.out.println(age);
                short minimumAnnualSalary = 15080;
                int distanceToSaturn = 1200000000;
                long numberOfHumanCells = 3000000000L; // L needed for compiler
                System.out.println(numberOfHumanCells);
                float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
                System.out.println(lengthOfBacteriaInInches);
                double widthOfAtomInMeters = .00000000001;
                char seatingSection = 'M'; // must wrap in single quotes
                boolean everythingIsAwesome = false;

                // strings (not a primitive type)

//         String thisIsAString = "Hello";


//          like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

//        System.out.println("Hello\nWorld"); // line break, prints hello world on two seperate lines


//        System.out.print("Hello");// Prints Hello World on one line
//        System.out.print("World");

//        System.out.println("He said \"Hi\"");// if you want to put quotations inside of a string, need backslashes
//
//        String hello = "Hello";
//        char someLetter = hello.charAt(0);
//        System.out.println(someLetter);


                // ================== VARIABLES (s-8)

                // declaration separate from initialization

//             int seven;
//             seven = 7;
//            System.out.println(seven);

                // declaration and initialization

//             int eight = 8;
//        System.out.println(eight);


                // ================== IDENTIFIERS AND KEYWORDS (s-9)

                // see curriculum


                // ================== CONSTANTS (s-10)

                // see curriculum

//        final int SIDES_OF_A_DICE = 6;


                // ================== EXPRESSIONS (s-11)

                // basically the same as JS


                // ================== OPERATORS (s-12)

                // basically the same as JS


                // ================== ASSIGNMENT STATEMENTS (s-13)

                // basically the same as JS


                // ================== CASTING (s-14)

                // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

                // IMPLICIT

//                short smallNum = 7;
//                int bigNum = smallNum;
//                System.out.println(bigNum);

            int bigNum = 129;
            byte smallNum = (byte) bigNum;
            System.out.println(smallNum);

                // EXPLICIT
//        int a = 2000001;
//        byte b = (byte) a;
//        System.out.println(a);
//        System.out.println(b);






                // implicit casting - less to more precise (widening)

//         float num1 = 2.22F;
//         double num2 = num1;


                // explicit casting - more to less explicit casting (narrowing)

//         double num3 = 3.1;
//         float num4 = (float) num3;
//         System.out.println(num4);



            }

        }





