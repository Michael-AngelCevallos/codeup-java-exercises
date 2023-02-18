package MyLessons;


import java.util.ArrayList;

/** ArrayList = a resizable array */

//Elements can be ADDED or REMOVED after compilation phase
    // stores reference data types


public class arraylistlesson {

    public static void main(String[] args) {


        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");


        //change an element
        food.set(0,"Sushi");// changes Pizza to Sushi (index, New String)

        //remove an element
        food.remove(2);// removes Hot dog from list

        //Clear array list
        food.clear();// EMPTYS OUT WHOLE ARRAY LIST

        /** ARRAY LIST USED .size, not .length IMPORTANT <-------*/

        for( int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));


        }

    }

}
