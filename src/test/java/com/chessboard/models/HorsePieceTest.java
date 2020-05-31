package com.chessboard.models;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HorsePieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Horse);
        final List<Cell> cells = piece.possibleMoves(new Cell('E', 3));

        assertArrayEquals(getExpectedCell(), cells.toArray());
    }

    @Test
    public void shouldNotIncludeInvalidMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Horse);
        final List<Cell> cells = piece.possibleMoves(new Cell('G', 2));

        final Cell[] expectedCells = {
            new Cell('H', 4),
            new Cell('E', 1),
            new Cell('E', 3),
            new Cell('F', 4),
        };
        assertArrayEquals(expectedCells, cells.toArray());
    }

    private Cell[] getExpectedCell() {
        return new Cell[] {
            new Cell('F', 5),
            new Cell('G', 4),
            new Cell('G', 2),
            new Cell('F', 1),
            new Cell('D', 1),
            new Cell('C', 2),
            new Cell('C', 4),
            new Cell('D', 5),
        };
    }

}