package flight_app.exercise;

public class Test1L1 {

    //math operators
    //cast
    //variables
    //operator Precence


    public static void main(String[] args) {

        System.out.println(cast());
        var();

    }

    public static int cast() {
        int a = 4;
        int b = 5;
        long b1 = 10;
        double a2 = 10.2;
        float a3 = 10.2F;

        double p = (int) a + b + b1 + a2 + a3;
        int p1 = (int) p;

        return p1;
    }

    public static void var() {

        int a = 4;
        int b = 5;
        long b1 = 10;
        double a2 = 10.2;
        float a3 = 10.2F;
        Character s = 's';

        System.out.println((++a - b++));


    }


}
