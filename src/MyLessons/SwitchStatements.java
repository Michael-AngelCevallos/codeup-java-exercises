package MyLessons;

/** SWITCH - STATEMENT THAT ALLOWS A VARIABLE TO BE TESTED FOR EQUALITY AGAINST A LIST OF VALUES
 *
 * IF YOUR USING A LOT OF "IF" STATEMENTS BACK TO BACK, YOU SHOULD YOU A SWITCH INSTEAD <<<<<---------------------------
 */

// UNLIKE IF-THE-ELSE STATEMENTS "SWITCH STATEMENTS CAN HAVE A NUMBER OF POSSIBLE PATHS
    //SWITCH STATEMENTS CAN TAKE IN BYTE, SHORT, CHAR, INT, ENUM, AND STRING TYPES


    /**Breaks - if you don't have breaks, it will post the sout's of all remaining cases after your case has been caught*/
    /**For Example if there were no breaks below, the console would sout every case after tuesday! <--------*/
public class SwitchStatements {

    public static void main(String[] args) {

        /** We are writing program to check to see if*/

        String day = "Tuesday";

        switch(day){     // <------- inside parenthesis you put what variable/type you would like to test
            case "Sunday" : System.out.println("It is Sunday!");// everything after the colon is what you would like to do if it isn't Friday
            break; // <----- Important, this breaks you out of code and moves you onto next case

            case "Monday" : System.out.println("It's Monday!");
            break;

            case "Tuesday" : System.out.println("It's Tuesday!");
            break;

            case "Wednesday" : System.out.println("It's Wednesday!");
            break;

            case "Thursday" : System.out.println("It's Thursday");
            break;

            case "Friday" : System.out.println("It's Friday!!!!");
                break;

            case "Saturday" : System.out.println("It's Saturday");
            break;

        }
    }
}
