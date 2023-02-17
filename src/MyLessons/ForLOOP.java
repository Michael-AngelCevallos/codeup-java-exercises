package MyLessons;

public class ForLOOP {

    /**
     * FOR LOOPS Execute a block of code a LIMITED amount of times
     * --- like a while loop but while loops can keep going, for loops are meant to stop
     */

    public static void main(String[] args) {


        //create program that counts from 0 to 10

        for (int i = 0; i <= 10; i++) {//i represent index, second part says - we would like to continue this condition as long as i is <= 10,third say we would like to count up by 1
            System.out.println(i);// display index of i
        }


        System.out.println();// used for a blank space in console


//Countdown from 10, then display Happy New Year
        for (int i = 10; i >= 0; i--) {// i represent index starts it at 0, second part starts from 10, third part decrements or counts down by 1
            System.out.println(i);// display index of i
        }
        System.out.println("Happy New Year!!");


        System.out.println();//USED FOR A BLANK SPACE IN THE CONSOLE


//COUNT DOWN BY 3 FROM 100

        for (int i = 100; i >= 0; i-=3) {
            System.out.println(i);
        }


    }
}