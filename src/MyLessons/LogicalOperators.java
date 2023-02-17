package MyLessons;
import java.util.Scanner;



public class LogicalOperators {

    /* Logical Operators-used to connect two or more expressions

    && - (AND) BOTH conditions must be TRUE
    || - (OR) EITHER condition must be TRUE
    ! - (NOT)- reverses the boolean value of condition

     */
    public static void main(String[] args) {

     /**USING AND*/

    int temp = 84; // the variable that you are plugging in

    if(temp > 100){
        System.out.println("It is hot outside");
    }
    else if(temp >= 80 && temp <= 85) { // both need to be true in order to run the next code
        System.out.println("It is Warm outside");
    }else {
        System.out.println("It is Cold outside");
    }


/**Using OR */
    int num = 68;

    if(num == 67 || num == 68){
        System.out.println("Your number is : " +num+ ", you matched my number");
    }else{
        System.out.println("Sorry no match");
    }

    int x = 97;

    if(x != 97){
        System.out.println("Wrong!");
    } else {
        System.out.println("Congrats, your number matched");
    }



    /** using ! to play a game with userResponse */

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game!, Press q or Q to quit");
        String response = scanner.next();// .next(); - will wait for response/ .nextLine()- will end program if you press enter twice

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("Your still playing the game !! PEW PEW!");
        }else{
            System.out.println("You Quit the game");
        }


        }

    }