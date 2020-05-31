package com.chessboard;

import com.chessboard.Cell;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnIntValueForXPosition() {
        Cell cell = new Cell('D', 1);
        assertEquals(3, cell.getPositionXIndex());
    }

    @Test
    public void shouldReturnTrueIfCellIsValid() {
        Cell cell = new Cell('A', 1);
        assertTrue(cell.isValidPosition());

        cell = new Cell('H', 8);
        assertTrue(cell.isValidPosition());
    }

    @Test
    public void shouldReturnFalseIfCellIsInValid() {
        Cell cell = new Cell('I', 1);
        assertFalse(cell.isValidPosition());

        cell = new Cell('D', 9);
        assertFalse(cell.isValidPosition());

    }
}