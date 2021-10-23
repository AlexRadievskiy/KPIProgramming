package company;

public class ExceptionCheckerClass {
    static void ArrayExceptionChecker(double[] a) {
        try {
            if (a == null) {
                throw new NullPointerException("a = null");
            }
            if (a.length == 0) {
                throw new IllegalArgumentException("a is empty");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }

    static void StrExceptionChecker(int strMethod) {
        try {
            if (strMethod != 0 | strMethod != 1 | strMethod != 2) {
                throw new IllegalArgumentException("Illegal strategy type");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}
