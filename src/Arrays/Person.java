package Arrays;

//todo Create Person class inside of src
 public class Person {


// methods start:

    //TODO  that has a private name field that is a string
    private String name;
    private int age;


    //CONSTRUCTOR <<<------------
    //TODO: The class should have a constructor that accepts a String value and sets the person's name to the passed string.
    public Person(String name, int age) {
       this.name = name;// dont have to use "this" keyword but doesn't hurt and gives you more access later on
        this.age= age;
    }
    //end of constructor



    //TODO: Returns the person's name
    public String getName(){
        return this.name;
    }

    public void setName(String name){

        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello() {

        System.out.println("Hello, My name is " + this.name + " and my age is" + this.age);
    }

//    public static void makePeopleOlder(Person[] person){
//        for(Person person :people){
//
//        }
//    }




    //methods end


        //todo Create a `main` method on the class that creates a new `Person` object and tests the above methods.(below)
    //Main Method Starts, creates the Person class and test the above methods
    public static void main(String[] args) {

        /** puts the name Mike into variable of m*/

        Person m = new Person("Mike", 99);
        m.sayHello();//sout's sayHello method with "Mike" now added in


        /**Change name */
        m.setName("Alex");


        /** ADD A LAST NAME */
        //adds Last Name to the above
        m.setName(m.getName() +  " Cevallos");
        m.sayHello();// TEST THE NEW OUTPUT



        /** PART 2 of Exercise */

        //UNDERSTANDING REFERENCES

        //The following code blocks make use of the Person class from the previous exercise.
        // TODO - For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// RETURNS TRUE, BECAUSE EQUALS IS ASKING IF PERSON IS EQUAL TO PERSON 2 <<<--------
//        System.out.println(person1 == person2); // RETURNS FALSE, BECAUSE "==" SIGN IS ASKING IF IT IS TRUE OR FALSE THAT the object name of PERSON1 IS THE SAME object name AS PERSON 2 <<<<---------


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);// RETURNS TRUE, BECAUSE "==" SIGN IS ASKING IF IT IS TRUE OR FALSE THAT PERSON1 IS THE SAME AS PERSON 2 <<<<---------

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());// RETURNS JOHN
//        System.out.println(person2.getName());// RETURNS JOHN
//        person2.setName("Jane");
//        System.out.println(person1.getName());// RETURNS JANE
//        System.out.println(person2.getName());// RETURNS JANE



    }



}
