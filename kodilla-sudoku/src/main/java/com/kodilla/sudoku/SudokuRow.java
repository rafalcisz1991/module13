package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {

    private final ArrayList<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i < 9; i++){
            sudokuElements.add(i, new SudokuElement());
        }
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
