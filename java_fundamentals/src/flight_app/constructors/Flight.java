package flight_app.constructors;

import flight_app.plane.Plane;

public class Flight {

    private Plane plane = new Plane();

    private final String flightName;
    private final String company;
    private final String departureCountry;
    private final String arrivingCountry;
    private final int duration;
    private final String departureDate;
    private final int passengers;

    private Flight(Builder builder) {
        this.flightName = builder.flightName;
        this.company = builder.company;
        this.departureCountry = builder.departureCountry;
        this.arrivingCountry = builder.arrivingCountry;
        this.duration = builder.duration;
        this.departureDate = builder.departureDate;
        this.passengers = builder.passengers;
    }

    public static class Builder {

        private String flightName;
        private String company;
        private String departureCountry;
        private String arrivingCountry;
        private int duration;
        private String departureDate;
        private int passengers;

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

        public Builder passengers(int passengers) {
            this.passengers = passengers;
            return this;
        }

        public Flight build() {
            return new Flight(this);
        }
    }

    private int getFreeSeats() {
        return plane.getSeats() - getPassengers();
    }

    private boolean requireLifeJackets() {
        plane.setLifeVests(getFreeSeats());
        return false;
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

    public int getPassengers() {
        return passengers;
    }

    public void flightAnalysis() {
        System.out.println("Flight " + this.flightName + " has " + plane.getSeats() + " seats" + " occupied of" + getFreeSeats() + " with the number of " + getPassengers() + " passengers");
        System.out.println(requireLifeJackets());
    }

}
