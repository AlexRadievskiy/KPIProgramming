package company;

public class Main {

    public static void main(String[] args) {
        double[] a = {-42, 324, -1, 0, 1, 2, -23, 4, 14, 6, 7, 8, 9, -10, 11, 12, 113, 14};
        double[] b = {-10, -4, -1, 0, 53, 2, 45, 3, 23, 6, 47, 124, 9, -20, 11, 12, 325};

        ExceptionChecker(a);

        //Selection sort
        SelectionSort.FirstSort(a);
        for (double v : a) {
            System.out.print(v + ",\t");
        }

        System.out.println();

        //Insertion sort
        InsertionSort.SecondSort(b);
        for (double v : b) {
            System.out.print(v + ",\t");
        }

    }

    static void ExceptionChecker(double[] a) {
        try {
            if (a == null) {
                throw new NullPointerException("a = null");
            }
            if (a.length == 0) {
                throw new IllegalArgumentException("length = 0");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }

    static class SelectionSort {
        static void FirstSort(final double[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                int maxElement = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[maxElement] < a[j]) {
                        maxElement = j;
                    }
                } if (maxElement != i) {
                    double t = a[i];
                    a[i] = a[maxElement];
                    a[maxElement] = t;
                }
            }
        }
    }

    static class InsertionSort {
        static void SecondSort(double[] b) {
            for (int j = 1; j < b.length; j++) {
                double c = b[j];
                int i = j-1;
                while (i > -1 && b[i] < c) {
                    b[i+1] = b[i];
                    i--;
                }
                b[i+1] = c;
            }
        }
    }
}
