package company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] a = {-42, 324, -1, 0, 1, 2, -23, 4, 14, 6, 7, 8, 9, -10, 11, 12, 113, 14};
        double[] b = {-10, -4, -1, 0, 53, 2, 45, 3, 23, 6, 47, 124, 9, -20, 11, 12, 325};

        ExceptionCheckerClass.ExceptionChecker(a);
        SortingStrategy strategy = source -> {
            Arrays.sort(source);
            return source;
        };
        strategy = new SelectionSort();

        //Selection sort
        b = strategy.applySort(b);
        for (double d : b) {
            System.out.print(d + ",\t");
        }
        System.out.println();
        //Insertion sort
        a = strategy.applySort(a);
        for (double d : a) {
            System.out.print(d + ",\t");
        }

    }
}
