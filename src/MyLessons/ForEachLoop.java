package MyLessons;

import java.util.ArrayList;

/** For-Each Loop (aka enhanced for loop) - traversing technique to iterate through elements in an array/collection.
 * fewer steps, and more readable
 * but less flexible
 */


public class ForEachLoop {
    public static void main(String[] args) {

        //create an Array of Animals
        String[] animals = {"Elephant", "Dog", "Lion", "Cat"};


        /**For-each loop to iterate through each animal */
        for(String i : animals){ // Inside parenth. First List data type used above, then list an index( here we use i). This line will iterate once for each animal in array
            System.out.println(i);
        }

        ArrayList<String> cars = new ArrayList<String>();


        cars.add("Chevy");
        cars.add("Dodge");
        cars.add("Jeep");
        cars.add("Ferrari");

        System.out.println(cars);// returns [Chevy, Dodge, Jeep, Ferrari] on one line


        for(String i : cars){
            System.out.println(i); // returns list on multiple lines
        }



    }

}
