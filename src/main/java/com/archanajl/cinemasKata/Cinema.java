package com.archanajl.cinemasKata;

public class Cinema {

    private int rows;
    private int seats;
    private Seating seating;
    private int availableSeats;
    private int filledSeats;

    public Cinema(int rows, int seats){
        this.rows = rows;
        this.seats = seats;
        this.seating = new Seating(rows,seats);
        this.availableSeats = rows * seats;
        this.filledSeats =0;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Seating getSeating() {
        return seating;
    }
}
