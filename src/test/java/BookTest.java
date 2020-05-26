import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    Book book2;

    @Before
    public void before(){
        book = new Book ("The Catcher in the Rye", "J.D. Salinger", "Novel");
        book2 = new Book ("Wuthering Heights", "Emily Bronte", "Novel");
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Catcher in the Rye", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Emily Bronte", book2.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Novel", book.getGenre());
    }
}
