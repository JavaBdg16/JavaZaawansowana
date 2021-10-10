package collections.maps;

import java.util.ArrayList;
import java.util.List;

public class ListBookCatalogue implements BookCatalogue {

    private final List<Book> books = new ArrayList<>();

    @Override
    public void clear() {
        books.clear();
    }

    @Override
    public int countBooks() {
        return books.size();
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Book getByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }

        return null;
    }

    @Override
    public void remove(Book book) {
        books.remove(book);
    }
}
