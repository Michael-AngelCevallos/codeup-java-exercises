package oop;
import util.Input;

import java.util.Scanner;


/*Objects are simply a way of representing state and behavior. To practice writing objects, it helps in the beginning to write objects that represent tangible things like animals, people, cars, etc. With that in mind, until you can write a class quickly and create objects from it, choose a real world concept and do the following...

  todo 1. add three instance variables set to private of at least two primitive types
  todo 2. add 2 instance methods that affect one or more instance variables
  todo 3. add 1 static constant that makes sense for the given class
  todo 4. add 1 static method that makes sense for the given class
  todo 5. add an empty constructor and a constructor that sets all instance variables
  todo 6. add getters and setters for all instance variables
  todo 7. add main method to create the objects

Here are some class suggestions:
  User, Product, Comment, Post, Car, Pet, Radio, SodaCan
  Table, Remote, Building, Toy, Food, Animal, Location
*/
import java.util.Scanner;

public class oopPractice {




    public static void main(String[] args) {
        Animal myCat = new Cat();
        System.out.println(myCat.move());

        Animal myBug = new Bug();
        System.out.println(myBug.move());

        Animal myBird1 = new Bird(2);
        System.out.println(myBird1.move());

        Animal myBird2 = new Bird(0);
        System.out.println(myBird2.move());
    }
}

class Animal {
    protected String color;
    protected int leg_number;

    public Animal() {

    }

    public String move() {
        return "I'm walking with " + leg_number + " legs!";
    }

}

class Cat extends Animal {
    public Cat() {
        color = "orange";
        leg_number = 4;
    }
}

class Bug extends Animal {
    public Bug() {
        color = "green";
        leg_number = 6;
    }
}

class Bird extends Animal {
    private int wing_number;

    public Bird(int wing_number) {
        color = "yellow";
        leg_number = 2;
        this.wing_number = wing_number;
    }

    //  @Override
    public String move() {
        if (this.wing_number > 0) {
            return "I'm flying";
        } else {
            return "I'm walking with " + leg_number + " legs!";
        }
    }
}

