package MyLessons.Polymorphism;

public class Car extends Vehicle{



    // this is a method overide of go() from vehicle class
    @Override
    public void go(){
        System.out.println("** The Car IS MOVING!!**");
    }
}
