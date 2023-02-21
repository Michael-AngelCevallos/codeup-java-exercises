package MyLessons.SuperKeyWord;

public class Hero extends Person{
    // list attributes of a superhero

    String power;

    public Hero(String name, int age, String power){
        super(name, age);// "super" gives us access to Parent variables (same as if you put -->) this.name = name; this.age = age;
        this.power = power;
        System.out.println("Your hero is " +name+ " , you are "+age+ " and your power is " +power+ "!");// <-----Only souted when instance is called!!

    }

    public String toString(){
        return super.toString() + this.power;
    }
}
