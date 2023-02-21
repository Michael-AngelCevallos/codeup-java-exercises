package MyLessons.SuperKeyWord;

public class Person {
    // list attributes that would describe a person

    String name;
    int age;

// make constructor


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age + "\n" ;
    }
}
