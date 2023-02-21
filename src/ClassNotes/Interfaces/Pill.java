package ClassNotes.Interfaces;

public class Pill implements Consumable{

    private String medicationName;
    private String pharmacyName ;
    private boolean crushInFingers;




    @Override // overrides behavior from parent class
    public void consume(){
        System.out.println("Drink with Water");
    }

    @Override
    public void checkIfExpired() {
        System.out.println("look at pill bottle");
    }

    @Override
    public void throwAway() {
        System.out.println("toss in the trash");



        }
    }



