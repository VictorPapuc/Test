package javafundamentals.lessons.lesson6;

public class Flight {


    int passangers;

    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        cf.add1Package(1.0, 2.5, 3.0);

    }

    public int getSeats() {
        return 150;
    }

    public void add1Passanger() {

        if (hasSeating())
            passangers += 1;
        else
            handleToMany();
    }

    private boolean hasSeating() {
        return passangers < getSeats();
    }

    private boolean handleToMany() {
        return true;
    }

}
