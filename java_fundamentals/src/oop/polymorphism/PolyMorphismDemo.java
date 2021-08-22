package oop.polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet, Tweet");
    }
}

class Robin extends Bird {

    //overloading and overriding

    public void sing(String sound) {
        System.out.println("Lala, Lala");
    }

    public void sing(String sound, int second) {

    }
}

public class PolyMorphismDemo {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Robin b = new Robin();


        bird1.sing();
        b.sing("So");
        b.sing("s", 12);
    }
}
