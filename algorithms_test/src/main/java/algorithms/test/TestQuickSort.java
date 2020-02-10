package algorithms.test;

import java.util.Arrays;

public class TestQuickSort {

 /*

   1. Un array si o metoda main

   2. o metoda care sorteaza
        in metoda faci 2 conditii  :

            daca e null array
            daca valoarea nr lui low e mai mica decat high


   3. trebuie sa faci un pivot care sa fie numarul din mijlock al array-ului.

    */


    public static void main(String[] args) {

        Integer[] array = {1, 3, 5, 6, 13, 8, 4};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high) {


        if (arr.length == 0 || arr == null) {
            return;
        }

        if (low > high) {
            return;
        }


        int mid = low + (high - low) / 2;
        int pivot = arr[mid];


        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {

                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }

    }

    public static void swap(Integer[] array, int x, int y) {

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }

}
