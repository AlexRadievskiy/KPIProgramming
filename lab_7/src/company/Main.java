package company;

//ПЕРЕСДАЧА
//Переделать ExceptionCheckerClass
public class Main {

    public static void main(String[] args) {
        //СПОСОБЫ СОРТИРОВКИ:
        //0 - Insertion
        //1 - Selection
        //2 - Bubble
        int strMethod = 1;
        double[] a = null;

        try {
            ResultPrinter resultPrinter = new ResultPrinter();
            resultPrinter.PrintResult(a);
            ISortingStrategy strategy = new Strategy(strMethod);
            a = strategy.applySort(a);
            resultPrinter.PrintResult(a);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}