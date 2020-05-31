package com.chessboard.models;

import java.util.Objects;

public class Cell {

    private char positionX;
    private int positionY;

    public Cell(char positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    boolean isValidPosition() {

        return (getPositionY() >= 1 && getPositionY() <= 8) &&
            (getPositionX() >= 'A' && getPositionX() <= 'H');
    }

    public int getPositionXIndex() {
        return (positionX - 'A');
    }

    public int getPositionY() {
        return positionY;
    }

    public char getPositionX() {
        return positionX;
    }

    @Override public String toString() {
        return "{" + positionX + " " + positionY + "}";
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cell cell = (Cell) o;
        return getPositionX() == cell.getPositionX() &&
            getPositionY() == cell.getPositionY();
    }

    @Override public int hashCode() {
        return Objects.hash(getPositionX(), getPositionY());
    }
}
