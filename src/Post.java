//Consider the following steps to create a peanut butter and jelly sandwich...

// 1. Get peanut butter jar and jelly jar and bread bag from the pantry and set them on the table
// - walk
// 2. Get plate and two knifes and from kitchen cabinets and set them on the table
// 3. Open the peanut butter and jelly jars and the bread bag
// 4. Put two slices of bread next to one another on the plate
// 5. Use one knife to extract peanut butter and spread evenly on one slice of bread
// 6. Use other knife to extract and spread jelly evenly to other slice of bread
// 7. Join two slices of bread to each other with spread sides of bread touching
// 8. Close the peanut butter and jelly jars and bread bag
// 9. Put knifes in kitchen sink
// 10. Put away peanut butter and jelly jars and bread bag in the pantry
// 11. Eat the sandwich

//-- List all unique nouns (things) involved in these steps
//-- List the categories of nouns / groups of things from these steps
//-- Consider the Peanut Butter Jar:
//  - list all characteristics / types of relevant data concerning the peanut butter jar


//Warmup Questions before Java II

//1. TODO What is the difference between static and instance methods/variables?
//INSTANCE VARIABLES - are created WHEN AN OBJECT is created with the use of the keyword 'new' and destroyed when the object is destroyed. STATIC VARIABLES -  are created when the program starts and destroyed when the program stops. Instance variables can be accessed directly by calling the variable name inside the class.

//2. TODO What is an instance and what is instantiation?
//Basically an Instance is a copy and an Instantiation is when you create the Instance.

//3. todo What is an object in Java?
//A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state. The state of an object is stored in fields (variables), while methods (functions) display the object's behavior. Objects are created at runtime from templates, which are also known as classes.

//4. todo What is a class in Java?

// Class -is a template used to create objects and to define object data types and methods. CLASSES ARE CATEGORIES, and OBJECTS ARE ITEMS WITHIN EACH CATEGORY. All class objects should have the basic class properties.

//5. TODO What is the difference between a class and an object?
//CLASSES ARE CATEGORIES, and OBJECTS ARE ITEMS WITHIN EACH CATEGORY. All class objects should have the basic class properties.


//6. TODO What is a constructor?
//A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
//Ex:  Test() is the constructor here

//class Test {
//  Test() {
//    // constructor body
//  }
//}


//7. todo What are some uses of the ‘final’ keyword?
//8. todo What are some uses of the ‘this’ keyword?
//9. todo What are visibility modifiers?
//10. todo Why use private visibility?




//================================= OOP INTRO
//
//-- UP TO NOW --
//
// - using functions/methods to group together steps for a program to work
//
//
//-- DEFINITION --
//
//  OOP - Object-oriented programming
//
//  - A programming paradigm where state (data/properties) and behavior (functionality/methods)
//    are grouped together (often into objects)
//  - Objects in Java are created from classes (a blueprint for an object/instance)
//
//
//-- ADVANTAGES OF OOP --
//
//  Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
//
  /** - implementation details can be abstracted away making code more readable (Abstraction) */

/**  - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation) */

/**  - duplication is minimized through inheritance hierarchies (Inheritance) */

/**  - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism) */
//
//

/**-- THE FOUR PILLARS OF OOP --(IMPORTANT COULD BE ASKED IN AN INTERVIEW) <<<----------
//
//  1. Abstraction - keep it clean
//  2. Encapsulation - keep it contained
//  3. Inheritance - keep it DRY
//  4. Polymorphism - keep it versatile */
//
//  https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219
//
//  Today we will focus on Abstraction and Encapsulation.
//
//
//-- CONCEPTS COVERED --
//
//  - how to create custom classes and objects from these classes
//  - defining and using instance and static fields
//  - how to control class constructors
//  - using the "this" keyword
//  - controlling encapsulation with visibility modifiers


//Ex. of Person Class - like a blueprint
    // class Person{
        //    public String firstName;
        //    public String lastName;


//EX: Person Object -  like a tool box
    //Person rick = new Person();
        // rick.firstName = "Rick";
        // rick.lastNAme = "Sanchez";

    // PACKAGE - is like a folder/directory for java



/**  control + return --->> go to toString() ---> click enter -->> allows us to return data in a specific way that you want it
 // outcome:  */
// @Override
//    public String toString() {
//        return "Post{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                ", author='" + author + '\'' +
//                ", created_at=" + created_at +
//                '}';
//    }




import java.util.Date;
public class Post {



    public int id;
    public  String title;
    public String content;
    public String author;
    public Date created_at;

    public static void main(String[] args) {

        Post post = new Post();
        post.id = 1;
        post.title = "Yo this is my Title";
        post.content = "";
        post.author = " Mike";
        post.created_at = new Date();

        System.out.println(post.title);
        System.out.println(post.created_at);

        /**change a title that has already been defined */

        post.title = " New Title";

        System.out.println(post.title);

    }




            }









