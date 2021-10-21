package company;

public class InsertionSort {
    static void SecondSort(double[] b) {
        for (int j = 1; j < b.length; j++) {
            double c = b[j];
            int i = j - 1;
            while (i > -1 && b[i] < c) {
                b[i + 1] = b[i];
                i--;
            }
            b[i + 1] = c;
        }
    }
}
