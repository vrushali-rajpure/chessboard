package com.chessboard.models;

import java.util.ArrayList;
import java.util.List;

public class RookPiece implements Piece {
    @Override public List<Cell> possibleMoves(Cell currentCell) {
        List<Cell> cells = new ArrayList<>();
        final int xIndex = currentCell.getPositionXIndex();
        final int yIndex = currentCell.getPositionY() - 1;

        for (int i = 0; i <= 7; i++) {
            final char positionX = (char) (65 + i);
            if (positionX != currentCell.getPositionX()) {
                cells.add(new Cell(positionX, yIndex + 1));
            }

        }
        for (int j = 1; j <= 8; j++) {
            if (j != currentCell.getPositionY()) {
                cells.add(new Cell((char) (65 + xIndex), j));
            }

        }

        return cells;
    }
}
