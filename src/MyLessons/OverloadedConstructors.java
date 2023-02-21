package MyLessons;
/** used with PIZZA class <-----------------*/


import org.w3c.dom.ls.LSOutput;

/** OVERLOADED CONSTRUCTORS - MULTIPLE CONSTRUCTORS WITHIN A CLASS WITH THE SAME NAME;
 *                            BUT HAVE DIFFERENT PARAMETERS
 *                            NAME + PARAMETER = SIGNATURE;
 */

public class OverloadedConstructors {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("white", "pepperoni", "Parmesan", "Tomato" );

        //with news constructor in Pizza class with 2 parameters
        Pizza pizza1 = new Pizza("white", "sausage", "gouda" );

        //Contructor with 2 parmeters
        Pizza pizza2 = new Pizza("white", "pepperoni" );

        //Constructor with NO parameters
        Pizza pizza3 = new Pizza();




        System.out.println("Here are the ingredients to your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.toppings);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);

        System.out.println();

        System.out.println("Here your ingerdients to your second pizza");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.toppings);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.sauce);// RETurns NULL value because parameters was never met for pizza 1

        System.out.println();

        System.out.println("Here your ingerdients to your third pizza");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.toppings);

        System.out.println();


        //Sout for the output on constructor with no parameters
        System.out.println(pizza3.bread);
        System.out.println(pizza3.toppings);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.sauce);


    }

}
