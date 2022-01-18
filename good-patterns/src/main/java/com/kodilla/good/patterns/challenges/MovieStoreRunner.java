package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.*;

public class MovieStoreRunner {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);
    }
}
