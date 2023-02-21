package MyLessons;
/** Used with Garage Class */



/**OBJECT PASSING - */

public class ObjectPassing {

    public static void main(String[] args) {


        //Make instances for Garage and CarClassForOOpLesson
        Garage garage = new Garage();

        Car car1 = new Car("Chevy");
        Car car2 = new Car("Jeep");

        // call it
        garage.park(car1);
        garage.park(car2);


    }
}
