package com.chessboard.models;

import java.util.List;

public interface Piece {

    public List<Cell> possibleMoves(Cell currentCell);
}
