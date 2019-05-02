package firstpackage.lessons.lesson6;

import java.io.CharArrayReader;

public class CargoFlight extends Flight {


    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;


    @Override
    public int getSeats() {
        return 12;
    }

    public static void main(String[] args) {

        Flight f1 = new Flight();
        System.out.println(f1.getSeats());


        CargoFlight cf = new CargoFlight();
        System.out.println(cf.getSeats());


        Flight f2 = new CargoFlight();
        System.out.println((f2.getSeats()));



    }


    public void add1Package(double h, double w, double d) {
        double size = h * w * d;
        if (hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handeNoSpace();

    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }


    private void handeNoSpace() {
        System.out.printf("No space");
    }

}
