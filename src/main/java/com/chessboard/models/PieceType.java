package com.chessboard.models;

import java.util.Arrays;

public enum PieceType {
    King, Queen, Bishop, Horse, Rook, Pawn;

    static public PieceType type(String typeStr) {
        return Arrays
            .stream(PieceType.values())
            .filter(type -> type.toString().equalsIgnoreCase(typeStr))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("com.chessboard.models.Piece type is invalid "));
    }

    static public Piece createPiece(PieceType type) {
        switch (type) {

            case King:
                return new KingPiece();
            case Queen:
                return new QueenPiece();
            case Bishop:
                return new BishopPiece();
            case Horse:
                return new HorsePiece();
            case Rook:
                return new RookPiece();
            case Pawn:
                return new PawnPiece();
        }
        return null;
    }
}
