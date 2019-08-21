package javatest.test.javafundamentals;

public class Test {


    // if care compara 2 valori
    // 2 declaratii de variabile primitive
    // operatori logici si conditionali exercitii

    public static void main(String[] args) {
        int room = 2;
        int people = 4;
        int result;

        if (room > people && people / room == people / 2) {
            System.out.println("bla bla ");
        } else if (room > people || people / room > people) {
            System.out.println("Do that");
        }
        result = room != 4 ? room / people : 1;
    }
}
