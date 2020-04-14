package javafundamentals.lessons.lesson4.flight;

public class Flight {

    private int passangers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }


    public Flight() {

    }

    public Flight(int flightNumber) {
        //   this(); // chain - si asa ca codul sa fi sigur ca va fi rulat in clasa respectiva
        this.flightNumber = flightNumber;


    }


    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;

    }

    void swap(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }

     void swap (int r){

    }

}

