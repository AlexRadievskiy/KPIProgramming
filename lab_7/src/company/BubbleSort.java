package company;

public class BubbleSort implements ISortingStrategy {
    public double[] applySort(double[] a) {
        int j;
        boolean flag = true;
        double temp;

        while (flag) {
            flag = false;
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return a;
    }
}
