package company;

public class StrategyDeterminant implements ISortingStrategy {

    private final ISortingStrategy sorter;

    public StrategyDeterminant(int str) {
        sorter = createSorter(str);
    }

    private ISortingStrategy createSorter(int str){

        switch (str) {

            case 0:
                return new InsertionSort();
            case 1:
                return new SelectionSort();
            case 2:
                return new BubbleSort();
            default:
                throw new IllegalArgumentException("Illegal strategy type");
        }
    }

    @Override
    public double[] applySort(double[] source) {
        return sorter.applySort(source);
    }
}
