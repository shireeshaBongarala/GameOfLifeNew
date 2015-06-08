package com.pathashala.GameOfLife;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CellTest {
    @Test
    public void testToCheckTheStateOfACell(){
        Cell cell = new Cell();
        cell.setState(true);

        boolean actualState = true;

        assertThat(actualState, is(cell.getState()));
    }

}
