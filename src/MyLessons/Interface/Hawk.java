package MyLessons.Interface;

public class Hawk implements Predator{

    // since we implemented the Predator Interface we must implement the hunt() method and give a sout for the return

    @Override
    public void hunt() {
        System.out.println("*The Hawk is hunting!*");

    }


}
