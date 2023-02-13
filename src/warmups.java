public class warmups {
    public static void main(String[] args) {

//        pair up!
//                Take turns asking and answering the following Java interview questions:
//        - How does Java run?
        /**  Java code is processed through a compiler, which translates it into bytecode that an operating system reads. Bytecode from Java is processed by a Java virtual machine, which verifies the code and provides a runtime environment for Java apps. */

//                - Why is Java known to be a language that you can “write once and run anywhere”?
        /**
         *Java is a compiled language that operates in the Java Virtual Machine (JVM). That makes Java portable code, meaning the same code can run on all computers regardless of the operating system or hardware.
         *
         */

//        - What is the difference between a byte and a short?

        /** 2 different types of Variables that can take in different amounts
         *
         * byte - -128 to 127
         *
         * short-
         */
//        - What is the difference between a reference and primative type in Java?

        /**
         * Primitive = building blocks native to java, exists inside java;
         *
         * Reference = stores in the memory and you can call back later, can be changed;
         *
         */
//                - Are strings primative or reference types?
        /**Reference
         **/
//                - What is the difference between explicit and implicit casting?
        /**
         * Casting types 2-
         *
         * Explicit - EXPLICIT casting involves GOING FROM A LESS specific type TO A MORE specific type,OR going from a higher precision type to a lower
         *         // precision type. If we want an explicit cast to happen, we'll need to, explicitly, put the name of type we are casting to inside
         *         // of parenthesis before the value to be cast.
         *         ex:double pi = 3.14159;
         *         int almostPi = (int) pi;
         *         System.out.println(almostPi);
         *
         *
         *
         * Implicit- /Implicit casting usually involves assigning a value of a LESS precise data type to a variable whose types is of a HIGHER precision,
         *         // OR going from a more specific to a less specific type. In this case, we won't have to write any additional code, the cast will
         *         // take place --->>> implicitly.
         *
         *         Ex:
         * int myInteger = 900;
         *         long morePrecise = myInteger;
         *         System.out.println(morePrecise);
         */
//        - How could you convert a numeric string into a number in Java?
        /**
         *Ex:
         *
         * int intVal = Integer.parseInt("1001");
         *
         *
         *
         *
         */

//       - How would you write a Java program that prints “Hello World”?
        /**
         *
         * first: start new Class, with whatever name you want,
         *
         * Second: type public static void main(String[] args) {
         *     third: System.out.println("Hello World")
         * }
         *
         */

//        - How do you define a constant in Java?
        /**final
         *
         */

//        - How do you compare if two string values are the same in Java?

        /** string.equalsTo()
         *
         */

//        - Why will the scanner seem to skip inputs when alternating between nextLine and the other scanner next*** methods?
/**
 *
 * hello   -->  next()
 *
 * "\n" - > nextLine()- accepts just newline character
 *
 */


//                - What does %d represent in a formatted string in Java?
        /**
         * Conversion-Characters:
         *
         * %d : decimal integer [byte, short, int, long]
         *
         * %f : floating-point number [float, double]
         *
         * %c : character Capital C will uppercase the letter
         *
         * %s : String Capital S will uppercase all the letters in the string
         *
         * %h : hashcode A hashcode is like an address. This is useful for printing a reference
         *
         * %n : newline Platform specific newline character- use %n instead of \n for greater compatibility
         */
//                - True or false: classes / methods outside of the java.lang package always need to be imported to use them.

        /**
         * True -
         *
         */














    }
}
