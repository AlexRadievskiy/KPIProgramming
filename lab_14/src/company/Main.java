package company;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {

            InputStreamReader reader = new InputStreamReader("C:\\Programming\\KPIProgmamming\\lab_14\\src\\company\\text.txt");
            FindLastShortestString.LastShortestString();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try(FileReader reader = new FileReader("C:\\Programming\\KPIProgmamming\\lab_14\\src\\company\\text.txt")) {
//
//        System.out.println(FindLastShortestString.LastShortestString());
//
//
//        } catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }

    }
}