package company;

import java.util.Arrays;

public class ReplacingStrings {
    public static void lolSwap(int[][] matrix) {
        Exception.finder(matrix);

        int[][] tempFirst = new int[1][1];
        System.arraycopy(matrix,0, tempFirst, 0, 1);
        System.arraycopy(matrix,matrix.length-1, matrix, 0, 1);
        System.arraycopy(tempFirst,0, matrix, matrix.length-1, 1);
    }
}
