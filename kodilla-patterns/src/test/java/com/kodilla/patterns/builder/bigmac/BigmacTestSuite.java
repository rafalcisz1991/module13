package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("onion")
                .ingredients("tomato")
                .ingredients("tuna")
                .bun("regular")
                .sauce("hot")
                .burgers(3)
                .build();

        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, numberOfIngredients);
        assertEquals("regular", bigmac.getBun());
    }
}
