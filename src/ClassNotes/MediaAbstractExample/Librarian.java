package ClassNotes.MediaAbstractExample;




public class Librarian extends Person implements Job {

    @Override
    void picksUpBooks() {
        bookCase();
        System.out.println("Pick up book");
    }

    private void bookCase() {
        System.out.println("Go to the bookcase");
    }
}
