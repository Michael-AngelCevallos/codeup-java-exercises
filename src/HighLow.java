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

    public static String getGuessMessage(int outcome) {
        String output;
        if (outcome == 0) {
            output = "GOOD GUESS!";
        } else if (outcome == 1) {
            output = "LOWER";
        } else {
            output = "HIGHER";
        }
        return output;
    }

    public static int processGuess(int answer, int guess) {
        if (guess == answer) {
            return 0;
        }
        return (guess < answer) ? -1 : 1;
    }

    public static void runGame() {
        System.out.println("Welcome to the High Low Game!");
        int answer = getRandInt(1, 100);
        int outcome;
        do {
            System.out.println("Please pick a number between 1 and 100");
            int guess = getInteger(1, 100);
            outcome = processGuess(answer, guess);
            System.out.println(getGuessMessage(outcome));
        } while (outcome != 0);
        System.out.println("Do you wish to play again?");
        if (sc.next().equals("y")) {
            runGame();
        }
        System.out.println("Have a nice day!");
    }

    // get valid int
    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input!");
            return getInteger();
        }
    }

    //    // get valid int in range
    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int userNum = getInteger();
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("Number out of range!");
            return getInteger(min, max);
        }
    }


}