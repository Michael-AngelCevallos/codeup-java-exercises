
//todo Create a package inside of src named util.
package util;
import java.util.Scanner;




// todo Inside of util, create a class named Input that has a private field named scanner.
public class Input {



    //todo  // When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
private final Scanner sc = new Scanner(System.in);



    public String getString(){
        return sc.nextLine();
    }


   //todo The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

    public boolean yesNo(){
        System.out.println("Is this Right? Yes or No? Tell me:....");
        String input = getString();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }


    //todo The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max) {
        //CONFIRMS USER INPUT IS A NUMBER
        int number = getInt();

        if (number < min) {
            return (getInt(min, max));
        } else if (number > max) {
            return (getInt(min, max));
        }return number;
    }

    int getInt(){
        System.out.println("Hey!....Give me a Number:");
        return Integer.parseInt(getString());
    }

    //todo The getDouble method should do the same thing, but with decimal numbers.
    double getDouble(double min, double max) {
        //Confirms Value in a number
        double number = getDouble();

        if (number < min) {
            return getDouble(min, max);
        } else if (number > max) {
            return getDouble(min, max);
        }
        return number;

    }
    double getDouble(){
        System.out.println("NOW!!...Give me another number, I will put a decimal on it:");
        return Integer.parseInt(getString());
    }



}


