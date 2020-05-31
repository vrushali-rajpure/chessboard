import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChessBoard {

    static List<Character> xCells = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
    private Cell[][] cells;

    ChessBoard() {
        cells = new Cell[8][8];
        for (int i = 0; i < 8; i++) {
            final Character x = xCells.get(i);
            cells[i] = new Cell[8];
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell(x, j + 1);
            }
        }
    }

    Optional<Integer> getCellXIndex(Cell cell) {
        for (int i = 0; i < cells.length - 1; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == cell) {
                    return Optional.of(i);
                }
            }
        }
        return Optional.empty();
    }

    Optional<Integer> getCellYIndex(Cell cell) {
        for (int i = 0; i < cells.length - 1; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == cell) {
                    return Optional.of(j);
                }
            }
        }
        return Optional.empty();
    }
}
