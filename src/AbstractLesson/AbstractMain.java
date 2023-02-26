package AbstractLesson;

/** Abstract - classes CAN NOT be instantiated, BUT they can have a subclass
 *
 * abstract methods are declared without implementation <------------ (look at Vehicle Class)
 *
 * abstract method adds a layer of security <------ ( View Vehicle instance below.( cant be called upon because Vehicle Class is declared abstract (uses abstract keyword)
 *
 * ** Prevents a user from accessing an instance that is too Vague;
 */


public class AbstractMain {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();// cant use because Vehicle is declared abstract in Vehicle class
        Car car = new Car();

        car.go();

        car.stop();

    }

}
