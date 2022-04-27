package com.archanajl.cinemasKata;

public class SeatNumber {

    private String seatNumber ;
    String[] rowName = {"A","B","C"};

    public SeatNumber(){

    }

    public String getSeatNumber(int row, int column) {
        this.seatNumber = rowName[row] + column;
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

}
