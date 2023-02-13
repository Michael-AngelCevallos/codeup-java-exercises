
import java.util.Scanner;

    public class ControlFlowExercises {
        public static void main(String[] args) {


            int num = 100;

            /**WHILE LOOP*/

            //while loop that runs as long as i <= 15 and increment i by one
            while (num <= 15) {
                System.out.println("i is " + num);
                num++;
            }


            /**DO WHILE LOOP*/


            /**count by 2's stating with 0 and ending at 100. Follow each num with a new line*/

//        int i = 0;
//        do {
//            i = i + 2;
//            System.out.println("i is: " + i);
//        }while (i <= 100);


            /** count backwards by 5's starting from 100 to -10 */

//                int i = 100;
//        do {
//            i = i - 5;
//            System.out.println("i is now: " + i);
//        }while (i >= -10);


            /**create a do-while loop that starts at 2 and displays the number squared on each line*/
            //while new number is less than 1,000,000
//             long i = 2L;
//            do {
//
//              System.out.println(i);
//                i *= i;
//            }while (i < 1_000_000L);

            /** do a for loop now */

//        for (double y = 2; i <= 1000000; i++){
//            if (i <= 1000000){
//                Double xy = (Double) Math.sqrt(i);
//                System.out.println("i is: " + xy);
//            }
//        }
            //fizzbuzz prints the numbers from 1-100
            //multiples of three print fizz/ five = buzz/ both = fizzbuzz

            for (int x = 1; x <= 100; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (x % 3 == 0) {
                    System.out.println("Fizz");
                } else if (x % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(x);
                }
            }
            //display a table of powers prompt the user to enter an integer


            //int and .nextInt will return it as a number (display table from 1 - value entered)
            System.out.println();

            Scanner sc = new Scanner(System.in);
            String choice = "y";

            do {
                /** Get input from the user*/

                //ask user to enter a number
                System.out.print("Enter an integer: ");
                int integer = sc.nextInt();

                /** Create a header */

                String header = "Number  " + "Squared " + "Cubed   " + "\n"
                        + "======  " + "======= " + "=====   ";
                System.out.println(header);

                int square = 0;
                int cube = 0;

                String row = "";
                for (int x = 1; x <= integer; x++) {

                    square = x * x;
                    cube = x * x * x;

                    row = x + "       |" + square + "      |" + cube;
                    System.out.println(row);
                }

                // See if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();

            }
            while (!choice.equalsIgnoreCase("n"));

            /**CONVERT NUMBER GRADES INTO LETTER GRADES (FROM 0-100)*/

            System.out.println("Would you like to look at your letter grades?");
            String confirm = sc.next();

            while (confirm.equalsIgnoreCase("YES")) {
                System.out.println("What was your numeric grade?");
                int grade = sc.nextInt();

                char letterGrade;
                if (grade > 100) {
                    System.out.println("WOW!! You got an A++ ");
                    continue;
                } else if (grade >= 90) {
                    letterGrade = 'A';
                    System.out.printf(" Amazing , you got a %c.%n", letterGrade);
                } else if (grade >= 80) {
                    letterGrade = 'B';
                    System.out.printf(" Good Job, you got a %c.%n", letterGrade);
                } else if (grade >= 70) {
                    letterGrade = 'C';
                    System.out.printf(" Do better, you got a %c.%n", letterGrade);
                } else if (grade >= 60) {
                    letterGrade = 'D';
                    System.out.printf(" Now your not even trying, you got a %c.%n", letterGrade);
                } else {
                    letterGrade = 'F';
                    System.out.printf("No Good, Kill yourself, you got a %c.%n", letterGrade);
                }


                System.out.println();// adds space between lastoutcome and  new question
                System.out.println("Would you like to look at another grade?");
                confirm = sc.next();
            }


        }
    }


