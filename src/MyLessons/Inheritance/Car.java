package MyLessons.Inheritance;

/** will inherit from vehicle class*/

public class Car extends Vehicle{
int numberOfWheels = 4;
int doors = 4;


    public static void main(String[] args) {
        Car car = new Car();

        car.go();// returns vehicle is moving


        Bicycle bike = new Bicycle();

        bike.stop();// returns Vehicle has stopped


        // gets speed of car. returns 0.0
        System.out.println(car.speed);


        // list the number of doors
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }

}
