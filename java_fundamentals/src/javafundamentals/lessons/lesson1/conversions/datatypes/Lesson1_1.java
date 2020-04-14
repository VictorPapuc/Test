package javafundamentals.lessons.lesson1.conversions.datatypes;


public class  Lesson1_1 {

    public static void main(String[] args) {

        //Conversion String to integer
        String num1 = "1";
        int number = Integer.parseInt(num1);
        System.out.println(number);

        //Conversion integer to String
        int num2 = 2213;
        String number2 = String.valueOf(num2);
        System.out.println(number2);

        //Double to integer using cast
        double num3 = 1.2;
        int number3 = (int) num3;
        System.out.println(number3);

        //int to long
        int ival = 50;
        long lVal = ival;
        System.out.println(lVal);

    }
}
