package com.example.kodilla.patterns2.adapter.bookclassifier;

import com.example.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.example.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.example.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("AA", "BB", 2025, "QQ"));
        bookSet.add(new Book("AA", "BB", 1980, "QQ"));
        bookSet.add( new Book("AA", "BB", 2000, "QQ"));
        bookSet.add(new Book("AA", "BB", 2010, "QQ"));
        bookSet.add(new Book("aa", "bb", 1990, "qq"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2000, publicationYearMedian);
    }
}
