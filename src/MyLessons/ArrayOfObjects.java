package MyLessons;
/** used with Food Class */


public class ArrayOfObjects {


    int[] numbers = new int[3];
    char[] characters = new char[4];
    String[] strings = new String[5];

    //create array of objects, Start with data type

    public static void main(String[] args) {


        Food[] refrigerator = new Food[3];// 3 represents that this refrigerator can  hold 3 items

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Chocolate");
        Food food3 = new Food("Cheese");

        //store values in the index

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;


        //Access new values by souting the index
        System.out.println(refrigerator[0]);// returns array of location in computers memory - "MyLessons.Food@28a418fc"

        System.out.println(refrigerator[0].name);// returns "Pizza"
        System.out.println(refrigerator[1].name);// returns "Chocolate"
        System.out.println(refrigerator[2].name);// returns "Cheese"


        System.out.println();


        /**Another way to do this --EASIER WAY*/

        // first step

        Food food4 = new Food("Cake");
        Food food5 = new Food("Peanuts");
        Food food6 = new Food("Salad");

        Food[] newFridge = {food4,food5,food6};



        System.out.println(newFridge[0].name);//returns Cake
        System.out.println(newFridge[1].name);//returns Peanuts
        System.out.println(newFridge[2].name);// returns Salad

    }

}
