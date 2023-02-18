package MyLessons;

//View Constructors Class after this one<-----------
//Connected to CarClassForOOP Class

/** OBJECTS- AN INSTANCE OF A CLASS THAT MAY CONTAIN ATTRIBUTES(CHARATERISTICS THAT THE OBJECT HAS) AND METHODS(DIFFRENT ACTIONS THAT THIS OBJECT CAN PERFORM)
 *
 *(EX OF OBJECTS: PHONE, DESK, COMPUTER, COFFEE CUP)
 *
 * OBJECTS USE CLASSES
 *
 * EX: ATTRIUBUTES OF OBJ COFFEE CUP- STRING COLOR = WHITE; DOUBLE TEMP = 20.0; BOOLEAN EMPTY = TRUE;
 *
 * EX OF OBJECT METHOD - drink() - when called - {System.out.print("Your drank the coffee)}
 * spill() - when called - {System.out.print("You spilled the coffee"}
 *
 * OOP (OBJECT ORIENTED PROGRAMING) -
 */


public class ObjectsAndOOP {

    public static void main(String[] args) {

        //Construct Car Object (**found in CarClassForOOPLesson Class in MyLesson Package)

        //Start with name of class - then an y name you want to call (myCar was used here)
        CarClassForOOPLesson myCar = new CarClassForOOPLesson();
        /** myCar NOW takes in all Attributes of CarClassForOOPLesson (make, model, year, price etc.)*/


        /**DISPLAY CHARACTERISTICS OF myCar*/

        System.out.println(myCar.make);// returns Chevy
        System.out.println(myCar.color);// returns Blue
        System.out.println(myCar.model);// returns Silverado
        System.out.println(myCar.year);
        System.out.println(myCar.price);


        /** Call Method from CarClassForOOPLesson */

        //First Call instance name used
        myCar.drive();// returns "You Drive the car"
        myCar.brake();//returns "You step on the brake"


        /**Create Another instance using same */

        CarClassForOOPLesson myCar2 = new CarClassForOOPLesson();

        System.out.println(myCar2.make);// prints the same Chevy because no constructor was made to set a difference

    }


}

