package company;

public class ReplacingStrings {
    public static void lolSwap(int[][] matrix) {
        Exception.finder(matrix);
        int tempFirst = matrix[0][0];
        int tempLast = matrix[matrix.length-1][matrix.length];

        matrix[matrix.length-1][matrix.length] = tempFirst;
        matrix[0][0] = tempLast;
    }
}
