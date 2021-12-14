package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List <Book> listBooksInHandsOf(LibraryUser libraryUser){
        List <Book> booksInHandsList = new ArrayList<Book>();
        if (libraryUser == null) {
            return booksInHandsList;
        } else {
            List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
            return resultList;
        }
        /*List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (libraryUser == new LibraryUser("Maria", "Zielna", "54321")) return resultList;
        booksInHandsList = resultList;

        List<Book> books5InHandsList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (libraryUser == new LibraryUser("Anna", "Kowalska", "67890")) return books5InHandsList;
        booksInHandsList = books5InHandsList;
        return booksInHandsList;*/
    }
}
