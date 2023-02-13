import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

        String string= "hello";
        System.out.println(string.charAt(2));

        String message ="Yo ";
        message = message + " sup";
//        message = message.concat ("sup");// Concat method
        System.out.println(message);

//Comparing strings

//        Scanner sc = new Scanner(System.in);
////        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

        //DONT DO THIS
//        boolean confirmation = userInput == "y";


        /** EQUALS Method with if statement
        //// DON'T DO THIS*/

        //if ("I am a string" == "I am a string") {
        //    System.out.println("Strings are equal");
        //}

        /** Do THIS */
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");

        }


        /**String Comparison Methods*/

//        METHOD	                                    DESCRIPTION

//  .equals	                    determine, case-sensitively, if two strings have the same value.
//  .equals                       IgnoreCase	determine if two strings have the same value, disregarding their casing.
//  .startsWith	                    determine, case-sensitively, if one string starts with another.
//  .endsWith	                            determine, case-sensitively, if one string ends with another.


        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup"); // false
        input.startsWith("Codeup"); // true

        input.endsWith("rocks"); // false
        input.endsWith("rocks!"); // false
        input.endsWith("Rocks!"); // true


        //STRING MANIPULATION METHOD

        //The following methods can be used to manipulate strings:


        //char charAt(int index)
        //Returns the character at the specified index of the string.
        ex:  System.out.println(input.charAt(3));// returns e


        /** int indexOf(String subString) */
        //Returns the index of the first occurrence of a certain substring.
        //Returns -1 if the substring is not found.
        System.out.println(input.indexOf('o'));// returns 1

        /** int lastIndexOf(String subString) */
        //Like indexOf, but starts the search from the end of the string.
        System.out.println(input.lastIndexOf('o'));// returns 8


        /** int length()*/
        //Returns the length of a string.
        System.out.println(input.length());// returns 13

        /** String replace(String pattern, String replacement) */
        //Returns a copy of the string that has pattern replaced with replacement.
        System.out.println(input.replace('e', 'o'));// returns Codoup Rocks


        /** String substring(int beginIndex[, int endIndex]) */
        //Returns a new substring that starts at a specified index and (optionally) ends at the specified index
//        System.out.println(input.substring());

        //We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive, and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.

        String text = "Hello world!";
        System.out.println("Original ---->" + text);

        System.out.println(text.substring(1));// returns ello world!

        System.out.println(text.substring(3));// returns lo world!




        // If "start" is less than 0, it will start from index 0:

  //      int result = text.substring(-3);
       // Only the first:
//
//        int result = text.substring(0, 1);
//        Only the last:
//
//        int result = text.substring(text.length - 1);


        /**String toLowerCase()*/
        //Returns a string that has all lower case letters.
        System.out.println(text.toLowerCase());// return hello world!


        /**String toUpperCase()*/
        //Returns a string that has all upper case letters.
        System.out.println(text.toUpperCase());// return hello world!


        /**String trim()*/

        //Returns a copy of the string without leading and trailing spaces of that string.

        String s1 ="  hello java string   ";
        System.out.println(s1.length());
        System.out.println(s1); //Without trim()
        String tr = s1.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim()



    }
}
