package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {


        //zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Altering given text with lambdas");
        poemBeautifier.beautify("First poem text, all written in capital letters:", text -> text.toUpperCase());
        poemBeautifier.beautify("Second poem text, with further text added: ", text -> text + "ABC");
        poemBeautifier.beautify("Third poem text, with random supplement: total number of characters: ",
                text -> text + (text.length()));




        //zadanie 7.3
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultStringOfUsers = theForum.getUsersList().stream()
                .filter(forumUser -> forumUser.getGender() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2000)
                .filter(forumUser -> forumUser.getPostsCount() > 1)
                .collect(Collectors.toMap(ForumUser::getForumUserID, forumUser -> forumUser));

        System.out.println("After applying appropriate filters, following forum users are: ");

        theResultStringOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " +entry.getValue())
                .forEach(System.out::println);







    }
}




