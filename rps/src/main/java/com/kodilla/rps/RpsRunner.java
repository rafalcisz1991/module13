package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        Loop loop = new Loop();
        //Getting player's name and his request regarding number of rounds;
        loop.initialValues();
        //Executing the game
        while (!loop.isEnd()) {
            loop.gameLoop();
        }

        System.out.println("Current number of winnings of: " + loop.getPlayersName() + " is " + loop.getPlayerResults().size());
    }
}











