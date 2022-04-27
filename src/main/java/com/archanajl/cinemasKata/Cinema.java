package com.archanajl.cinemasKata;

public class Cinema {

    private int rows;
    private int seats;
    private Seating seating;

    public Cinema(int rows, int seats){
        this.rows = rows;
        this.seats = seats;
        this.seating = new Seating(rows,seats);
    }

    public Seating getSeating() {
        return seating;
    }

    

}
