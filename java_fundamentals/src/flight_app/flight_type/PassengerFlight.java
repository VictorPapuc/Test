package flight_app.flight_type;
import flight_app.plane.Plane;

public class PassengerFlight extends Flight {

    private Plane plane = new Plane();

    private final String Name;
    private final String company;
    private final String departureCountry;
    private final String arrivingCountry;
    private final int duration;
    private final String departureDate;
    private final int passengers;

    private PassengerFlight(Builder builder) {
        this.Name = builder.Name;
        this.company = builder.company;
        this.departureCountry = builder.departureCountry;
        this.arrivingCountry = builder.arrivingCountry;
        this.duration = builder.duration;
        this.departureDate = builder.departureDate;
        this.passengers = builder.passengers;
        flightAnalysis();
    }

    public static class Builder {

        private String Name;
        private String company;
        private String departureCountry;
        private String arrivingCountry;
        private int duration;
        private String departureDate;
        private int passengers;

        public Builder Name(String Name) {
            this.Name = Name;
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

        public PassengerFlight build() {
            return new PassengerFlight(this);
        }
    }

    private int getFreeSeats() {
        return plane.getSeats() - getPassengers();
    }

    private boolean requireLifeJackets() {
        plane.setLifeVests(getFreeSeats());
        return false;
    }


    public String getName() {
        return Name;
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
        System.out.println(" " + this.Name + " has " + plane.getSeats() + " seats" + " occupied of" + getFreeSeats() + " with the number of " + getPassengers() + " passengers");
        System.out.println(requireLifeJackets());
    }
}
