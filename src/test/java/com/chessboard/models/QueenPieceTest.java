package com.chessboard.models;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QueenPieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Queen);
        final List<Cell> cells = piece.possibleMoves(new Cell('D', 5));

        assertArrayEquals(getExpectedCell(), cells.toArray());
    }

    Cell[] getExpectedCell() {
        return new Cell[] {

            new Cell('A', 5),
            new Cell('B', 5),
            new Cell('C', 5),
            new Cell('E', 5),
            new Cell('F', 5),
            new Cell('G', 5),
            new Cell('H', 5),

            new Cell('D', 1),
            new Cell('D', 2),
            new Cell('D', 3),
            new Cell('D', 4),
            new Cell('D', 6),
            new Cell('D', 7),
            new Cell('D', 8),

            new Cell('C', 4),
            new Cell('B', 3),
            new Cell('A', 2),
            new Cell('E', 4),
            new Cell('F', 3),
            new Cell('G', 2),
            new Cell('H', 1),

            new Cell('E', 6),
            new Cell('C', 6),
            new Cell('F', 7),
            new Cell('B', 7),
            new Cell('G', 8),
            new Cell('A', 8),

        };

    }
}