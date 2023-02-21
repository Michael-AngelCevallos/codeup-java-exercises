package MyLessons;

public class Pizza {


    String bread;
    String toppings;
    String cheese;
    String sauce;


    // Constructor gives access to a pizza with no toppings
    public Pizza(){
        System.out.println("You have nothings!");
    }

    public Pizza(String bread, String toppings, String cheese) {
        this.bread = bread;
        this.toppings = toppings;
        this.cheese = cheese;

    }


    public Pizza(String bread, String toppings){
        this.bread = bread;
        this.toppings = toppings;

    }


    public Pizza(String bread, String toppings, String cheese, String sauce) {
        this.bread = bread;
        this.toppings = toppings;
        this.cheese = cheese;
        this.sauce = sauce;



    }


}
