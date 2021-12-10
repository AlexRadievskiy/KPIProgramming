package company;

public class Exception {
    public static void finder(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }
        if (matrix.length == 0) {
            throw new IllegalArgumentException();
        }
    }
}