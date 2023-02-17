package MyLessons;


import java.util.Scanner;

/** WHILE LOOP-EXECUTES BLOCK OF CODE AS LONG AS ITS CONDITIONS REMAIN TRUE*/

public class WhileAndDOLoop {

    public static void main(String[] args) {






//This keeps running non-stop because condition is always met
//        while(1 == 1){
//            System.out.println("Help!, I'm Stuck in a while loop");
//        }


        Scanner scanner = new Scanner(System.in);

        String name = "";// variable, we left it blank, but you can enter a name if you choose


        while(name.isBlank()){// if the user enters no name, it will continue to ask for name
            System.out.print("Enter your name: ");// .print--- will keep asking if you press enter/ .println --- will ask again but has delay
            name = scanner.nextLine(); //  stores the result of what we put
        }
        System.out.println("Hello!!...." +name);


        do{// DO loop will always perform block of code at least once, AND THEN checks condition after
            System.out.print("Enter your name: ");// .print--- will keep asking if you press enter/ .println --- will ask again but has delay
            name = scanner.nextLine(); //  stores the result of what we put
        } while(name.isBlank());

            System.out.println("Hello!!...." + name);


    }


}
