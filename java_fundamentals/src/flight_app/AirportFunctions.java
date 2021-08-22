package flight_app;

public interface AirportFunctions {

    void flyFrom(String airport);

    void flyTo(String airport);

    default void flightCleared() {
        System.out.println("Flight is in order");
    }

}
