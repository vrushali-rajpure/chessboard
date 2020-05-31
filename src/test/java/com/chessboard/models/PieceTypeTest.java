package com.chessboard.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PieceTypeTest {

    @Test
    public void shouldReturnMatchingPieceType() {
        assertEquals(PieceType.type("King"), PieceType.King);
    }

    @Test
    public void shouldReturnMatchingPieceTypeInCaseInsensitiveManner() {
        assertEquals(PieceType.type("QUEEN"), PieceType.Queen);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionIfNoMatchingTypeFound() {
        PieceType.type("test");
    }

    @Test
    public void shouldCreatePieceOfGivenPieceType() {
        assertEquals(KingPiece.class, PieceType.createPiece(PieceType.King).getClass());
        assertEquals(QueenPiece.class, PieceType.createPiece(PieceType.Queen).getClass());
        assertEquals(BishopPiece.class, PieceType.createPiece(PieceType.Bishop).getClass());
        assertEquals(HorsePiece.class, PieceType.createPiece(PieceType.Horse).getClass());
        assertEquals(RookPiece.class, PieceType.createPiece(PieceType.Rook).getClass());
        assertEquals(PawnPiece.class, PieceType.createPiece(PieceType.Pawn).getClass());
    }
}