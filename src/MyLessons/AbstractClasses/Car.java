package MyLessons.AbstractClasses;


import java.sql.SQLOutput;

/** Car is subclass of Vehicle*/

public class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("The Vehicle Is Moving");
    }

    @Override
    void stop() {
        System.out.println("The Vehicle is stopped");
    }
}
