
import java.util.Scanner;
import java.lang.Math;


public class MethodExercises {

    /** Methods Exercises */


    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.
    //
    //Food for thought: What happens if we try to divide by zero? What should happen?


    //  BASIC ARITHMETIC

    //todo Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    //Subtraction
    //Multiplication
    //Division

    /** Addition */

//     public static int add(int num1, num2){
//            return num1 + num2;
//        }
//

    /** SUBTRACTION */

//        public static int subtract(int num1, num2){
//            return num1 - num2;
//        }


    /** MULTIPLY*/

//        public static int multiply(int num1, num2){
//            return num1 * num2;
//        }

    /** DIVISION */
//        public static int divide(int num1, num2){
//            return num1 / num2;
//        }

    class ArithmeticOperators {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;

            System.out.println("The sum of the two numbers is: " + sum);
            System.out.println("The difference of the two numbers is: " + difference);
            System.out.println("The product of the two numbers is: " + product);
            System.out.println("The quotient of the two numbers is: " + quotient);
        }
    }


    /**
     * Overload mini-exercises
     */

// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"
    public static void sayName(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
        sayName("Hello", " Mr. Cevallos");

    }


// todo Bonus

    //Create your multiplication method without the * operator (Hint: a loop might be helpful).


    //Do the above with recursion.


    //Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.


    //The method signature should look like this:
//    public static int getInteger(int min, int max) {
//
//    }
//

// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static double add(double num1, double num2) {
//        return num1 + num2;
//    }


    //todo 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    //- The method signature should look like this:
    //- public static int getInteger(int min, int max);


    //and is used like this:

    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);
    //If the input is invalid, prompt the user again.

    //Hint: recursion might be helpful here!


//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        if (input >= max || input <= min) {
//            System.out.printf("Invalid Number! Enter a number between %s to %s: ", min, max);
//            return getInteger();
//        }
//        System.out.printf("You entered %s!", input);
//        return input;
//    }

    //todo 3. Calculate the factorial of a number.

//            -Prompt the user to enter an integer from 1 to 10.
//           - Display the factorial of the number entered by the user.
//            -Ask if the user wants to continue.
//            -Use a for loop to calculate the factorial.
//             -Assume that the user will enter an integer, but verify it’s between 1 and 10.
//            -Use the long type to store the factorial.
//            -Continue only if the user agrees to.
//            -A factorial is a number multiplied by each of the numbers before it.
//             -Factorials are denoted by the exclamation point (n!). Ex:

//    public static long factorial() {
//        int num = getInteger(1, 10);
//        boolean run = true;
//        while (true) {
//            long total = 1;
//            for (int i = 1; i <= num; i++) {
//                total *= i;
//            }
//            return total;
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Would you like to continue? Enter Y or N: ");
//            String confirm = scanner.nextLine();
//            if (confirm.equalsIgnoreCase("Y")) {
//                continue;
//            } else {
//                break;
//            }
//        }
//
//        if (num < 1) return 1;
//        return num * factorial(num - 1);
//
//    }

    //todo Create an application that simulates dice rolling.

    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static int rollDice(int sides) {
        int die1 = (int) (Math.random() * sides);
        int die2 = (int) (Math.random() * sides);
        int total = die1 + die2;
        System.out.printf("First number is %s and your Second number is %s.The total is %s.", die1, die2, total);
        return total;
//        rollDice(6);

    }


    public static void main(String[] args){

        System.out.println("Shoot the dice!");
        rollDice(6);
    }

    }

