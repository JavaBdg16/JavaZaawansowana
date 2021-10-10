package collections.maps;

public interface BookCatalogue {
    void clear();

    int countBooks();

    void add(Book book);

    Book getByIsbn(String isbn);

    void remove(Book book);
}
