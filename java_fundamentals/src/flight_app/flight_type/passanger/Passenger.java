package flight_app.flight_type.passanger;

public class Passenger {

    private String name;
    private boolean priorityBoarding;
    private String seat;
    private String baggageType;

    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public static int getCounter() {
        return counter;
    }

    private static int counter = 0;

    private Passenger(Builder builder) {
        this.name = builder.name;
        this.priorityBoarding = builder.priorityBoarding;
        this.seat = builder.seat;
        this.baggageType = builder.bagaggeType;
        counter++;
    }

    public static class Builder {
        private String name;
        private boolean priorityBoarding;
        private String seat;
        private String bagaggeType;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder priorityBoarding(boolean priorityBoarding) {
            this.priorityBoarding = priorityBoarding;
            return this;
        }

        public Builder seat(String seat) {
            this.seat = seat;
            return this;
        }

        public Builder baggageType(String baggageType) {
            this.bagaggeType = bagaggeType;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }

    }

    public void addPackage(double h, double w, double d) {
        double size = h * w * d;
        if (hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("No space");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPriortiyBoarding() {
        return priorityBoarding;
    }

    public void setPriortiyBoarding(boolean priortiyBoarding) {
        this.priorityBoarding = priortiyBoarding;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getBaggageType() {
        return baggageType;
    }

    public void setBaggageType(String baggageType) {
        this.baggageType = baggageType;
    }


}
