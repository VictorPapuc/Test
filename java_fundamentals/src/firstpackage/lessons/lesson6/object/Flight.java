package firstpackage.lessons.lesson6.object;

public class Flight {

    private int flightNumber;
    private char flightClass;


    public int getPuli() {
        return 20;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Flight))
            return false;
        Flight other = (Flight) o;
        return
                flightNumber == other.flightNumber &
                        flightClass == other.flightClass;

    }
}
