package ClassNotes.MediaAbstractExample;

public class Magazines extends Library{

    @Override
    void flipPage() {
        System.out.println("You flipped a page of the Magazine");
    }

    void rip(){
        System.out.println("You ripped a page out of the magazine");
    }

}
