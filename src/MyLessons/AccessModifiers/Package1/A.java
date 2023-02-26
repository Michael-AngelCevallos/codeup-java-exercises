package MyLessons.AccessModifiers.Package1;

import MyLessons.AccessModifiers.Package2.C;

import MyLessons.AccessModifiers.Package2.*;

public class A {

    protected String proString = "This is a protected Message";

    public static void main(String[] args) {


        /** public keyword is used to declare String default Message */

        C c = new C();
        System.out.println(c.PublicMessage);

        /** Default ( no use of private, public , or ) */

        /** (Does NOT WORK because defaultMessage needs to be public to be accessed from an imported package */
//        System.out.println(c.defaultMessage);



        /** Protected is accessible to a different class in a different package AS LONG AS its a subclass(extends to) of whatever class contains the message ( Asub extends A)*/



        /** Private means ONLY class where private variable is declared has access to the variable (if declared private String in class b, then only class b has Access)*/


    }


}
