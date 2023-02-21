package MyLessons.Interface;

/** Rabbit will use flee() method in Prey Interface, so we need to implement prey here */

public class Rabbit implements Prey{

    // since we are implemeting flee() method we need to state what will be done when called upon
    // add ALL implemented methods from Prey here


    @Override
    public void flee() {
        System.out.println("*The Rabbit is Fleeing*");
    }
}
