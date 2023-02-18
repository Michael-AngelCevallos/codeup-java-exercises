package MyLessons;

/** WRAPPER CLASS - PROVIDES A WAY TO USE PRIMITIVE DATA TYPES AS A REFERENCE TYPE
 * CAN BE USED WITH COLLECTIONS (ArrayLists)
 *
 *
 * GIVES PRIMITIVE TYPES A WAY TO ACCESS THINGS LIKE .equals or .toString etc. <<-----------
 */

        //Primitive Data Types       |       //Wrapper type
        //boolean                    |           //Boolean
        //char                       |           //Character
        //int                        |           //Integer
        //double                     |           //Double


/**AUTOBOXING -  AUTOMATIC CONVERSION THAT THE COMPILER MAKES BETWEEN THE PRIMITIVE AND WRAPPER TYPE*/

/**UNBOXING - THE REVERSE OF AUTOBOXING. AUTOMATIC CONVERSION FROM WRAPPER TO PRIMITIVE*/


public class WrapperClass {

    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;


        String e = "Mike";

        if(a == true){
            System.out.println("This is true!");
        }

        if(b == '!'){
            System.out.println("This is also true!!");
        } else{
            System.out.println("Nope! thats false!");
        }


    }

}
