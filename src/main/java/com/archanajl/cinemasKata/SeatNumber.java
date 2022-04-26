package com.archanajl.cinemasKata;

public class SeatNumber {

    private String seatNumber ;
    String[] rowName = {"A","B","C"};

    public SeatNumber(int row, int column){
        this.seatNumber = rowName[row] + column;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

}
