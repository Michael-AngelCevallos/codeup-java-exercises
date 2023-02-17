
//todo Create a package inside of src named util.
package util;
import java.util.Scanner;




// todo Inside of util, create a class named Input that has a private field named scanner.
public class Input {

    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //todo  // When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.

    public String getString() {
        return scanner.nextLine();
    }


    //todo The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

    public boolean yesNo() {
        String input = scanner.next();
        return (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }


    //todo The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid Input; please enter an integer!");
            scanner.nextLine();
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Out of range . Please enter a number between " + min + " and " + max + ".");
            return getInt(min, max);
        }

    }
    //todo The getDouble method should do the same thing, but with decimal numbers.

    public double getDouble() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid Input; please enter an integer!");
            scanner.nextLine();
            return getDouble();
        }

    }

    public double getDouble(double min, double max) {
        double userInt = getDouble();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Out of range.Please enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }
}
