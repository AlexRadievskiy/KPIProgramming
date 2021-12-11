package company;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}};

//        int [][] matrix = {
//                {11,12,13,14},
//                {21,22,23,24},
//                {31,32,33,34},
//                {41,42,43,44},};

//        int[][] matrix = null;

        int[][] soccerScore = {
                {0, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 1, 0}};

        int[] array = new int[soccerScore.length];

        try {
            //Заданый массив
            for (int i = 0; i < matrix.length; i++) { //идём по строкам
                for (int j = 0; j < matrix[i].length; j++) { //идём по столбцам
                    System.out.print(" " + matrix[i][j] + " "); //вывод элемента
                }
                System.out.println();
            }
            System.out.println();

            ReplacingStrings.lolSwap(matrix);

            for (int i = 0; i < matrix.length; i++) { //идём по строкам
                for (int j = 0; j < matrix[i].length; j++) { //идём по столбцам
                    System.out.print(" " + matrix[i][j] + " "); //вывод элемента
                }
                System.out.println();
            }
            System.out.println();

            SoccerGame.getFlawless(soccerScore, array);

            for (int i = 0; i < SoccerGame.getFlawless(soccerScore, array).length; i++) {
                if (array[i] != 0)
                    System.out.println("Команда " + array[i] + " не имеет проиграшей");
            }

        } catch (NullPointerException e) {
            System.out.println("EXCEPTION! Array length is null " + e.getMessage());
        }
    }
}
