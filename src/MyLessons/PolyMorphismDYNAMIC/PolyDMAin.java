package MyLessons.PolyMorphismDYNAMIC;

import java.util.Scanner;

/** Dynamic PolyMorphism - Many shapes and/or Forms
 *                          Dynamic - after compilation (during run time)
 *
 *
 * ex. a Corvette is a: corvette, and a car, and a vehicle , and a object
 */



public class PolyDMAin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Starts the scanner

        Animal animal;// Stores Animal Choices, letting the Cat or Dog class be a selection NEEDS TO BE HERE TO WORK
//
        System.out.println("What Animal Do you Want??");
        System.out.println("1 = Dog, OR 2= Cat");
        int choice = scanner.nextInt(); //  Grabs the users input (1 or 2)


        if(choice == 1){
            animal = new Dog();// lets the Dog speak on the next line
            animal.speak();// displays message for speak (dog)
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That was an invalid Animal");
            animal.speak();
        }

    }
}
