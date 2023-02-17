package MyLessons;

import java.util.Scanner;

/** NESTED LOOPS - A LOOP INSIDE OF A LOOP*/

public class NestedLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows; // takes in numbers(int) of rows
        int columns;// takes in number(int) of columns
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns");
        columns = scanner.nextInt();
        System.out.println("Enter symbol you would like to use (): ");
        symbol = scanner.next();// .next()  will wait for your answer



        //NESTED LOOPS START HERE <----------------
        //OUTER LOOP, IN CHARGE OF THE ROWS

        for(int i = 1; i <= rows; i++){
            System.out.println();// moves down to the next line

            for(int j = 1; j <= columns; j++){ // i must be diffrent this time. We use j instead
                System.out.print(symbol);
            }


            /* Returns in console whatever symbol u type
            in that many rows and that many columns



            EX: 3 row , 3 columns, symbol = $

            returns-
            $$$
            $$$
            $$$

             */
        }

    }

}
