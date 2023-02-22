package MyLessons;

/** Arrays are used to store multiple values in a variable*/

public class Arrays {

    public static void main(String[] args) {

        String[] cars = {"Camaro", "Silverado", "Impala", "Equinox", "Tahoe"}; // When making an array you must put [] after name type, all name go in curly brackets

        // access first item in array (Camaro)
        System.out.println(cars[0]);


        //re-assign first item
        cars[0] = "Suburban";
        System.out.println(cars[0]);

        System.out.println();// blank space

        /** Print out all names  inside cars array (with new re-assigned value)*/

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }


//    public static Object asList(int i, int i1, int i2) {
//
//    }
}
