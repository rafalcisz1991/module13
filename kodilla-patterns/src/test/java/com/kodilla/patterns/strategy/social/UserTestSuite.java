package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSocialPublisher() {
        //Given
        User john = new Millenials("John");
        User steve = new YGeneration("Steve");
        User rick = new ZGeneration("Rick");

        //When
        String johnUses = john.sharePost();
        System.out.println("John uses: " + johnUses);
        String stevenUses = steve.sharePost();
        System.out.println("Steve uses: " + stevenUses);
        String rickUses = rick.sharePost();
        System.out.println("Rick uses: " + rickUses);

        //Then
        assertEquals("Facebook", johnUses);
        assertEquals("Twitter", stevenUses);
        assertEquals("Snapchat", rickUses);
    }

    @Test
    void testIndividualSocialPublisher() {
        //Given
        User steven = new Millenials("Steven");

        //When
        String stevenUses = steven.sharePost();
        System.out.println("Steven uses: " + stevenUses);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenUses = steven.sharePost();
        System.out.println("Steven now uses: " + stevenUses);

        //Then
        assertEquals("Twitter", stevenUses);

    }
}
