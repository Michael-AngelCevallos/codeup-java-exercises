package MyLessons.MethodOveriding;

/** Declaring a method in a subclass, which is already present in a parent class.
 * done so that a child class can give it own implementation;
 */


public class MethodOveriding {

    public static void main(String[] args) {


        Dog dog = new Dog();

        dog.speak(); // returns sout from dog class

        Animal animal = new Animal();

        animal.speak();// returns sout from Animal Class
    }


}
