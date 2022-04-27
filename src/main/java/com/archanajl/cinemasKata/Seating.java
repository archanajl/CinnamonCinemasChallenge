package com.archanajl.cinemasKata;

import java.util.Arrays;

public class Seating {

    private int[][] seating;
    private int availableSeats;
    private int filledSeats;

    public Seating(int rows,int seats){
        this.seating = new int[rows][seats];
        this.setEmptySeating();
        this.availableSeats = rows * seats;
        this.filledSeats =0;
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

    public void allocateSeats(int numSeats){

    }

    public boolean isSeatsAvailable(){
        return (this.availableSeats > 0);
    }

}
