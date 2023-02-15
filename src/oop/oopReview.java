package oop;

/**
 Justin Reich
 9:02 AM
 ================================= OOP REVIEW
 -- QUESTIONS --
 todo 1. What are packages in Java?

 -A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code.

 --->>> like a directory for storing .java files

 todo 2. What is the difference between a class and an object?

 -A class is a blueprint for declaring and creating objects.( one class can make many objects) or used to manipulate data.

 -An object is a class instance that allows programmers to use variables and methods from inside the class. Memory is not allocated to classes.

 class == data type
 Objects == are values of data type

 todo 3. What is instantiation and what syntax is needed to do it?

 instantiation- Create an object by using a new keyword.

 ---->> When an instance of  class (object) is created.

 Syntax: Book bk = new Book();

 todo 4. How are instance variables with public visibility accessed and changed?

 Post post = new Post();

 System.out.println(post.title);// how to access them

 post.title = "My Blog Post"; // changes name of post title


 todo 5. What are instance variables?

 (NOT STATIC!!!!)
 characteristic/value/state/ variable for an OBJECT

 ---->> Variables of the class

 -Instance variables in Java are non-static variables which are defined in a class outside any method, constructor or a block. Each instantiated object of the class has a separate copy or instance of that variable. An instance variable belongs to a class.

 todo 6. What is displayed when printing out an object?
 ---->> Object id unless override by toString() method

 -When we print the object, we can see that the output looks different. This is because while printing the object, the toString() method of the object class is called. It formats the object in the default format.

todo 7.  What are instance methods?

 -Instance method are methods which require an object of its class to be created before it can be called. To invoke a instance method, we have to create an Object of the class in which the method is defined.

 todo 8. What is the difference between static and instance methods/variables?

 Static--

 syntax: Post post = new Post("overlord");
            Post.printAuthor()

 instance --

 public void printAuthor() {

 }

 todo 9. What is an instance and what is instantiation?

- an instance would be used to access/change object variables
 - Static would be useful for multiple instances. gather data

 - instantiation- creating the instance then creating an object.

 todo 10. What is a constructor?

 -Constructors in java are used to create the instance of the class.
 Constructors are almost similar to methods except for

 two things -
 ---->>>its name is the same as the class name
 ----->>and it has no return type.

 Sometimes constructors are also referred to as special methods to initialize an object.

OFTEN overloaded to account for different use cases for objects


 Reading objects from a database

 Posts{
 id:57394
 title: " A day in the life"
 }

 Saving a post --no id yet

 post post1= new POst(int id, String title, String content, String author, Date create_at)

 */





public class oopReview {





        }

