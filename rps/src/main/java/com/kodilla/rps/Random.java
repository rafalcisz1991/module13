package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Loop {

    Scanner scanner = new Scanner(System.in);
    Random randomNumber = new Random();
    boolean end = false;
    int playersPick;
    String playersName;
    int computerPick;
    int roundsRequest;
    int roundsCounter = 1;
    List<String> playerResults = new ArrayList<>();


    public void gameLoop(){

        List<String> playerResults = new ArrayList<>();
        System.out.println("Round nr " + roundsCounter);
        System.out.println("Please take your pick: Rock - '1', Paper - '2' or Scissors - '3'");
        playersPick = scanner.nextInt();
        computerPick = randomNumber.nextInt(3);


        if (playersPick == 1 || playersPick == 2 || playersPick == 3) {
            if (playersPick == 1) {
                System.out.println(playersName + "picked: Rock");
            } else if (playersPick == 2) {
                System.out.println(playersName + "picked: Paper");
            } else {
                System.out.println(playersName + "picked: Scissors");
            }

            if (computerPick == 1) {
                System.out.println("Computer picked: Rock");
                if (playersPick == 2) {
                    System.out.println(playersName + "wins this round");
                    playerResults.add("Win");
                } else if (playersPick == 1) {
                    System.out.println("Tie!");
                } else {
                    System.out.println("Computer wins this round!");
                }
            } else if (computerPick == 2) {
                System.out.println("Computer picked: Paper");
                if (playersPick == 1) {
                    System.out.println("Computer wins this round!");
                } else if (playersPick == 2) {
                    System.out.println("Tie!");
                } else {
                    System.out.println(playersName + "wins this round!");
                    playerResults.add("Win");
                }
            } else {
                System.out.println("Computer picked: Scissors");
                if (playersPick == 1) {
                    System.out.println(playersName + "wins this round!");
                    playerResults.add("Win");
                } else if (playersPick == 2) {
                    System.out.println("Computer wins this round!");
                } else {
                    System.out.println("Tie!");
                }
            }
        } else {
            System.out.println("You picked wrong");
            break;
        }




    }


}
