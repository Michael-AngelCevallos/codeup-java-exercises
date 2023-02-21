package ClassNotes.AbstractClasses;

public class Plane extends Vehicle{


    @Override
    protected void turnOn() {
        System.out.println("Push the button, the plane is on!");
    }
}
