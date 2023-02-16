import java.util.Arrays;



public class ArraysExercises {


    @Override
    public String toString() {
        return "ArraysExercises{}";
    }

    //todo Create a static method named addPerson.
    // -It should accept an array of Person objects, as well as a single person object to add to the passed array.
    // -It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//    String person;
//    public void addPerson(String name){
//        person = name;
//
//    }

    //todo Create a main method for this class to do your work.
    public static void main(String[] args) {




        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); // Will print out ID. Array.toStrings is necessary to print numbers


        // todo Create an array that holds 3 Person objects.Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        String[] persons = {"Mike", "Alex", "Roman"};
            for (String person: persons){
            System.out.println(person);


                String[] people = Arrays.copyOf(persons, 4);
                System.out.println(Arrays.toString(people));// returns null
                people[3] = "Jovan";
                System.out.println(Arrays.toString(people));// adds Jovan to the end of list

            }

        }





    }


