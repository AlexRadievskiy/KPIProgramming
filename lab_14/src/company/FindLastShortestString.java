package company;

import java.io.FileInputStream;
import java.io.IOException;

public class FindLastShortestString {
    public static void LastShortestString(FileInputStream file) throws IOException {
        int c;
        while ((c = file.read()) != -1) {
            System.out.print((char) c);
        }
    }
}