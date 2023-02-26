package MyLessons.Polymorphism;


/** POLYMORPHISM - greek word for "'poly' = 'many'", "'morph' = 'form'"
 *                  THE ABILITY OF AN OBJECT TO IDENTIFY AS MORE THAN ONE TYPE
 *
 *                  -THINK OF IT AS BEING ABLE TO BE MORE THAN ONE DATA TYPE
 *
 *                  -LETS SAY WE ARE GOING TO HAVE A RACE, AND WE CAN HAVE ALL SORTS OF TYPES OF VEHICLES ( CAR, BIKE, BOAT)
 */

public class PolyMain {

    public static void main(String[] args) {

        Car car1 = new Car();

        Bicycle bike1 = new Bicycle();

        Boat boat1 = new Boat();

        /** Declaring object types (without polymorphism)*/

//        // This object can only hold a car (Car[])
//        Car[]racers = {car1, bike1, boat1 };
//
//        //this object will only hold a bike (Bicycle[])
//        Bicycle[]racers = {car1, bike1, boat1 };
//
//        //This object will only hold a boat (Boat[])
//        Boat []racers = {car1, bike1, boat1 };

        /** WE USE POLYMORPISM TO FIX THE OBJECT SO IT CAN TAKE ALL 3 */
        /** Since All classes extend to vehicle class we can declare the object type Vehicle ( ex. Vehicle[]) */

        Vehicle[] racers = {car1, bike1, boat1 };

       // create advanced for-loop that will iterate through all objects in array
        for (Vehicle x : racers){ // Vehicle = (data type),  x = (counter), racers = (name of array)
            x.go();// x represents if you are a vehicle use the go method
        }

    }
}
