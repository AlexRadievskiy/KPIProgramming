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
    public static void squareMatrixChecker(int[][] soccerScore) {
        for (int i = 0; i < soccerScore.length; i++) { //идём по строкам
            for (int j = 0; j < soccerScore[i].length; j++) { //идём по столбцам
                if (soccerScore.length != soccerScore[i].length) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
}