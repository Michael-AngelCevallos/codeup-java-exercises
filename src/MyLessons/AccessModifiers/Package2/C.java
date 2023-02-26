package MyLessons.AccessModifiers.Package2;

import MyLessons.AccessModifiers.Package1.*;

/** Default Access Modifier - when nothing is stated but the data type like the string below( does ot contain private, public, or final)*/


public class C { // declaring public here gives you access to call PublicMessagein package 1 class A


    String defaultMessageWPublic = " This is the default message from Class C"; // only visible to this package

    public String PublicMessage = " This is your Public Message"; // visible to any class that imports this package



}
