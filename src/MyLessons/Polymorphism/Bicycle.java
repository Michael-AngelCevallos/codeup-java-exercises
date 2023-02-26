package MyLessons.Polymorphism;

public class Bicycle extends Vehicle{



    //// this is a method overide of go() from vehicle class
    @Override
    public void go(){
        System.out.println("**The BICYLCE IS MOVING!!**");
    }

}
