package collections.maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogueTest {

    private BookCatalogue bookCatalogue = new ListBookCatalogue();

    Book czystyKod = new Book(
            "9788328302341",
            "Czysty kod. Podręcznik dobrego programisty",
            "Robert C. Martin",
            "2010-02-19"
    );

    Book pragmatycznyProgramista = new Book(
            "9788328334625",
            "Pragmatyczny programista. Od czeladnika do mistrza",
            "Andrew Hunt, David Thomas",
            "2011-08-26"
    );

    Book tdd = new Book(
      "9788328365728",
      "TDD. Sztuka tworzenia dobrego kodu",
      "Kent Beck",
      "2014-03-14"
    );

    Book designPatterns = new Book(
            "978-0201633610",
            "Design patterns: elements of reusable object-oriented software",
            "Erich Gamma, Richard Helm, Ralph Johnson, John Vissides",
            "1994-10-21"
    );

    @BeforeEach
    public void beforeEach() {
        bookCatalogue.add(czystyKod);
        bookCatalogue.add(pragmatycznyProgramista);
        bookCatalogue.add(tdd);
        bookCatalogue.add(designPatterns);
    }

    @AfterEach
    public void afterEach() {
        bookCatalogue.clear();
    }

    @Test
    public void shouldAddBookToCatalogue() {
        assertEquals(4, bookCatalogue.countBooks());
    }

    @Test
    public void shouldLookupBookInCatalogue() {
        assertEquals(czystyKod, bookCatalogue.getByIsbn(czystyKod.getIsbn()));
        assertEquals(pragmatycznyProgramista, bookCatalogue.getByIsbn(pragmatycznyProgramista.getIsbn()));
        assertEquals(tdd, bookCatalogue.getByIsbn(tdd.getIsbn()));
        assertEquals(designPatterns, bookCatalogue.getByIsbn(designPatterns.getIsbn()));
    }

    @Test
    public void shouldRemoveBookFromCatalogue() {
        bookCatalogue.remove(czystyKod);

        assertNull(bookCatalogue.getByIsbn(czystyKod.getIsbn()));
    }
}
