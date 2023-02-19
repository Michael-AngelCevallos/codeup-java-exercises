package MyLessons;


//use with Human <------------
/**Constructors- Specials method that is called when an object is instantiated(created)*/

public class Constructors {



    public static void main(String[] args) {

        Human human = new Human("Mike", 29, 220);// MUST PASS IN SAME PARAMETERS AS ONES IN HUMAN CLASS CONSTRUCTOR!!!!!!!
        //Start with name of object-
        System.out.println(human.name);// returns mike


        /**make a second human */

        Human human2 = new Human("Alex", 27, 180);
        System.out.println(human2.name);

        /** Make a Third human */

        Human human3 = new Human("Roman", 22, 185);
        System.out.println(human3.name);

        Human human4 = new Human("Jovan", 32,125);


        /** Use with Method(** look at Human.java class)*/
       human2.eat();// returns "Alex is eating"

        // extra example
       human4.beautiful();


    }
}
