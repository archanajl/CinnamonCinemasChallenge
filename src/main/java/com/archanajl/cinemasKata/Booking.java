package com.archanajl.cinemasKata;

public class Booking {

    int[][] seats ;
    Cinema cinema;

    public Booking(Cinema cinema){

        this.cinema = cinema;
        Seating seating = cinema.getSeating();
        seats = seating.getSeating();
    }

    public String getSeatingPlan(){
        return "";
    }
}
