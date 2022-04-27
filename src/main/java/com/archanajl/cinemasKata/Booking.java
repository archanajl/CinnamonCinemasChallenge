package com.archanajl.cinemasKata;

public class Booking {

    int[][] seats ;
    Cinema cinema;

    public Booking(Cinema cinema){

        this.cinema = cinema;
        seats = cinema.getSeating();

    }

    public String getSeatingPlan(){

        StringBuilder seatingPlan = new StringBuilder();
        SeatNumber sN = new SeatNumber();
        for (int i=0; i<= seats.length -1; i++){
            for (int j=0; j<= seats[i].length -1;j++){
                    seatingPlan.append(sN.getSeatNumber(i,j) + " " );
            }
            seatingPlan.append(System.lineSeparator());
            for (int j=0; j<= seats[i].length-1;j++){
                if (seats[i][j] != 0){
                    seatingPlan.append(" B " );
                }else{
                    seatingPlan.append(" - " );
                }
            }
            seatingPlan.append(System.lineSeparator());
        }
        return seatingPlan.toString();

    }

    public String allocateSeats(int numSeats){
        String AllocatedSeats = cinema.allocateSeats(numSeats);
        if (AllocatedSeats != ""){
            AllocatedSeats = AllocatedSeats.substring(0,AllocatedSeats.length()-1);
        }
        return AllocatedSeats;
    }

}
