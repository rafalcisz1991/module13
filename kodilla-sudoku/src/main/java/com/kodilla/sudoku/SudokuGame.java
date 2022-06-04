package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuProcessor theGame = new SudokuProcessor();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
