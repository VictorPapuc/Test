package flight_app.airport;

import flight_app.flight_type.CargoFlight;
import flight_app.flight_type.Flight;
import flight_app.flight_type.PassengerFlight;
import flight_app.methods.FlightCounter;

import java.util.ArrayList;

public class FlightsMeter {

    public static void main(String[] args) {

        FlightCounter flightCounter = new FlightCounter();

        PassengerFlight flight = new PassengerFlight.Builder()
                .Name("X83123")
                .company("Ryan Air")
                .departureCountry("Ro")
                .arrivingCountry("AT")
                .duration(200)
                .departureDate("20/31/2012")
                .passengers(50)
                .build();

        CargoFlight cargoFlight = new CargoFlight.Builder()
                .flightName("X83123")
                .company("Ryan Air")
                .departureCountry("Ro")
                .arrivingCountry("AT")
                .duration(200)
                .departureDate("20/31/2012")
                .passengers(50)
                .build();

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight);
        flights.add(cargoFlight);

        System.out.println();

        System.out.println("Airport Flights");
        System.out.println(flightCounter.mapFlight(flights));
    }

}
