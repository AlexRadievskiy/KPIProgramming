package company;

public class ExceptionCheckerClass {
    static void ExceptionChecker(double[] a) {
        try {
            if (a == null) {
                throw new NullPointerException("a = null");
            }
            if (a.length == 0) {
                throw new IllegalArgumentException("length = 0");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}
