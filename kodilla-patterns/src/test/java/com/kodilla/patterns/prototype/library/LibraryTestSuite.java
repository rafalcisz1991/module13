package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //creating 2 books
        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());

        //creating new library, adding books
        Library library = new Library("Library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        //shallow copy of the Library1
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy of object Library1
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(1, library.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertEquals(2, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
        assertTrue(deepClonedLibrary.getBooks().contains(new Book("title2", "author2", LocalDate.now())));
        assertFalse(clonedLibrary.getBooks().contains(new Book("title2", "author2", LocalDate.now())));
    }
}
