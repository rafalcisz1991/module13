package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Loop {

    Scanner scanner = new Scanner(System.in);
    Random randomNumber = new Random();
    private boolean end;
    private int playersPick;
    private String playersName;
    private int computerPick;
    private int roundsRequest;
    private int roundsCounter = 0;
    List<String> playerResults = new ArrayList<>();
    private String endGame;

    public List<String> getPlayerResults() {
        return playerResults;
    }
    public String getPlayersName() {
        return playersName;
    }
    public boolean isEnd() {
        return end;
    }

    public int getRoundsRequest() {
        return roundsRequest;
    }

    public void initialValues() {
        System.out.println("To begin playing Rock,Paper,Scissors - please state your name:");
        playersName = scanner.nextLine();
        System.out.println(" and a duration of the game - number of rounds: ");
        roundsRequest = scanner.nextInt();
        System.out.println("In order to pick the following, please press appropriate keyboard button:");
        System.out.println("'1' for Rock");
        System.out.println("'2' for Paper");
        System.out.println("'3' for Scissors");
    }

    public void gameLoop() {
        roundsCounter++;
        System.out.println("Round nr " + roundsCounter);
        System.out.println("Please take your pick: Rock - '1', Paper - '2' or Scissors - '3'");
        playersPick = scanner.nextInt();
        computerPick = randomNumber.nextInt(3) + 1;

        if (playersPick == 1 || playersPick == 2 || playersPick == 3) {
            if (playersPick == 1) {
                System.out.println(playersName + " picked: Rock");
            } else if (playersPick == 2) {
                System.out.println(playersName + " picked: Paper");
            } else {
                System.out.println(playersName + " picked: Scissors");
            }

            if (computerPick == 1) {
                System.out.println("Computer picked: Rock");
                if (playersPick == 2) {
                    System.out.println(playersName + " wins this round");
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
                    System.out.println(playersName + " wins this round!");
                    playerResults.add("Win");
                }
            } else {
                System.out.println("Computer picked: Scissors");
                if (playersPick == 1) {
                    System.out.println(playersName + " wins this round!");
                    playerResults.add("Win");
                } else if (playersPick == 2) {
                    System.out.println("Computer wins this round!");
                } else {
                    System.out.println("Tie!");
                }
            }
        }
    }

    public void countingRounds() {

        //Assessing, whether player wants to continue the game after the last round
        if (roundsCounter < roundsRequest) {
            System.out.println("Prepare for the next round");
        } else {
            System.out.println("Decide, whether you want to terminate or continue: 'x' for termination," +
                    " 'n' for re-launching the game for the same amount of rounds");
            scanner.nextLine();
            endGame = scanner.nextLine();
            if (endGame.equals("x")) {
                System.out.println("You chose to end the game");
                end = true;
            } else if (endGame.equals("n")) {
                System.out.println("You chose to play again");
                end = false;
            }
        }
    }
}


