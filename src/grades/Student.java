package grades;

/*
. . . The Student class should have the following methods:
 */

import java.util.ArrayList;

public class Student {

    //todo It should have private properties for the student's name, and grades;

private String name;
private int grades;



// todo The student class should have a (1)constructor that sets name property, and initializes the grades property as an empty ArrayList;
    public Student(String name, int grades) {
        this.name = name;
        this.grades = grades;
    }


    public void setName(String name) {
        this.name = name;
    }

    //todo he Student class should have the following methods:

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades = new grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){

    }


    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Carlos");
        name.add("ALex");
        name.add("Roman");
        name.add("James");
        name.add("Maria");
        name.add("Christina");
        name.add("Lorena");
        name.add("Mike");

        //todo The grades property should be an ArrayList of integers.
        ArrayList<Integer> grades = new ArrayList<>();



    }
    //todo The grades property should be an ArrayList of integers
}
