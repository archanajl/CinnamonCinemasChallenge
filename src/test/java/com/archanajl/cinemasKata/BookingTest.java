package com.archanajl.cinemasKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


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
        Seating seatPlan = new Seating(3,5);
        Assertions.assertTrue(seatPlan.isSeatsAvailable());
    }
}
