package MyLessons.AccessModifiers.Package1;
import MyLessons.AccessModifiers.Package2.*;



public class B {
    private String priString = "This is a private String";

    public static void main(String[] args) {

        B b = new B();

        System.out.println(b.priString);
    }
}
