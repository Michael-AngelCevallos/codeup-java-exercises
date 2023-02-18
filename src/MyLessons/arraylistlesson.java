package MyLessons;


import java.util.ArrayList;

/** ArrayList = a resizable array */

//Elements can be added or removed after compilation phase
    // stores reference data types


 class ArrayListLesson {

    public static void main(String[] args) {


        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");



        food.set(0,"Sushi");// changes Pizza to Sushi (index, New String)

        /** ARRAY LIST USED .size, not .length IMPORTANT <-------*/

        for( int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

    }

}
