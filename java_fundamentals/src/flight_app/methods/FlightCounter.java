package flight_app.methods;

import flight_app.flight_type.Flight;
import flight_app.flight_type.PassengerFlight;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FlightCounter {

    public void flightRe(List<PassengerFlight> availableFlight) {
        ArrayList<Flight> flights = new ArrayList<>(availableFlight);

    }

    public Map<Integer, String> mapFlight(List<Flight> flightNumbers) {
        Map<Integer, String> mapFlight = new LinkedHashMap<>();

        for (int i = 0; i < flightNumbers.size(); i++) {
            mapFlight.put(i + 1, "flightNumbers.get(i)");
        }

        return mapFlight;
    }

//    public Map<Integer, String> mapFlight(List<CargoFlight> flightNumbers) {
//        Map<Integer, String> mapFlight = new LinkedHashMap<>();
//        for (int i = 0; i < flightNumbers.size(); i++) {
//            mapFlight.put(i + 1, flightNumbers.get(i).getFlightName());
//        }
//        return mapFlight;
//    }
}
