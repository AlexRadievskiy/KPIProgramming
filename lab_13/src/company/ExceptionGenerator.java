package company;

import java.util.HashSet;

public class ExceptionGenerator {
    void checker(String videoTitle) {
        if (videoTitle == null) {
            throw new NullPointerException("Video title = null");
        }
    }
    void title(HashSet<Video> videoSet) throws MyException {
        if (videoSet.size() == 0) {
            throw new MyException(0, "message");
        }
    }
}
