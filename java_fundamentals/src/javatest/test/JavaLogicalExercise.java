package javatest.test;

import java.util.ArrayList;

public class JavaLogicalExercise {

    // Write a program to print the pattern given below
    public static class NumberPattern {

        public static void main(String[] args) {

            for (int x = 1; x <= 5; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.println(y + "");
                }
                System.out.println();
            }
        }
    }
    //  Write a program to print Fibonacci Series up to count 10.
    public static class Fibbonaci {

        public static void main(String[] args) {
            int a = 0, b = 1, c, i, count = 0;
            System.out.println(a + " " + b);

            for (i = 2; i < count; i++) {
                c = a + b;
                System.out.println(" " + c);
                a = b;
                b = c;
            }
        }
    }

    // How to reverse a String in JAVA

    public static class ReverseString {

        //method one
        public static void main(String[] args) {

            ReverseString reverseString = new ReverseString();
            reverseString.reverserStringFirstMethod();
        }

        public void reverserStringFirstMethod() {
            StringBuffer a = new StringBuffer("Software Testing Material");
            System.out.println(a.reverse());
        }

        public void reverseStringAnotherMethod() {
            String input = "Software Testing Material";
            StringBuilder input1 = new StringBuilder();
            input1.append(input);
            input1 = input1.reverse();
            for (int i = 0; i < input1.length(); i++) {
                System.out.println(input1.charAt(i));
            }
        }
    }

    public static class LargestValue {

        public static void main(String[] args) {
            int[] arr = {28, 3, 15, 9, 17, 4, 23, 2};

            ArrayList<Integer> s = new ArrayList<>();
            s.add(1);

            int val = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > val) {
                    val = arr[i];
                }
            }
            System.out.println("Largest value in the Given Array is " + val);
        }
    }
}


