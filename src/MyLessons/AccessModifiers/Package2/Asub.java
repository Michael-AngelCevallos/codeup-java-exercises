package MyLessons.AccessModifiers.Package2;

import MyLessons.AccessModifiers.Package1.A;

public class Asub extends A {

    public static void main(String[] args) {

        Asub asub =  new Asub();
        System.out.println(asub.proString);// pulls and souts protected message from Class A

        C c = new C();
        System.out.println(c.defaultMessageWPublic); // can be ac cessed here because class C is in same Package as Asub class

    }
}

