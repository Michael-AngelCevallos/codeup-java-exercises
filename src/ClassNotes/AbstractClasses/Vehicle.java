package ClassNotes.AbstractClasses;

// must be abstract to declare an abstract method

    abstract public class Vehicle {

        protected int SpeedMPH;
        protected String direction;
        protected int noOfPassengers;


        protected void changeSpeed(int mph){ //(non-abstract method IN an abstract class )
            SpeedMPH = mph;
        }

        abstract protected void turnOn(); // abstract method// can only be used if the class Vehicle is declared abstract

        public static void main(String[] args) {


        }

    }

