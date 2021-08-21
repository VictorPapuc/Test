package flight_app.methods;

import flight_app.flight_type.Flight;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FlightCounter {

    public static int howManyFlightFlew = 0;

    public Map<Integer, String> mapFlight(List<Flight> flightNumbers) {
        Map<Integer, String> mapFlight = new LinkedHashMap<>();


        for (int i = 0; i < flightNumbers.size(); i++) {
            mapFlight.put(i + 1, "flightNumbers.get(i)");
            FlightCounter.counter();
        }

        return mapFlight;
    }

    static void counter() {
        FlightCounter.howManyFlightFlew += 1;
    }
}
