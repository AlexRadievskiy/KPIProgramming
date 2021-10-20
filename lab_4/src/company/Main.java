package company;

public class Main {
    public static void main(String[] args) {
        try {
            double[] a = {-6, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//          double[] a = {-2, 1, 5};
//          double[] b = {};
            double[] b = {1, -1, 2, -2};

            if (a.length == 0) {
                throw new IllegalArgumentException("array a has no elements (class main)");
            }

//          Передача аргументов методам классов
            CalculateSum.calc(a);
            CalculateMaxDoubleElement.calc(a);
            ArraySum.calc(a, b);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("EXCEPTION:" + e.getMessage());
        }
    }

    //  Знайти суму від’ємних елементів
    static class CalculateSum {
        static double calc(double[] a) {
            double sumResult = 0;

            try {
                int negNums = 0;
                for (double var : a) {
                    if (var < 0) {
                        negNums++;
                        sumResult = sumResult + var;
                    }
                }

                if (negNums < 2) {
                    throw new IllegalArgumentException("Not enough negative elements (class CalculateSum)");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
            System.out.println("Sum of negative nums: " + sumResult);
            return sumResult;
        }
    }

    //  Знайти максимальний парний елемент масиву, індекс якого кратний 7
    static class CalculateMaxDoubleElement {
        static double calc(double[] a) {
            double maxDoubleElement;
            int doubleNubCount = 0;
            maxDoubleElement = a[0];

            try {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] % 2 == 0 && i % 7 == 0) {
                        if (a[i] > maxDoubleElement) {
                            doubleNubCount++;
                            maxDoubleElement = a[i];

                            if (doubleNubCount < 1) {
                                throw new IllegalArgumentException("The array has no numbers that satisfy the condition");
                            }

                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
            System.out.println("Max double element: " + maxDoubleElement);
            return maxDoubleElement;
        }
    }

    //  Задано  масиви А(n) та В(m). Сформувати масив С(n+m), елементами якого є n елементів масиву A,
//  за якими слідують m елементів масиву B.
    static class ArraySum {
        static double[] calc(double[] a, double[] b) {
            double[] c = new double[a.length + b.length];

            try {

                if (b.length == 0) {
                    throw new IllegalArgumentException("Array b has no elements (class ArraySum)");
                }

                int count = 0;
                System.out.print("Array C: ");
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i];
                    count++;
                }

                for (double v : b) {
                    c[count++] = v;
                }

                for (double v : c) System.out.print(v + " ");

            } catch (IllegalArgumentException e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
            return c;
        }
    }
}
