package MyLessons.SuperKeyWord;

/** Super keyword - refers to the superclass (parent) of an object
 *  very similar to "this" keyword
 *
 *  used during inheritance
 */


public class SuperKeyWordMain {

    public static void main(String[] args) {

        Hero hero = new Hero("Batman", 35 , "Rich");// returns sout that comes along with Hero()  method


        // returns each statement on their own line
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        /** Another way to display same as above */
        //Use toString Method(located in Hero and Person class
        System.out.println(hero.toString());



    }


}
