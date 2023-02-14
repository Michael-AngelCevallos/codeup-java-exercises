import java.util.Random;
import java.util.Scanner;

// Exercise 5
public class HighLow {

    //The specs for the game are:

    //todo 1. Game picks a random number between 1 and 100.
    //todo 2. Prompts user to guess the number.
    //todo 3. All user inputs are validated.
    //todo 4. If user's guess is less than the number, it outputs "HIGHER".
    //todo 5. If user's guess is more than the number, it outputs "LOWER".
    //todo 6. If a user guesses the number, the game should declare "GOOD GUESS!"


    /**Hints*/
    //Use the random method of the java.lang.Math class to generate a random number.



    //Bonus

    //Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.


    public static Random rn = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runGame();
    }

    public static int getRandInt(int min, int max) {
        return rn.nextInt(max) + min;
    }

    // String method
    public static String getGuessMessage(int outcome) {
        String output;
        if (outcome == 0) {
            output = "Bout Time, YOU GOT IT!!!";
        } else if (outcome == 1) {
            output = "Pick a LOWER number!\n";
        } else {
            output = "Pick a HIGHER number!\n";
        }
        return output;
    }


    // Method takes your guess and compares it to your answer
    public static int processGuess(int answer, int guess) {
        if (guess == answer) {
            return 0;
        }
        return (guess < answer) ? -1 : 1;
    }


    // runs the game( all methods together)
    public static void runGame() {
        System.out.println("Hello, Welcome to Higher or Lower!!!");
        int answer = getRandInt(1, 100);
        int outcome;
        do {
            int guess = getInteger(1, 100);
            outcome = processGuess(answer, guess);
            System.out.println(getGuessMessage(outcome));
        } while (outcome != 0);
        System.out.println("Wanna play Again, Y/N?");
        if (sc.next().equalsIgnoreCase("y")) {
            runGame();
        }

        System.out.println("Fine, leave then!");
    }

    // get valid int
    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid Input");
            return getInteger();
        }
    }

    //    // get valid int in range
    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int userNum = getInteger();
        if (userNum >= min && userNum <= max) {
            return userNum ;
        } else {
            System.out.println("Whooooaa, too High, I said 1-100, try again !");
            return getInteger(min, max);
        }
    }


}