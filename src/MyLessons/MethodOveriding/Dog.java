package MyLessons.MethodOveriding;

public class Dog extends Animal{

 @Override // Overided method in Animal Class and gives dog its own version of speak()
void speak(){
    System.out.println("The dog goes bark");
}
}
