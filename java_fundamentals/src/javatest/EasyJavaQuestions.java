package javatest;

public class EasyJavaQuestions {

    //  Write a method that sums two numbers.
    public int test(int i, int d) {
        return i + d;
    }

    //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
    public int write(int n) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //factorial
    public Integer factorial(Integer n) {
        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }

//    Write a method that returns the index of the first occurrence of given integer in a list.
//    Assume that the index of the first element in the list is zero.
//    If the number does not exist return -1.

    public int search(Integer n, Integer[] list) {
        int index = -1;
        //int index = list.length;
        for (int i = 0; i < list.length; i++) {

            if (list[0].equals(n)) {
                index = i;
                break;
            }
        }

        return index;
    }
}
