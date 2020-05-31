package com.chessboard;

import com.chessboard.Cell;
import com.chessboard.Piece;
import com.chessboard.PieceType;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PawnPieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.Pawn);
        final List<Cell> cells = piece.possibleMoves(new Cell('D', 5));

        assertArrayEquals(getExpectedCell(), cells.toArray());
    }

    private Cell[] getExpectedCell() {
        return new Cell[] {
            new Cell('D', 6),
            new Cell('E', 6),
        };
    }
}