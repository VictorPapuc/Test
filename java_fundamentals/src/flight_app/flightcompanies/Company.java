package flight_app.flightcompanies;

public enum Company {

    RYAN_AIR("Ryan air"),
    WIZZAIR("Wizz air");



    private String company;

    private Company(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
