package company;

public class ExceptionCheckerClass {
    static void ArrayExceptionChecker(double[] a) {
        if (a == null) {
            throw new NullPointerException("a = null");
        }
        if (a.length == 0) {
            throw new IllegalArgumentException("a is empty");
        }
    }
}
