package home06.epam.task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookLibrary {
    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<Book>();
    }

    public void add(Book bk) {
        books.add(bk);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLibrary that = (BookLibrary) o;
        return books.equals(that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "books=" + books +
                '}';
    }
}
