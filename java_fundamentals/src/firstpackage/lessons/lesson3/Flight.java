package firstpackage.lessons.lesson3;

public class Flight {

    private int passanger;
    private int seats;



    public int getPassanger() {
        return passanger;
    }

    public void setPassanger(int passanger) {
        this.passanger = passanger;
    }







    //    public boolean hasRoom(Flight f2) {
//        int total = this.passanger + f2.passanger;
//        return total <= seats;
//
//    }
//
//
//    public Flight createNewWithBot(Flight f2) {
//
//        Flight newFlight = new Flight();
//        newFlight.seats = seats;
//        newFlight.passanger = passanger + f2.passanger;
//        return newFlight;
//
//    }
//






//    public Flight() {
//        seats = 150;
//        passanger = 0;
//
//    }
//
//
//    public void add1Passenger() {
//        if (passanger < seats)
//            passanger += 1;
//        else
//            handleTooMany();
//    }
//
//    void handleTooMany() {
//     System.out.println("Too Many");
//    }
}
