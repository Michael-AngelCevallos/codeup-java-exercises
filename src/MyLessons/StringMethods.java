package MyLessons;

/** String - is a reference data type that can store one or more characters.
 * Reference Data Types - have access to useful Methods(Functions)
 */

public class StringMethods {

    public static void main(String[] args) {

        String name = "Mike"; // Gives the variable "name" a String data type
        String name2 = "    Alex    ";// used for trim method

        //.equals() - method compares two strings to see if they are equal;
      boolean result = name.equals("mike"); // this method will check to see if strings are equal when called upon
        System.out.println(result);

        // .length() - returns the length of your String, any spaces count as +1 for every space
        int length = name.length();
        System.out.println(length);// returns false because it is case sensetive. Mike was used above mike is used in method

        //.charAt() - Gives character at whatever index is specified in parenthesis ------ (3)
        char result2 = name.charAt(3);
        System.out.println(result2);


        // .indexOf() - returns index number of where specified letter is at
        int result3 = name.indexOf("M");
        System.out.println(result3);

        // .isEmpty() - checks to see if string is empty, returns true or false
        boolean result4 = name.isEmpty();
        System.out.println(result4);

        // .equalsIgnoreCase() -  returns true or false is String matches with varibale(name). will return true even if capitalizing is different
        boolean result5 = name.equalsIgnoreCase("mike");
        System.out.println(result5);

        // .toUpperCase() - changes all letters in a specified variable to uppercase
        String result6 = name.toUpperCase();
        System.out.println(result6);

        //.toLowerCase() - same as last but lowercase
        String result7 = name.toLowerCase();
        System.out.println(result7);

        //.trim() -  removes all empty space before and after a string
        System.out.println(name2); //  with spaces
        String result8 = name2.trim();
        System.out.println(result8);// without spaces, trim method implemented

        // .replace() - replaces a character within a string withwhatever you want
        String replaceChar = name.replace("e", "y");
        System.out.println(replaceChar);


        //There are many more b ut these are the most useful


    }
}
