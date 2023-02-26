package MyLessons.Encapsulation;

/** GETTERS AND SETTERS */

/** Encapsulation - attributes of a class will be Hidden or Private
 *                  can be accessed only through special methods(Getters & Setters)
 *                  You Should make attributes private if you don't have a reason to make them public
 * */




public class EncapsulationMain {

    public static void main(String[] args) {


        /** this will work without Getters and Setters */
        Cars car1 = new Cars("Chevy", "Silverado", 2017);


        /** But trying to access a variable( like make) by itself will not without getters and setters */
            /** make is not visible below because it is private */

//        System.out.println(car.make);

        /** WITH GETTER METHOD IN CARS CLASS (NOW IT WORKS!!)*/

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        /** Without Setter Method */
        /** DOES NOT WORK because  car.year in invisible to this class */
//        car1.year = 2022;


        System.out.println();


        /** SETTER Method - allows us to change the variable*/
        car1.setYear(2022);// changes year of car to 2022
        System.out.println(car1.getYear());// souts new car year


        car1.setMake("Jeep");
        System.out.println(car1.getMake());


    }
}
