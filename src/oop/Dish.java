package oop;

//-- OOP SHORT ASSIGNMENT #1 --
//todo Create a class called Dish. This class will represent various restaurant dishes.

//todo Include an integer property called “costInCents”

//todo Include a string property called “nameOfDish”

//todo Include a boolean property called “wouldRecommend”

//todo Include a method called “printSummary” with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//      Cost: COST_IN_CENTS_HERE
//      Name: NAME_OF_DISH_HERE
//      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

//todo Create another class called DishTest

//todo Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed







                                    /** DISH Exercise */
                           // connected/ works with to dishTest.java

public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


// constructor
    public void printSummary(int costInCents, String nameOfDish, boolean wouldRecommend) {
        System.out.printf("The plate of\n Name: %s\n Cost: %d\n Recommended? %b\n", nameOfDish, costInCents, wouldRecommend);

    }

    }



