package MyLessons.Encapsulation2;

public class Encap2Main {


    public static void main(String[] args) {

        Car car1 = new Car("Chevy", "Tahoe", 1996);
        Car car2 = new Car("Jeep", "Patriot", 2017);



        /** Copy (In order to use a COPY METHOd needs to be created in Car Class */
//        car2.copy(car1); // uncomment to change car 2 to car 1( with different addresses)

        /** do the same as copy above only during the initial instantiation*/
        Car car3 = new Car(car1);
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());






    }
}
