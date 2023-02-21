package ClassNotes.MediaAbstractExample;

public class Main {

    public static void main(String[] args) {

//        Library library = new Library();//CAN NOT be instanced because Library class is abstract


        // flipPage  method is an abstract method that extends to all children through parent class Library. returns a special mesage for each
        Books book = new Books("Yo");
        book.flipPage();

        Magazines magazine = new Magazines();
        magazine.flipPage();


        Newspapers newspaper = new Newspapers();
        newspaper.flipPage();


        //unique methods for certain Classes
        Books book1 = new Books("Bible");
        book1.bookCase();

        newspaper.burn();

        magazine.rip();


        book.incinerator();

        System.out.println();
        //mini exercise part 2

        Person person = new Librarian();

        person.picksUpBooks();

    }
}
//        newspaper.bookCase // DOES NOT WORK because bookCase method is defined only in Book class


