package com.archanajl.cinemasKata;

import java.util.Arrays;

public class Seating {

    private int[][] seating;

    public Seating(int rows,int seats){
        this.seating = new int[rows][seats];
        this.setEmptySeating();
    }

    private void setEmptySeating(){
        for (int[] row: this.seating)
            Arrays.fill(row, 0);
    }

    public int[][] getSeating() {
        return seating;
    }

    public void setSeating(int[][] seating) {
        this.seating = seating;
    }



}
