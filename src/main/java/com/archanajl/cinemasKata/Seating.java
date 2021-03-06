package com.archanajl.cinemasKata;

import java.util.Arrays;

public class Seating {

    private int[][] seating;
    private int availableSeats;
    private int filledSeats;
    private int numRow ;
    private int numColumn;

    public Seating(int[][] seats){
        this.numRow = seats.length;
        this.numColumn = seats[0].length;
        this.seating = seats;
        this.setEmptySeating();
        this.availableSeats = numRow * numColumn;
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

    public String allocateSeats(int numSeats, int[][] seats){
        int rowIndex = 0;
        int columnIndex = 0;
        String seatsAllocated ="";
        SeatNumber seatNumber = new SeatNumber();
        if (isSeatsAvailable(numSeats)){
            rowIndex = this.filledSeats / numColumn ;
            columnIndex = this.filledSeats % numColumn ;
            for (int i=0; i<= numSeats-1; i++){
                seats[rowIndex][columnIndex] = 1;
                seatsAllocated += seatNumber.generateSeatNumber(rowIndex,columnIndex) + ",";
                this.availableSeats--;
                this.filledSeats++;
                if (columnIndex == numColumn-1) {
                    columnIndex= 0;
                    rowIndex++;
                }
                else columnIndex++;
            }
        }else{
            seatsAllocated = "Not Enough.";
        }

        setSeating(seats);
        return seatsAllocated;
    }

    public boolean isSeatsAvailable(int numSeats){
        return (this.availableSeats >= numSeats);
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
