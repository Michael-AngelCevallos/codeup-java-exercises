package MyLessons.Polymorphism;

public class Boat extends Vehicle{



    //// this is a method overide of go() from vehicle class
    @Override
    public void go(){
        System.out.println("**The BOAT IS  MOVING!!!**");
    }
}
