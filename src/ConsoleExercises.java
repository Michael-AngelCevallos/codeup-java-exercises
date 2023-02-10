
import java.util.Arrays;
import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        //.2f moves it 2 decimal places (you need the format)
        System.out.format("The value of pi is approximatley %.2f %n", pi);


        //sets up Scanner
        Scanner scanner = new Scanner(System.in);


        //ask user to enter a number

        System.out.print("Enter a number: ");

        /**int and .nextInt will return it as a number*/

        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        //reset the scanner
        scanner.nextLine();


    }
}
