package firstpackage.lessons.lesson7;

public class CargoOnlyPilot extends Pilot {

    @Override
    public boolean canAccept(Flight f) {
        return f.getPassangers() == 0;
    }
}
