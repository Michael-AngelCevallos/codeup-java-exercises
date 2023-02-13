
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


    }
}














