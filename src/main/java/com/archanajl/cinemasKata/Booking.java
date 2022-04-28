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
                    seatingPlan.append(sN.assignSeatNumber(i,j) + " " );
            }
            seatingPlan.deleteCharAt(seatingPlan.length()-1);
            seatingPlan.append(System.lineSeparator());
            for (int j=0; j<= seats[i].length-1;j++){
                if (seats[i][j] != 0){
                    seatingPlan.append(" B " );
                }else{
                    seatingPlan.append(" - " );
                }
            }
            seatingPlan.deleteCharAt(seatingPlan.length()-1);
            seatingPlan.append(System.lineSeparator());
        }
        return seatingPlan.toString();

    }

    public String allocateSeats(int numSeats) {

        if (numSeats <= 3) {
            String AllocatedSeats = cinema.allocateSeats(numSeats);
            if (AllocatedSeats != "") {
                if (AllocatedSeats == "Not Enough.") return "Sorry! Not enough seats available for " + numSeats + ".";
                else{
                    AllocatedSeats = AllocatedSeats.substring(0, AllocatedSeats.length() - 1);
                    return AllocatedSeats;
                }
            }
        }
        return "Please enter valid number of seats(1,2 0r 3).";
    }

    public String allocateAllSeatsRandom(){
        String AllocatedSeats ="";
        int randomNumSeats;
        while(cinema.getAvailableSeats() != 0){
            randomNumSeats = 1 + (int)(Math.random()*3);
            AllocatedSeats = cinema.allocateSeats(randomNumSeats);
        }
        return getSeatingPlan();
    }
}

