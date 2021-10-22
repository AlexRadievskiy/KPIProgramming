package company;

public class ResultPrinter {
    public void PrintResult(double[] a) {

        for (double d : a) {
            System.out.print(d + ",\t");
        }
        System.out.println();
    }
}
