import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int numberOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.capacity > this.numberOfBooks()) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public void lendBook(Book book, Borrower borrower){
        this.removeBook(book);
        borrower.addBook(book);
    }

}
