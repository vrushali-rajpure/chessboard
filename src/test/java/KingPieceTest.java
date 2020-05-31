import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KingPieceTest {

    @Test
    public void shouldReturnPossibleMovesFromGivenPosition() {
        final Piece piece = PieceType.createPiece(PieceType.King);
        final List<Cell> cells = piece.possibleMoves(new Cell('D', 5));

        assertArrayEquals(getExpectedCell(), cells.toArray());
    }

    Cell[] getExpectedCell() {
        return new Cell[] {

            new Cell('C', 4),
            new Cell('C', 5),
            new Cell('C', 6),
            new Cell('D', 4),
            new Cell('D', 6),
            new Cell('E', 4),
            new Cell('E', 5),
            new Cell('E', 6),

        };

    }
}