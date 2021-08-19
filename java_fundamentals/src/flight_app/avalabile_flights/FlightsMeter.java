package flight_app.avalabile_flights;

import constructors.Flight;

public class FlightsMeter {

    public static void main(String[] args) {

        Flight flight1 = new Flight();
        Flight flight2 = new Flight("Lufthansa", 100, 100);

        flight1.flightAnalysis();
        flight2.flightAnalysis();
    }

}
