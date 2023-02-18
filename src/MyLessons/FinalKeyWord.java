package MyLessons;

/** Final Keyword - once something is declared final it cannot be changed/updated later */
/**Think of it as a version of a constant for JS */

public class FinalKeyWord {

    public static void main(String[] args) {

        //WITHOUT final
        double PI = 3.14;
        PI = 4;

        System.out.println(PI);// returns 4

       final int five = 5;

//       five = 6; wont work because you declared final for int five;





    }

}
