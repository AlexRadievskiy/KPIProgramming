package company;

public class InsertionSort implements ISortingStrategy {

    public double[] applySort(double[] a) {
        ExceptionCheckerClass.ArrayExceptionChecker(a);
        for (int j = 1; j < a.length; j++) {
            double c = a[j];
            int i = j - 1;
            while (i > -1 && a[i] < c) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = c;
        }
        return a;
    }
}
