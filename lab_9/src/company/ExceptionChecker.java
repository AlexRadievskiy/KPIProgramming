package company;

public class ExceptionChecker {
    static void checker(String text) {
        if (text == null) {
            throw new NullPointerException("Text = null");
        }
    }
}
