package company;

public class ToLowerCaseClass {
    static String toLowerCase(String text) {
        ExceptionChecker.checker(text);
        String lowerCaseText = text.toLowerCase();
        return lowerCaseText;
    }
}
