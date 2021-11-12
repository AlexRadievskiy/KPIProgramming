package company;

public class Strategy implements ISortingStrategy {

    private final ISortingStrategy sorter;

    public Strategy(int str) {
        sorter = createSorter(str);
    }

    private ISortingStrategy createSorter(int str) {

        return switch (str) {
            case 0 -> new InsertionSort();
            case 1 -> new SelectionSort();
            case 2 -> new BubbleSort();
            default -> throw new IllegalArgumentException("Illegal strategy type");
        };
    }

    @Override
    public double[] applySort(double[] source) {
        return sorter.applySort(source);
    }
}
