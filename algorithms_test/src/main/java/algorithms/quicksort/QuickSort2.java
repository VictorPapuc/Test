package algorithms.quicksort;

public class QuickSort2 {


    public static void main(String[] args) {

        int sir[] = {1, 32, 45, 353, 9, 53, 14};
        int x;
        for (int i = 0; i < sir.length - 1; i++) {
            for (int j = 1; j < sir.length; j++) {
                if (sir[j - 1] > sir[j]) {
                    x = sir[j - 1];
                    sir[j - 1] = sir[j];
                    sir[j] = x;
                }
            }

        }

        for (int i = 0; i < sir.length; i++) {
            System.out.println(sir[i]);
        }


    }
}

