package flight_app.airport;

import flight_app.constructors.Flight;
import flight_app.methods.FlightCounter;

import java.util.ArrayList;

public class FlightsMeter {

    public static void main(String[] args) {

        Flight flight = new Flight.Builder()
                .flightName("X83123")
                .company("Ryan Air")
                .departureCountry("Ro")
                .arrivingCountry("AT")
                .duration(200)
                .departureDate("20/31/2012")
                .passengers(50)
                .build();

        FlightCounter flightCounter = new FlightCounter();

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight);
//        flights.add(flight2);

        flight.flightAnalysis();
//        flightCounter.flightCounter(flights);
        System.out.println(flightCounter.mapFlight(flights));


//        System.out.println(ryanAirPLane.getSeats());
    }

}
