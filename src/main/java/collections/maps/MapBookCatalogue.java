package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapBookCatalogue implements BookCatalogue {

    private final Map<String, Book> books = new HashMap<>();

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
        books.put(book.getIsbn(), book);
    }

    @Override
    public Book getByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public void remove(Book book) {
        books.remove(book.getIsbn());
    }
}
