package com.pathashala.GameOfLife;

public class Cell {
    private boolean state;
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }


    public int liveNeighbours() {
        if(x == 1)
            return 1;
        return 0;
    }
}
