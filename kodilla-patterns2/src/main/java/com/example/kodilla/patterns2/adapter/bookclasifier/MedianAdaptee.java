package com.example.kodilla.patterns2.adapter.bookclasifier;

import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }
}
