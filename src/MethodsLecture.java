
import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {


        //Methods are a sequence of statements that perform a specific task. They are analogous to functions in JavaScript, and like JavaScript functions, they commonly accept input, and produce output.

        /**Defining Methods */

        //The most basic syntax for a method definition looks like this:

//    public static returnType methodName([param1[, param2[, ...]]) {


        // the statements of the method
        // a return statement, if a return type is declared
//    }


        //and here is an example of one:

//        public static String sayHello (String name){
//            return String.format("Hello, %s!", name);
//        }
        /** BREAK-DOWN OF ABOVE */
//Let's take a look at all the individual pieces of the method definition in the example above:
//
/** public -- this is the visibility modifier. */
//This defines whether or not other classes can see this method. For now, just put public here.


/**static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.*/
//For now, we will define all of our methods as static. We'll explore this concept in more detail in the next lesson.


/**String -- this is the return type of the method. */

//In Java, all methods must define the type of the value they will return. If a method does not return anything, the special keyword void is used here.


/**If a method defines a return type, it must have a return statement. It is a compile time error for a method that defines a return type to not return anything, or to return a value of a type other than the one that is specified. */


/**If a method's return type is void, it is a compile time error to return anything inside of the method; however, methods with a void return type can still use the return keyword to exit the method early.*/


/**sayHello -- the name of the method.*/


/** Method names follow the same rules as variable names.*/


/**(String name) -- the parameter the method accepts.*/

/**A method CAN BE DEFINED WITH NO PARAMETERS, ONE parameter (like in our example), or MULTIPLE parameters (separated by commas). A TYPE MUST be specified for each parameter.*/


/**Everything inside the curly braces is the body of the method.*/


//public static int returnTwo (){
//    return 2;
//    }
//
//    public static void printZenith(){
//        System.out.println("Zenith");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(returnTwo());
//        printZenith();
//    }
//
//
///**return output given in an input*/
//
//    public static int returnInt(int someInt){
//    return someInt;
//    }
//
//
//    /** return Sum of 2 integers */
//
//    public static int returnSomeOfInts(int intOne, int intTwo){
//    return returnInt(intOne) + returnTwo(intTwo);
//    }
//
//
//    /**return the name of a String 5 times*/
//
//    public static String repeatStr( String str, int times){
//    String original = str;
//    for(int i =1; i <= times; i += 1){
//        str += original;
//    }
//    return str;
//    }
//
//
//    public static void main (Strings[] args){
//    returnInt(7);
//    }
//
//    public static void sayHello(String greeting, String name) {
//        System.out.printf("%s, %s!\n", greeting, name);
//    }
//
//    public static int returnThree() {
//        return 3;
//    }
//
//    public static String shout(String s) {
//        return s.toUpperCase() + "!!!";
//    }

        /** Calling Methods*/


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
        sayName("Hello"," Mr. Cevallos");

    }





// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2){
        return  num1 + num2;
    }

}












