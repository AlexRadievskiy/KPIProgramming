package company;

public class ExceptionChecker {
    static void Checker(String text) {
            if (text == null) {
                throw new NullPointerException("Text = null");
            }
    }
}
