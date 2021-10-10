package collections.maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<Book> book =
                books.stream().filter(x -> x.getIsbn().equals(isbn)).findFirst();
        return book.isEmpty() ? null : book.get();
//        for (Book book : books) {
//            if (book.getIsbn().equals(isbn)) {
//                return book;
//            }
//        }

//        return null;
    }

    @Override
    public void remove(Book book) {
        books.remove(book);
    }
}
