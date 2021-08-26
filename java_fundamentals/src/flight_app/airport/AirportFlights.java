package flight_app.airport;

import flight_app.flight_type.CargoAirport;
import flight_app.flight_type.Flight;
import flight_app.flight_type.PassengerFlight;
import flight_app.flightcompanies.Company;

import java.util.ArrayList;

public class AirportFlights {

    PassengerFlight flight = new PassengerFlight.Builder()
            .Name(Company.RYAN_AIR.getCompany())
            .company(Company.RYAN_AIR.getCompany())
            .departureCountry("Ro")
            .arrivingCountry("AT")
            .duration(200)
            .departureDate("20/31/2012")
            .passengers(50)
            .build();


    CargoAirport cargoFlight = new CargoAirport.Builder()
            .flightName("X83123")
            .company("Ryan Air")
            .departureCountry("Ro")
            .arrivingCountry("AT")
            .duration(200)
            .departureDate("20/31/2012")
            .build();

    public void sss() {
        addFlights(cargoFlight);
        addFlights(flight);
        ArrayList<Flight> ss = new ArrayList<>();

    }

    private ArrayList<Flight> addFlights(Flight flight) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight);
        return flights;
    }
}