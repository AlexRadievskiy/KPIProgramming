package company;

public class ExceptionChecker {
    void checker(String text) {
        if (text == null) {
            throw new NullPointerException("Text = null");
        }
    }
}
