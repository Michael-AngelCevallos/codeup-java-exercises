package MyLessons;

import java.util.Random;



public class DiceRoller {


    /** Declare Globally */
    //==============================================================================
    Random random;// Global declaration- declared outside method
    int number;//Global Declaration - declared outside method // can also put "int number = 0;"

    public DiceRoller() {
        random = new Random();
        roll();

    }
    void roll(){ // method that roll s dice
        number = random.nextInt(6) +1; //+1 will get the count to 6, without +1 it will only count to 5
        System.out.println("You rolled a " + number);
    }



    /** Declare Locally */
    //=============================================================================================================

//    public DiceRoller() { How to declare locally <-------------
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//
//    }
//    void roll(Random random, int number){ // method that roll s dice
//        number = random.nextInt(6) +1; //+1 will get the count to 6, without +1 it will only count to 5
//        System.out.println("You rolled a " + number);
//    }


}
