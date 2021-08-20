package flight_app.plane;

public class Plane{

    private final int seats = 100;
    private int lifeVests;
    private String planeName;

    public int getSeats() {
        return seats;
    }

    public int getLifeVests() {
        return lifeVests;
    }

    public void setLifeVests(int lifeVests) {
        this.lifeVests = lifeVests;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }
}



