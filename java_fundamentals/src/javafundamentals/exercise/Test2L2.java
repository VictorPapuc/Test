package javafundamentals.exercise;

public class Test2L2 {


    //if else if
    //array
    //for , for each
    //while
    //do

    public static void main(String[] args) {

        String[] m = {"Sablon", "sss", "sss"};

        for (String p : m) {
            System.out.println(p);
        }

        int r = 4;
        int s = 5;

        int[] s1 = new int[2];
        s1[0] = 2;
        s1[1] = 3;

        int o = s1.length;


        for (int i = 0; i <o; i++) {
            System.out.println(s1[i]);
        }

        do {

        } while (s < 5);

        if (r == 4) {

            System.out.println("yes");
        } else if (s < 4) {
            System.out.println("no");
        }


    }


}


