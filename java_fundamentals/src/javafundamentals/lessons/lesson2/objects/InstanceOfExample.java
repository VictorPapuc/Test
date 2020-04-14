package javafundamentals.lessons.lesson2.objects;

import javafundamentals.lessons.lesson2.getterandsetters.GetterAndSettersExample;

public class InstanceOfExample {

    private static int r;
    private static double p;
    private static ObjectExample objectExample = new ObjectExample();

    private static GetterAndSettersExample getterAndSettersExample = new GetterAndSettersExample();

    public static void main(String[] args) {
        objectExample.getInfo(r, p);

        getterAndSettersExample.getP();
        getterAndSettersExample.getR();
        getterAndSettersExample.setP(1);
        getterAndSettersExample.setR(2);
    }
}
