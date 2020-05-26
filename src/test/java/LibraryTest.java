import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Book book2;
    Library library;
    Library library2;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(10);
        library2 = new Library(0);
        book = new Book ("The Catcher in the Rye", "J.D. Salinger", "Novel");
        book2 = new Book ("Wuthering Heights", "Emily Bronte", "Novel");
        borrower = new Borrower();
    }

    @Test
    public void getNumberOfBooks(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void addBookFail(){
        library2.addBook(book2);
        assertEquals(0, library2.numberOfBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book2);
        library.removeBook(book);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.addBook(book2);
        library.lendBook(book, borrower);
        assertEquals(1, library.numberOfBooks());
        assertEquals(1, borrower.numberOfBooks());
    }
}
