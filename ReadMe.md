# _Cinnamon Cinemas Challenge_

### <ins>Goal of the application</ins>

Cinnamon Cinemas Challenge manages the booking of seats for your favorite cinema. 

### <ins>Cinnamon Cinemas Business Requirements</ins>

The Cinnamon Cinemas Movie Theatre has 15 seats, arranged in 3 rows of 5
 - Rows are assigned a letter from A to C
 - Seats are assigned a number from 1 to 5
 - We can briefly summarize the scoring for this form of bowling:

### <ins>User Story</ins>

As a Cinnamon Cinemas Movie Theatre Manager
    I want to allocate seats to customers so that I can control reserved seating for the theatre
    
- GIVEN a customer wants to request some tickets 
- WHEN they request a number of seats between 1 and 3 for a movie 
- THEN the customer should be allocated the required number of seats from the available seats on the seating plan 
- AND the seats should be recorded as allocated

### <ins>Acceptance Criteria and Assumptions</ins>

Write a program that allocates seats based on a random integer “number of seats” between 1 and 3

 - Your program should allocate the required number of seats from the available seats starting from seat A1 and filling the auditorium from
    left to right, front to back 
 - All of the seats are available for sale when the program starts
    The program should continue to allocate a random number of seats until it finds there are not enough seats left to complete the request
 - Once there are not enough seats available to be allocated then the program can halt

### <ins>Key Features of the application</ins>

The application allocates the seats from 1 to 3 in an ordered fashion until all seats are allocated.

### <ins>Approach to the solution</ins>

- Step One:

As it is a TDD based application, I started off by writing a basic structure. Written a test case to return a string 
to display the seating.Tests written and checked to pass(RED -> GREEN).

- Step Two:
  
Display the seating plan. Right now it will display everything as empty as the logic has not yet implemented. It is shown
as below:
A1 A2 A3 A4 A5
 -  -  -  -  - 
B1 B2 B3 B4 B5
 -  -  -  -  - 
C1 C2 C3 C4 C5
 -  -  -  -  - 

Tests written and checked to pass(RED -> GREEN).

- Step Three:

Check whether there are seats to be allocated. Tests written and checked to pass(RED -> GREEN).

- Step Four:

Validate the number of seats to be allocated. - should be 1, 2 or 3. Tests written and checked to pass(RED -> GREEN).

- Step Five:

Method to allocate the seats. Tests written and checked to pass(RED -> GREEN). 
For example, if we allocate three seats, it is displayed as:

A1 A2 A3 A4 A5
 B  B  B  -  - 
B1 B2 B3 B4 B5
 -  -  -  -  - 
C1 C2 C3 C4 C5
 -  -  -  -  - 


- Step Six:

Stop allocating once all the tickets are booked. Tests written and checked to pass(RED -> GREEN)

- Step Seven:
  
Display the seating plan after allocating and check whether it is done properly.

- Step Eight:

Method to randomly assign all the seats and display the seating plan.

- Step Nine:

Included parameterized tests to check the methods.

### <ins> To improve </ins>
 
- Include the console display to get the input from the user and modify the seating plan display to look better.

- Customize the size of the seating plan and seat number display by getting it from the user.

- Add tests for all the methods so that it can be tested individually before integrating

### <ins> Testcases </ins>

Please click [here](https://htmlpreview.github.io/?https://github.com/archanajl/CinnamonCinemasChallenge/blob/master/docs/Test%20Results%20-%20BookingTest.html) to see the test results.
### <ins>Technologies Used</ins>

    Java
    maven
    JUnit 5

### <ins>How to run the application and tests</ins>

To run the tests, use the following command:

    mvn test
    
