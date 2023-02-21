package AbstractLesson;

public class Car extends Vehicle {


    @Override
    void go() {
        System.out.println("Your vehicle is moving");
    }

    @Override
    void stop() {
        System.out.println("Your vehicle is stopped");
    }
}
