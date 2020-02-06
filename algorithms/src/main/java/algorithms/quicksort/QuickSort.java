package algorithms.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        Integer[] array = {1, 3, 2, 5, 4, 6, 8, 9, 7};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high) {

        //check empty or null array
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low > high) {
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];


        // make left < pivot and right > pivot

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


    public static void swap(Integer array[], int x, int y) {

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
