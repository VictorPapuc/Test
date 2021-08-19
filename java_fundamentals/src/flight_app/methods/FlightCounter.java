package flight_app.methods;

import flight_app.constructors.Flight;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FlightCounter {


    public void flightRe(List<Flight> availableFlight) {
        ArrayList<Flight> flights = new ArrayList<>(availableFlight);

    }

    public Map<Integer, String> mapFlight(List<Flight> flightNumbers) {
        Map<Integer, String> mapFlight = new LinkedHashMap<>();

        for (int i = 0; i < flightNumbers.size(); i++) {
            mapFlight.put(i + 1, flightNumbers.get(i).getFlightName());
        }

        return mapFlight;
    }

//    public void flightAnalysis(List<Flight> availableFlights) {
//        for (Flight flight :
//                availableFlights) {
//            System.out.println("Flight " + flight.flightName + " has " + flight.passengers.() + " seats" + " with the number of " + flight.passenger + " passengers");
//        }
//    }
}
