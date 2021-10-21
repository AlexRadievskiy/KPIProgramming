package company;

public class ExceptionCheckerClass {
    static void ExceptionChecker(double[] a) {
        try {
            if (a == null || a.length == 0) {
                throw new NullPointerException("a = null");
            }

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}
