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
}
//Нужна цепочка зависимостей