package flight_app.flight_type;

import flight_app.AirportFunctions;
import flight_app.plane.Plane;

public class CargoFlight extends Flight implements AirportFunctions {

    private Plane plane = new Plane();

    private final String flightName;
    private final String company;
    private final String departureCountry;
    private final String arrivingCountry;
    private final int duration;
    private final String departureDate;

    private CargoFlight(Builder builder) {
        this.flightName = builder.flightName;
        this.company = builder.company;
        this.departureCountry = builder.departureCountry;
        this.arrivingCountry = builder.arrivingCountry;
        this.duration = builder.duration;
        this.departureDate = builder.departureDate;
        flightAnalysis();
    }
    public static class Builder {
        private String flightName;
        private String company;
        private String departureCountry;
        private String arrivingCountry;
        private int duration;
        private String departureDate;


        public Builder flightName(String flightName) {
            this.flightName = flightName;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder departureCountry(String departureCountry) {
            this.departureCountry = departureCountry;
            return this;
        }

        public Builder arrivingCountry(String arrivingCountry) {
            this.arrivingCountry = arrivingCountry;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder departureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public CargoFlight build() {
            return new CargoFlight(this);
        }
    }

    public String getFlightName() {
        return flightName;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartureCountry() {
        return departureCountry;
    }

    public String getArrivingCountry() {
        return arrivingCountry;
    }

    public int getDuration() {
        return duration;
    }

    public String getDepartureDate() {
        return departureDate;
    }


    @Override
    public void flyFrom(String airport) {
        airport = this.departureCountry;
        System.out.println(airport);
    }

    @Override
    public void flyTo(String airport) {
        System.out.println(airport);
        flightCleared();
    }

    public void flightAnalysis() {
        System.out.println("Flight " + this.flightName + " has " + plane.getSeats() + " seats" + " occupied of" + getDuration() + " with the number of " + getCompany() + " passengers");
    }

}
