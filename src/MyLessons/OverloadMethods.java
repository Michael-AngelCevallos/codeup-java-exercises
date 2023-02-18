package MyLessons;

/** OVERLOADED METHODS - METHODS THAT SHARE SAME N AME B YUT HAVE DIFFERENT PARAMETERS
 * METHOD NAME + PARAMETERS = METHOD SIGNATURE*/



public class OverloadMethods {



    static int add(int a, int b){
        System.out.println("This is overloaded Method #1");// when this method is used it will display this and the answer after
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded Method #2");// when this method is used it will display this and the answer after
        return a + b + c ;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded Method #3");// when this method is used it will display this and the answer after
        return a + b + c + d;
    }

    /** Same but with double values */
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded Method #4 (double values)");// when this method is used it will display this and the answer after
        return a + b + c ;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded Method #5(double values)");// when this method is used it will display this and the answer after
        return a + b + c + d;
    }



    public static void main(String[] args) {

        //this uses method 1 because it only has two parameters
        int x = add(10,7);
        System.out.println(x); //  this souts method one

        System.out.println();// blank space in console

        //sout method 2 -  uses 3 parameters
        int y = add(15, 11, 12);
        System.out.println(y);

        System.out.println();// blank space in console

        //sout method 3 - uses 4 parameters
        int z = add(20,6,10,11);
        System.out.println(z);

        System.out.println();


        /** Add double values */
        //sout method 4 - 3 double values
        double w = add(3.14,2.5,6.2);
        System.out.println(w);

        System.out.println();

        //sout method 5 - 4 double values
        double p = add(3.14,2.5,6.2, 10.9);
        System.out.println(p);

    }
}
