package MyLessons;

/** toString() method - a special method that all objects inherit.
 *                      returns a string that "textually" represents an object
 *                      can be used both implicitly and explicitly
 */



public class toStringMethod {

    public static void main(String[] args) {

        //first create instance of CarClassForOOPLesson Class(pulls info on car from CarClassForOOPLesson)
        CarClassForOOPLesson car = new CarClassForOOPLesson();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);



        /** Use toString Method */

        System.out.println(car);// returns Address - MyLessons.CarClassForOOPLesson@28a418fc -



        System.out.println();

        System.out.println(car.toString()); // returns same as above, calls upon car implicilty(behind the scenes)

        /** Go to CarClassforOOPLesson class to see the toString*/




    }


}
