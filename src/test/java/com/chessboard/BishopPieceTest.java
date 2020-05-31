package com.chessboard;

import com.chessboard.Cell;
import com.chessboard.Piece;
import com.chessboard.PieceType;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BishopPieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Bishop);
        final List<Cell> cells = piece.possibleMoves(new Cell('D', 5));

        assertArrayEquals( getExpectedCell(),cells.toArray());
    }

    private Cell[] getExpectedCell() {
        return new Cell[] {
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