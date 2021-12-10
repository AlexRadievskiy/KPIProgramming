package company;

public class SoccerGame {
    public static int[] getFlawless(int[][] soccerScore) {
        int teem = 0;
        int count = 0;

        for (int i = 0; i < soccerScore.length; i++) { //идём по строкам
            for (int j = 0; j < soccerScore[0].length; j++) { //идём по столбцам
                if (soccerScore[i][j] == 0) {
                    count++;
                }
            }
            teem++;

            if (count <= 1) {
                System.out.println("Команда " + teem + " прошла все матрчи без единого поражения!");
            }
            count = 0;
        }

        return null;
    }
}
