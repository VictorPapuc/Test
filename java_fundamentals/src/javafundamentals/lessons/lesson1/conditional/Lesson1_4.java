package javafundamentals.lessons.lesson1.conditional;

public class Lesson1_4 {

    public static void main(String[] args) {

        String[] f = {"Sablon", "sss ", "sssss"};

        //for each
        for (String s : f) {
            System.out.println(s);
        }

        int[] x = {1, 2, 3, 4};

        //for
        for (int y = 0; y <= x.length; y++) {
            System.out.println(y);
        }

        int loop = 4;

        //while
        while (loop == 4) {
            System.out.println("sss");
            loop++;
        }
        do {
            System.out.println("Sablon");
        }
        while (loop > 3);

        System.out.println("sss");

        while (loop < 3) ;

        //operator
        int a = 2;
        int b = 4;

        if (a > b) {
            System.out.println("yes");
        } else if (a < b) {
            System.out.println("Sablon");
        } else if (a == b) {
            System.out.println("no");
        } else {
            System.out.println("nnnoo");
        }

        if (a <= 4 && b >= 4) {
            System.out.println("yes");
        } else if (a == 4 || b < 3) {
            System.out.println("no");
        }

        if (a == b) {
            System.out.println("no");
        }

        if (a != b) {
            System.out.println("yes");

        } else if (a < 2 | b < 3) {
            System.out.println("no");
        } else if (a > 5 & b > 4) {
            System.out.println("nnn");
        }

        int val2 = 50;
        int val3 = 51;

        int result = val2 > val3 ? val2 : val3;

        int result1 = result == val2 - val3 ? val2 : val2;

        if (val2 > val3) {
            if (val2 < val3)
                System.out.println("what to do ");
        }

        double leftVal = 1.2;
        double rightVal = 1.3;
        char opCode = 'a';
        double results = 1.4;

        switch (opCode) {
            case 'a':
                results = leftVal + rightVal;
                break;
            case 's':
                results = leftVal + rightVal;
                break;
            case 'd':
                results = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                results = leftVal + rightVal;
                break;
            default:
                System.out.println("Error code , plm ");
                results = 0.0d;
                break;
        }

    }
}