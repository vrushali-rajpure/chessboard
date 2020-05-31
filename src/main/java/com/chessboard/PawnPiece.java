package com.chessboard;

import java.util.ArrayList;
import java.util.List;

public class PawnPiece implements Piece {
    @Override public List<Cell> possibleMoves(Cell currentCell) {
        List<Cell> cells = new ArrayList<>();
        final int xIndex = currentCell.getPositionXIndex();
        final int yIndex = currentCell.getPositionY() - 1;

        if (xIndex < 8 && yIndex < 8) {
            final int positionY = yIndex + 2;
            final char x = (char) (65 + xIndex + 1);

            cells.add(new Cell(currentCell.getPositionX(), positionY));
            cells.add(new Cell(x, positionY));
        }

        return cells;
    }
}
