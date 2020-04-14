package javafundamentals.lessons.lesson1.operators;

public class Lesson1_2 {

    public static Lesson1_2 lesson1_2 = new Lesson1_2();

    public static void main(String[] args) {

        lesson1_2.incrementDecrement();

        System.out.println("This is the second method");
        lesson1_2.mathOperators(1, 1);

    }

    public void incrementDecrement() {
        int i = 0;
        //increment
        System.out.println(++i); // 1
        System.out.println(i); // 1
        System.out.println(i++); // 1
        System.out.println(i); // 2
    }

    public void mathOperators(int x, int y) {
        int result = 100;
        result /= x * y;

        result += x * y;

        result -= x * y;

        System.out.println(result);
    }

    public void mathematicOperations(int x, int y){

        int a = 100 ;
        int b = 22;
        int c = 40;


        int result = (a+c)-b;

        int result1 = (a+c-b*result)-a*b;

        int result2 = (a/c+b*result-result1)+a;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

}
