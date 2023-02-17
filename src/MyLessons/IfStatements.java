package MyLessons;



/** IF STATEMENTS = PERFORMS A BLOCK OF CODE IF ITS CONDITION EVALUATES TO BE TRUE */
public class IfStatements {

    public static void main(String[] args) {

        int age = 4;

        if( age>= 75){
            System.out.println("Damn your old, your 75 or older");
        } else if (age >= 18 && age <= 70) {
            System.out.println("Congratulations, your " + age + ", Your an adult");
        }else if( age >= 13 && age <=17){
            System.out.println("Your " + age + " years old,  your a teenager");
        }else if ( age < 13  && age <=5){
            System.out.println(" Your only " + age + ", Your just a kid");
        } else {
            System.out.println(" Your too young, you must be a baby");
        }

        }



    }



