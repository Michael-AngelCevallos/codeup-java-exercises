package ClassNotes.AbstractClasses;


/**Abstract Classes - a more general class meant to be extended by other more specific subclasses extending from an abstract class is a "type of".  */


/** Example -
 *
 * Sub-abstract classes
 *
 * abstract PublicBuildings(parent class/ super class)
 *
 * extends to:
 *      - class Library extends PublicBuildings
 *      - class FireHouse extends PublicBuildings
 *      - class CivicBuilding extends PublicBuildings
 *      - Class CourtHouse extends PublicBuildings
 *
 */




public class AbstractClass {




    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle() { // Cannot use because its been declared abstract
//            @Override
//            protected void turnOn() {
//
//            }



        Car car = new Car();
        car.turnOn();// returns Turn Key, your car is on!





    }

}
