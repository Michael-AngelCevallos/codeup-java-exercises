package MyLessons.AbstractClasses;

/** Abstract Classes - cannot be instantiated, but they can have subclass
 * abstract methods are declared without an implementation
 */



public class AbstractCLasses {

    public static void main(String[] args) {


        // WITHOUT abstract declaration you can create instances of both classes
//        Vehicle vehicle = new Vehicle();
//        Car car = new Car();

        // WITH abstract declaration you now can only instance the class that is NOT abstract
        Car car1 = new Car();

        // An example of why you want to this is : Think if You walked into a dealership and you wanted a specific Car, not a vehicle

    }
}
