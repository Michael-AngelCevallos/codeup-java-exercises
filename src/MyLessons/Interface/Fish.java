package MyLessons.Interface;

/** Fish class implements both Predator and Prey */

public class Fish implements Predator, Prey {

    @Override
    public void hunt() {
        System.out.println("Found some food....The fish is hunting a smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("There's always a bigger Fish .....The Fish is fleeing");
    }
}
