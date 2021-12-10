package company;

public class SoccerGame {
    public static int[] getFlawless(int[][] soccerScore, int[] array) {
        Exception.finder(soccerScore);
        Exception.squareMatrixChecker(soccerScore);

        int teem = 0;
        int count = 0;
        int arraySizeCount = -1;

        for (int i = 0; i < soccerScore.length; i++) { //идём по строкам
            for (int j = 0; j < soccerScore[0].length; j++) { //идём по столбцам
                if (soccerScore[i][j] == 0) {
                    count++;
                }
            }
            teem++;
            arraySizeCount++;

            if (count <= 1) {
                array[arraySizeCount] = teem;
            }
            count = 0;
        }
        return array;
    }
}
