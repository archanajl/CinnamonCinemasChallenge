package com.archanajl.cinemasKata;

public class SeatNumber {

    private String seatNumber ;
    String[] rowName = {"A","B","C"};

    public String generateSeatNumber(int row, int column) {
        this.seatNumber = rowName[row] + (column+1);
        return seatNumber;
    }

}
