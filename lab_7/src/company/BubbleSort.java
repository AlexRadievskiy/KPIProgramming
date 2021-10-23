package company;

public class BubbleSort implements ISortingStrategy {
    public double[] applySort(double[] a) {
        int n = a.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(a[j-1] < a[j]){
                    double temporaryVar = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temporaryVar;
                }

            }
        }
        return a;
    }
}
