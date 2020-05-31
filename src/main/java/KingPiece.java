import java.util.ArrayList;
import java.util.List;

public class KingPiece implements Piece {
    @Override public List<Cell> possibleMoves(Cell currentCell) {

        List<Cell> cells = new ArrayList<>();
        final int xIndex = currentCell.getPositionXIndex() ;
        final int yIndex = currentCell.getPositionY() - 1;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {

                if (Math.max(Math.abs(i - xIndex), Math.abs(j - yIndex)) == 1)
                    cells.add(new Cell((char) (65 + i), j+1));

            }
        }
        return cells;
    }
}
