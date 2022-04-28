package com.archanajl.cinemasKata;

public class Cinema {

    private int rows;
    private int columns;
    private Seating seating;
    private int[][] seatingPlan;

    public Cinema(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.seatingPlan = new int[rows][columns];
        this.seating = new Seating(seatingPlan);
    }

    public int[][] getSeating() {
        return this.seating.getSeating();
    }

    public String allocateSeats(int numSeats){
        return seating.allocateSeats(numSeats, getSeating());
    }

    public int getAvailableSeats(){
        return seating.getAvailableSeats();
    }
}
