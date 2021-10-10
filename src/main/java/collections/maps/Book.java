package collections.maps;

public class Book {

    private final String isbn;
    private final String title;
    private final String author;
    private final String releaseDate;

    public Book(String isbn, String title, String author, String releaseData) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseData;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
