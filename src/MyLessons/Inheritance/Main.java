package MyLessons.Inheritance;

/** Inheritance - the Process where one class acquires another,
 * also the attributes and/or methods of another*/

/** extends keyword- gives abilty to inherit from anotrher class*/


public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.go();// returns vehicle is moving
        car.stop();

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();// returns Vehicle has stopped


        // gets speed of car. returns 0.0
        System.out.println(car.speed);


        // list the number of doors
        System.out.println(car.doors);// doors is unique to Car class, because it was listed ONLY in Car Class
        System.out.println(bike.pedals);// Pedals is unique to bicycle class because it was listed only in Bicycle class
    }
}
