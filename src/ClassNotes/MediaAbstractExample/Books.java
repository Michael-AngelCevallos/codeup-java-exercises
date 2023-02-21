package ClassNotes.MediaAbstractExample;

public class Books extends Library{

    String bookName;

    public Books(String bookName) {
        this.bookName = bookName;

    }

    @Override
    public void flipPage() {
        System.out.println("You flipped a page of the book " + bookName);

        }

    void bookCase () {
        System.out.println("You went to the bookcase");
    };
    }


