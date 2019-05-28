package firstpackage.exercise.testl3;

public class Dummy {

    public static void main(String[] args) {

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight1.addPassanger();
        System.out.println(flight2.hasRoom(flight2));

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        Flight lax3;

        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);

        System.out.println(lax1.createNewWithBoth(lax2));
    }


}
