package oop;



//Visibility - Visibility refers to how a class or instance field is allowed to be accessed. It allows us to encapsulate the data in our classes; that is, only expose what is necessary to other classes and objects.



//this Keyword


public class Student {


    public String name;
    public String cohort;


    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }


    public Student(String name) {
        this(name, " Unassigned");
//        this.name = name;
//        this.cohort= "Unassigned";
    }

    public String sayHello(){
        return String.format("Hello from " + this.name + "!");
    }
    public void changeStudentName(String nameOfStudent) {
        if (nameOfStudent.isEmpty()) {
            this.name = "";
            this.cohort = "";
        } else {
            this.name = nameOfStudent;
        }
    }

    public static void main(String[] args) {


    }
}

