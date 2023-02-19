package movies;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;

import static movies.MoviesArray.findAll;


public class MoviesApplication {
    public static Scanner scanner = new Scanner(System.in);

    static class Input {


        public String getString() {
            return scanner.nextLine();
        }

        public boolean yesNo() {
            System.out.println("Is this Right? Yes or No? Tell me:....");
            String input = getString();
            return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
        }
    }

    @Override
    public String toString() {
        return "MoviesArray{Movie}";
    }

    public static void main(String[] args) {
        //todo Give the user a list of options for viewing all the movies.movies or viewing movies.movies by category.

        System.out.println("Hello!, Welcome to Movies App, where we can give you info on movies!\n");

        System.out.println("What Would You Like to do?");
        System.out.println("Leave?...type 1 <------");
        System.out.println("View all of our Movie options?....Type 2 <------");
        System.out.println("Wanna see our Drama category?... Type 3 <------");
        System.out.println("Wanna see our  Horror category?....Type 4 <----");
        System.out.println("Wanna see our Animated horror category?.....Type 5 <-------");
        System.out.println("Wanna see our sci-fi category?......Type 6<--------");

////        Takes the users input and puts into scanner
//        Input movieInput = new Input();
//        int inputChoice = scanner.nextInt(); // Scans the next token of the input as an int.
//    }
//        public static void movie () {
//            boolean decision = true;
//            Movie[] movieArray = MoviesArray.findAll();
//            Input inputChoice = new Input();
//            while (decision) {
//            }
//            if (inputChoice == 2) {
//                System.out.println("Ok! Check out our List Of Movies!");
//                System.out.println(Arrays.toString(findAll()));
//            } else if (inputChoice == 3) {
//                System.out.println("Don't Cry! Here's all our Drama movies: ");
//            } else if (inputChoice == 4) {
//                System.out.println("Spooky!. Here's a List of our Horror Movies: ");
//            } else if (inputChoice == 5) {
//                if (movie.getCategory().equals("animated")) {
//                    System.out.println(movieArray.getName() + " --- " + movie.getCategory());
//                    System.out.println("\"To Infinity and Beyond\"! Here's all our Animated Movies: ");
//                } else if (inputChoice == 6) {
//                    System.out.println("Watch out for Aliens! Here's our Sci-fi Movies: ");
//                } else if (inputChoice == 0) {
//                    System.out.println("See you next time!");
//                } else {
//                    System.out.println("See you next time!!!");
//                }
//            }
//        }
//    }
//}

//        switch (choice) {
//            case (0):
//                System.out.println("Do you really want to quit?");
//                    input.clear();
//                boolean confirm = input.yesNo();
//                if (confirm) {
//                    System.out.println("Have a nice day....");
//                    decision = false;
//                }else{
//                    System.out.println("Restarting....");
//                }
//                break;
//            case(1):
//                for (Movie movie : movieArray){
//                    System.out.println(movie.getName() + " --- " + movie.getCategory());
//                }
//                break;
//            case(2):
//
//                }
//                break;
//            case(3):
//                for (Movie movie : movieArray){
//                    if(movie.getCategory().equals("drama")){
//                        System.out.println(movie.getName() + " --- " + movie.getCategory());
//                    }
//                }
//                break;
//            case(4):
//                for (Movie movie : movieArray){
//                    if(movie.getCategory().equals("horror")){
//                        System.out.println(movie.getName() + " --- " + movie.getCategory());
//                    }
//                }
//                break;
//            case(5):
//                for (Movie movie : movieArray){
//                    if(movie.getCategory().equals("scifi")){
//                        System.out.println(movie.getName() + " --- " + movie.getCategory());
//                    }
//                }
//                break;
//            default:
//                System.out.println("Please Wait..");
//                break;

    }
}