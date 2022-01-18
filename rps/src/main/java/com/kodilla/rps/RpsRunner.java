package com.kodilla.rps;

public class RpsRunner {

    public static void main (String[] args) {
        Loop loop = new Loop();

        //Getting player's name and his request regarding number of rounds;
        loop.initialValues();

        //Executing the game
        while (!loop.isEnd()) {
            loop.gameLoop();
            loop.countingRounds();
        }
        if (loop.getPlayerResults().isEmpty()) {
            System.out.println ("Player did not win a single round");
        } else {
            System.out.println (loop.getPlayersName() + " wins " +
                    loop.getPlayerResults().size() + " out of " + loop.getRoundsRequest() + " rounds!");
        }
    }
}











