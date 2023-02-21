package MyLessons.Interface;

/** Interface - a template that can be applied to a class
 * similar to inheritance, but specifies what a class has/must do.
 * Classes can apply more than one inheritance, inheritance can only apply one super class*/



public class MainInterface {

    public static void main(String[] args) {

        /** Rabbit Implements Prey Interface */
        Rabbit rabbit = new Rabbit();
        rabbit.flee();// calls and returns message from rabbit class


    /** Hawk Implements Predator Interface */
        Hawk hawk = new Hawk();
        hawk.hunt();


        /** Fish implements BOTH Interfa ces of Prey and Predator*/
        Fish fish = new Fish();

        fish.flee();
        fish.hunt();
    }
}
