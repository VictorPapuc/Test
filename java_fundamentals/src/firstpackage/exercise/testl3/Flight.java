package firstpackage.exercise.testl3;


//adauga 2 varaibile in clasa
// adauga o metoda de adaugare pasageri
//encapsulation
// metoda cu constructori

public class Flight {




    Flight() {
        passagengers = 0;
        seats = 150;
    }


    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passagengers = passagengers + f2.passagengers;
        return newFlight;
    }

    private int passagengers;
    private int seats;


    public void addPassanger() {
        if (passagengers < seats) {
        } else
            handleToMany();
    }

    private void handleToMany() {
        System.out.printf("Is too many");
    }


    public boolean hasRoom(Flight f2) {
        int total = passagengers + f2.passagengers;
        if (total <= seats)
            return true;
        else
            return false;
    }

}
