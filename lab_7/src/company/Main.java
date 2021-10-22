package company;

public class Main {

    public static void main(String[] args) {
        //СПОСОБЫ СОРТИРОВКИ:
        //0 - Insertion
        //1 - Selection
        //2 - Bubble
        int strMethod = 2;
        double[] a = {-42, 324, -1, 0, 1, 2, -23, 4, 14, 6, 7, 8, 9, -10, 11, 12, 113, 14};

        ExceptionCheckerClass.ExceptionChecker(a);
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.PrintResult(a);
        ISortingStrategy strategy = new Strategy(strMethod);
        a = strategy.applySort(a);
        resultPrinter.PrintResult(a);

    }
}