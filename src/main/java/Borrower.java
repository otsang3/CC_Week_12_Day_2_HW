import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }

    public int numberOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }


}
