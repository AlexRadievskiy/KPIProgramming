package company;

public class SelectionSort {
    static void FirstSort(final double[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int maxElement = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[maxElement] < a[j]) {
                    maxElement = j;
                }
            }
            if (maxElement != i) {
                double t = a[i];
                a[i] = a[maxElement];
                a[maxElement] = t;
            }
        }
    }
}
