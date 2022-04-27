package com.archanajl.cinemasKata;

import java.util.Arrays;

public class Seating {

    private int[][] seating;
    private int availableSeats;
    private int filledSeats;
    private int numRow ;
    private int numColumn;

    public Seating(int rows,int seats){
        this.numRow = rows;
        this.numColumn = seats;
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

    public String allocateSeats(int numSeats){
        int rowIndex = 0;
        int columnIndex = 0;
        String seatsAllocated ="";
        SeatNumber sN = new SeatNumber();
        if (isSeatsAvailable(numSeats)){
            rowIndex = this.filledSeats / numRow ;
            columnIndex = this.filledSeats % numColumn ;
            for (int i=0; i<= numSeats-1; i++){
                this.seating[rowIndex][columnIndex] = 1;
                seatsAllocated += sN.getSeatNumber(rowIndex,columnIndex) + ",";
                this.availableSeats--;
                this.filledSeats++;
                if (columnIndex == numColumn) {
                    columnIndex= 0;
                    rowIndex++;
                }
                else columnIndex++;
            }
        }
        return seatsAllocated;
    }

    public boolean isSeatsAvailable(int numSeats){
        return (this.availableSeats > numSeats);
    }

}
