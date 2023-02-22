package MyLessons;


import java.util.ArrayList;
import java.util.Collections;


/**
 * ArrayList = a resizable array
 */

//Elements can be ADDED or REMOVED after compilation phase
// stores reference data types


public class ArrayListAndCollections {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        //add onto names arraylist

        names.add("Mike");
        names.add("Alex");
        names.add("John");
        names.add("Roman");
        names.add("James");


        /** Declare Collections to use util(Returns Names in alphabetical order )*/
        Collections.sort(names);//
        System.out.println(names);// first sout <-------------


        //change an element
        names.set(0, "Sushi");// changes Alex to Sushi (index, New String)

        //remove an element
        names.remove(2);// removes John from list

        //Clear array list
//        food.clear();// EMPTYS OUT WHOLE ARRAY LIST
        //make an array list named 'names'

        // .size returns the number of elements in an ArrayList
        System.out.println(names.size());// returns 4 (second sout in console) <------------------

        // .get returns the element at the specified index

        System.out.println(names.get(3));// returns roman

        //.indexOf returns the first found index of a given item, OR -1 if not found

        System.out.println(names.indexOf("Mike"));// returns 2

        //.contains check if a collection contains a given element
        System.out.println(names.contains(2)); //returns false









        // reordering List

        /** ARRAY LIST USED .size, not .length IMPORTANT <-------*/

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }/* returns
                Sushi
                Pizza
                Wings
        */




    }

}
