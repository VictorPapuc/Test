package flight_app.lessons.lesson6;

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




    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }


    private void handeNoSpace() {
        System.out.printf("No space");
    }

}
