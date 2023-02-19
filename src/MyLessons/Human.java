package MyLessons;

public class Human {


    String name ;
    int age;
    double weight;


    //CONSTRUCTOR - starts with same name of class
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    void eat(){
        System.out.println(this.name + " is eating");
    }

    void weight(){
        System.out.println(this.name + " weighs" + this.weight);
    }

    void beautiful(){
        System.out.println(this.name + " is beautiful!!!!");
    }


}
