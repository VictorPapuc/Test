package constructors;

import gettersetters.PlaneSeats;

public class Flight {

    String flightName;
    int passenger;
    private PlaneSeats seats = new PlaneSeats();


    //parameter constructor
    public Flight(String flightName, int passenger, int seats) {
        this.flightName = flightName;
        this.passenger = passenger;
        this.seats.setSeats(seats);
    }

    //default Constructor
    public Flight() {
        this.flightName = "Name was Not given";
        this.passenger = 0;
        seats.setSeats(0);
    }

    public void flightAnalysis() {
        System.out.println("Flight " + this.flightName + " has " + this.seats.getSeats() + " seats" + " with the number of " + this.passenger + " passengers");
    }

}
