package com.chessboard.models;

import java.util.ArrayList;
import java.util.List;

public class BishopPiece implements Piece {

    @Override public List<Cell> possibleMoves(Cell currentCell) {
        List<Cell> cells = new ArrayList<>();

        int xIndexDecrementLeft = currentCell.getPositionXIndex();
        int yIndexDecrement = currentCell.getPositionY() - 1;
        while ((xIndexDecrementLeft > 0 && yIndexDecrement > 0)) {
            xIndexDecrementLeft = xIndexDecrementLeft - 1;
            yIndexDecrement = yIndexDecrement - 1;

            final char aChar = getChar(xIndexDecrementLeft);
            cells.add(new Cell(aChar, yIndexDecrement + 1));
        }

        yIndexDecrement = currentCell.getPositionY() - 1;
        int xIndexIncrementRight = currentCell.getPositionXIndex();
        while ((xIndexIncrementRight < 7 && yIndexDecrement - 1 >= 0)) {
            xIndexIncrementRight = xIndexIncrementRight + 1;
            yIndexDecrement = yIndexDecrement - 1;

            final char aChar1 = getChar(xIndexIncrementRight);
            cells.add(new Cell(aChar1, yIndexDecrement + 1));
        }

        int xIndexIncrement = currentCell.getPositionXIndex();
        int xIndexDecrementRight = currentCell.getPositionXIndex();
        int yIndexIncrement = currentCell.getPositionY() - 1;
        while (xIndexIncrement < 7 && yIndexIncrement < 7) {
            xIndexIncrement = xIndexIncrement + 1;
            yIndexIncrement = yIndexIncrement + 1;
            xIndexDecrementRight = xIndexDecrementRight - 1;
            cells.add(new Cell(getChar(xIndexIncrement), yIndexIncrement + 1));
            cells.add(new Cell(getChar(xIndexDecrementRight), yIndexIncrement + 1));

        }

        return cells;
    }

    private char getChar(int xIndexDecrement) {
        return (char) (65 + xIndexDecrement);
    }
}
