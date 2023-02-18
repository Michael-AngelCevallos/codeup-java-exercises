package MyLessons;

/** METHODS (function like in js) - a block of code that is executed when called upon*/



/** VOID (Expects a sout)- used to NOT have "Return" keyword in method
 *
 *
 */

public class Methods {
    public static void main(String[] args) {

        int x = 9;
        int y = 8;

        int age = 19;

         String name = "Mike" ;


hello();// used on line 20

hello(name);// used online 27

hello(name,age);


        /** LOCALE Variable - we can use int z again here because variables within main method curly braces dont count as variables else where*/
        /** Math */

//        int z = add(x , y);
//        System.out.println(z);// NOW IT WILL DISPLAY IN CONSOLE -- returns 17
        // OR !!!
        System.out.println(add(x,y));// returns 17

        int s = subtract(x, y);
        System.out.println(s);// returns 1

        int m = multiply(x, y);
        System.out.println(m);


        /** EASIER method uses just return, NO NEW variable */
        System.out.println(add2(x,y));// returns 17


    }// end of main method curly brace



    /**Methods - PARAMETERS MUST MATCH WHEN CALLED UPON IN MAIN <------- IIIIIMMMMPPPORTANT !!!!!!!!!<---------  */

    static void hello(){
        System.out.println("Hello");// DOES NOT display UNTIL 'hello()' is called within the main
    }


    static void hello(String name){
        System.out.println("Hello "+ name);// PARAMETER 'NAME' MUST B E CALLED IN THE SOUT AGAIN IN ORDER TO WORK
    }

    static void hello(String name, int age){
        System.out.println("Hello "+ name + " and you are " + age);// PARAMETER 'NAME' MUST B E CALLED IN THE SOUT AGAIN IN ORDER TO WORK
    }

    static int add(int x, int y){ // "INT keyword here represents the return type for this method
        int z = x + y; // makes a variable that adds the two parameters of x and y
        return z;// returns z
    }

    static int subtract(int x, int y){
        int s = x - y;
        return s;
    }
    static int multiply(int x, int y){
        int m = x * y;
        return m;
    }
    static int add2(int x , int y){
        return x +y;
    }


}
