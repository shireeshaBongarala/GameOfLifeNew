package com.pathashala.GameOfLife;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CellTest {
    @Test
    public void testToCheckTheStateOfACell(){
        Cell cell = new Cell(0,0);
        cell.setState(true);

        boolean actualState = true;

        assertThat(actualState, is(cell.getState()));
    }

    @Test
    public void testToCheckTheNumberOfLiveNeighboursOfTheCellIsZero(){
        Cell cell = new Cell(0,0);

        int actualLiveNeighbours = 0;

        assertThat(actualLiveNeighbours,is(cell.liveNeighbours()));
    }
    @Test
    public void testToCheckTheNumberOfLiveNeighboursOfTheCellIsNotZero() {
        Cell cell = new Cell(1,1);

        int actualLiveNeighbours = 1;
        assertThat(actualLiveNeighbours,is(cell.liveNeighbours()));
    }

}
