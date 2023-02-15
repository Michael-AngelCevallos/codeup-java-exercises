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

                                        /**Dish Exercise 2 */

/*

-- SHORT ASSIGNMENT #3 --
Refactor your Dish and DishTest classes...

  todo 1) Change all properties in the Dish class to private visibility (printSummary should remain public)
  todo 2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
  todo 3) Refactor code as needed in DishTest to access and modify dish object property values
  todo 4) Add a constructor method to Dish that will assign all properties
  todo 5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
 */


public class Dish {


    //Identifiers
    private int costInCents;
    private String nameOfDish;
    private static boolean wouldRecommend;


  //constructor
  public Dish (String nameOfDish, int cost, boolean wouldRecommend){
     this.nameOfDish = nameOfDish;
     this.costInCents = costInCents;
     this.wouldRecommend = wouldRecommend;
}



 /**GETTERS*/
  public int getCostInCents() {
    return costInCents;
}

public String getNameOfDish(){
      return nameOfDish;
}

public boolean getWouldRecommend() {
    return wouldRecommend;
}



/** SETTERS --- NEEDS VOID*/

 public void setCostInCents(int costInCents) {
    this.costInCents = costInCents;
}

public void setNameOfDish(String nameOfDish){
      this.nameOfDish = nameOfDish;
}

public void setWouldRecommend(boolean wouldRecommend){
      this.wouldRecommend = wouldRecommend;
}


                                        // constructor
    public void printSummary(int costInCents, String nameOfDish, boolean wouldRecommend) {
        System.out.printf("The plate of\n Name: %s\n Cost: %d\n Recommended? %b\n", nameOfDish, costInCents, wouldRecommend);

    }
 public void eat (){
System.out.println("Munch Munch Munch!");
}

}





