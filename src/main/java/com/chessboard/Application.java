package com.chessboard;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final PieceType type = PieceType.type(scanner.next());
        final char[] position = scanner.next().toCharArray();
        Cell cell = new Cell(position[0], parseInt(valueOf(position[1])));

        final Piece piece = PieceType.createPiece(type);
        System.out.println(piece.possibleMoves(cell));
    }
}

