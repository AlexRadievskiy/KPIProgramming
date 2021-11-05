package company;
//test
public class ToLowerCaseClass {
    static String toLowerCase(String text) {
        ExceptionChecker.Checker(text);
        String lowerCaseText = text.toLowerCase();

        return lowerCaseText;
    }
}
