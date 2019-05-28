package firstpackage.lessons.lesson5;

import firstpackage.lessons.lesson4.flight.Passanger;

public class Flight {

    int seats = 50;
    int passangers;
    int maxCarryOns = seats * 2, totalCarryOns;


    public void add1Passanger() {
        if (hasSeating())
            passangers += 1;
        else
            handleTooMany();
    }

    public void add1Passanger(int bags) {

        if (hasSeating()) {
            add1Passanger();
            totalCarryOns += bags;
        }
    }

//multiple parameters.

    public void add1Passanger(Passanger ... String){


    }

    public void add1Passanger (Passanger p){


        add1Passanger();
    }


    public void handleTooMany() {

    }

    private boolean hasSeating() {
        return passangers < seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }


}
