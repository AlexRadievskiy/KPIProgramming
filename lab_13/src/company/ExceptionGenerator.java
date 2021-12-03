package company;

public class ExceptionGenerator {
    void checker(String videoTitle) {
        if (videoTitle == null) {
            throw new NullPointerException("Video title = null");
        }
    }
}
