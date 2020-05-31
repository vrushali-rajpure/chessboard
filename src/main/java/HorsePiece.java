import java.util.ArrayList;
import java.util.List;

public class HorsePiece implements Piece {
    @Override public List<Cell> possibleMoves(Cell currentCell) {
        int[][] possibleMoveOffset = {
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1},
            {-2, 1},
            {-1, 2},
        };

        final int xIndex = currentCell.getPositionXIndex() ;
        final int yIndex = currentCell.getPositionY() - 1;

        List<Cell> cells = new ArrayList<>();
        for (int[] offset : possibleMoveOffset) {

            int xIndexOffset = xIndex + offset[0];
            int yIndexOffset = yIndex + offset[1];

            final char x = (char) (65 + xIndexOffset);

            final Cell possibleMoveCell = new Cell(x, yIndexOffset + 1);
            if (possibleMoveCell.isValidPosition()) {
                cells.add(possibleMoveCell);
            }

        }
        return cells;
    }
}
