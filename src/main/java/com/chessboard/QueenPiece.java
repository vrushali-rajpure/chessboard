package com.chessboard;

import java.util.ArrayList;
import java.util.List;

public class QueenPiece implements Piece {
    @Override public List<Cell> possibleMoves(Cell currentCell) {

        List<Cell> moves =
            new ArrayList<>(PieceType.createPiece(PieceType.Rook).possibleMoves(currentCell));

        moves.addAll(PieceType.createPiece(PieceType.Bishop).possibleMoves(currentCell));
        return moves;
    }
}
