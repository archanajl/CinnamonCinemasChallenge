package com.archanajl.cinemasKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BookingTest {

    Booking booking;
    @BeforeEach
    public void setUp() {
        booking = new Booking(new Cinema(3,5));
    }

    @Test
    public void checkgetSeatingPlan(){
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n -  -  -  -  - \nB0 B1 B2 B3 B4 \n -  -  -  -  - \nC0 C1 C2 C3 C4 \n -  -  -  -  - \n";
        Assertions.assertEquals( expected,actual);
    }

    @Test
    public void checkisSeatsAvailable(){
        int[][] seats = new int[3][5];
        Seating seatPlan = new Seating(seats);
        Assertions.assertTrue(seatPlan.isSeatsAvailable(2));
    }

    @Test
    public void checkAllocatedSeats(){
        String strAllocated = booking.allocateSeats(2);
        Assertions.assertEquals("A0,A1",strAllocated);
    }

    @Test
    public void checkgetSeatingPlanAfterAllocating(){

        String strAllocated = booking.allocateSeats(2);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n B  B  -  -  - \nB0 B1 B2 B3 B4 \n -  -  -  -  - \nC0 C1 C2 C3 C4 \n -  -  -  -  - \n";
        Assertions.assertEquals( expected,actual);

    }

    @Test
    public void checkAllocatedSeatsMoreThanThree(){
        String strAllocated = booking.allocateSeats(5);
        Assertions.assertEquals("Please enter valid number of seats(1,2 0r 3).",strAllocated);
    }

    @Test
    public void checkgetSeatingPlanAfterAllocatingMoreThanThree(){

        String strAllocated = booking.allocateSeats(5);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n -  -  -  -  - \nB0 B1 B2 B3 B4 \n -  -  -  -  - \nC0 C1 C2 C3 C4 \n -  -  -  -  - \n";
        Assertions.assertEquals( expected,actual);

    }

    @Test
    public void checkgetSeatingPlanAfterAllocatingTwoTimes(){
        String strAllocated ="";
        strAllocated = booking.allocateSeats(2);
        strAllocated = booking.allocateSeats(3);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n B  B  B  B  B \nB0 B1 B2 B3 B4 \n -  -  -  -  - \nC0 C1 C2 C3 C4 \n -  -  -  -  - \n";
        Assertions.assertEquals( expected,actual);

    }

    @Test
    public void checkgetSeatingPlanAfterAllocating3TwoTimesNextRow(){

        String strAllocated1 = booking.allocateSeats(3);
        String strAllocated2 = booking.allocateSeats(3);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n B  B  B  B  B \nB0 B1 B2 B3 B4 \n B  -  -  -  - \nC0 C1 C2 C3 C4 \n -  -  -  -  - \n";
        Assertions.assertEquals( expected,actual);

    }

    @Test
    public void checkgetSeatingPlanAfterAllocatingAllSeats(){
        String strAllocated ="";
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n B  B  B  B  B \nB0 B1 B2 B3 B4 \n B  B  B  B  B \nC0 C1 C2 C3 C4 \n B  B  B  B  B \n";
        Assertions.assertEquals( expected,actual);

    }

    @Test
    public void checkallocateSeatsMoreThanAllSeats(){
        String strAllocated ="";
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        strAllocated = booking.allocateSeats(3);
        String actual = booking.getSeatingPlan();
        String expected = "A0 A1 A2 A3 A4 \n B  B  B  B  B \nB0 B1 B2 B3 B4 \n B  B  B  B  B \nC0 C1 C2 C3 C4 \n B  B  B  B  B \n";
        Assertions.assertEquals( expected,actual);
        Assertions.assertEquals("3 seat/seats not available to be booked.",strAllocated);
    }
}

