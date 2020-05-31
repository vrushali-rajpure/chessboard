package com.chessboard;

import com.chessboard.Cell;
import com.chessboard.Piece;
import com.chessboard.PieceType;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RookPieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Rook);
        final List<Cell> cells = piece.possibleMoves(new Cell('D', 5));

        assertArrayEquals(getExpectedCell(), cells.toArray());
    }

    private Cell[] getExpectedCell() {
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
        };
    }
}