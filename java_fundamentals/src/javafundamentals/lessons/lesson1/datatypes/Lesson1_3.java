package javafundamentals.lessons.lesson1.datatypes;

public class Lesson1_3 {

    public static void main(String[] args) {

        //String
        String[] f = {"Sablon", "sss ", "sssss"};

        for (String s : f) {
            System.out.println(s);
        }

        //float
        float[] s = {10.0f, 12.0f};
        float sum = 0.f;

        for (float s1 : s) {
            sum += s1;
        }

        //int
        int[] r = {1, 2, 3, 44};
        int a = r.length;

        //double
        double[] d = {1.2, 1.3, 1.4};

        //long
        long[] longN = {1022L, 123131L};

        //char
        char[] charName = {'B', 'A'};

        // boolean
        boolean value = true;

    }
}
