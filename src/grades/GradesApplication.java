package grades;

import java.util.HashMap;

public class GradesApplication{

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();

        Student Mike = new Student("Mike", 89);
        Mike.addGrade(92);
        Mike.addGrade(84);
        System.out.println(Mike.getGradeAverage());

        Student alex = new Student("Alex", 78);
        alex.addGrade(89);
        alex.addGrade((76));
        System.out.println(alex.getGradeAverage());// returns 81

        Student john = new Student("John", 62);
        alex.addGrade(78);
        alex.addGrade(83);
        System.out.println(john.getGradeAverage());



        // adds github Usernames to the students
        students.put("Michaelcevallos94", Mike);
        students.put("AbDcbb2", alex);
        students.put("JohnR26", john);


    }
}
